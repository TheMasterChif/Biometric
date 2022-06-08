/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao_Mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PEDRO
 */
public class administracaoInsertBD {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<administracaoGetSet> lista = new ArrayList<>();
 
    
    public void cadastrarAdmin(administracaoGetSet objAdministracaoGetSet){
        String sql = "insert into administracao (nome_admin, data_Nascimento, senha_admin) values (?,?,?)";
        
        conn = new connection_BD().connection_BD();
        
        //VALIDAÇÃO
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objAdministracaoGetSet.getNome_Admin());
            pstm.setString(2, objAdministracaoGetSet.getData_Admin());
            pstm.setString(3, objAdministracaoGetSet.getSenha_Admin());
            
            pstm.execute(); //Executa a classe
            pstm.close(); //Fecha a classe
            
            JOptionPane.showMessageDialog(null,"Usuario cadastrado com sucesso!");
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "administracaoInsertBD" + erro);
        }
    } 
    
    
    
     public ArrayList<administracaoGetSet> pesquisarAdmin(){
        
        String sql = "select * from administracao";
        
            conn = new connection_BD().connection_BD();
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
        while(rs.next()){ //CONDIÇÃO : Enquanto houver linhas, retornara usuarios...
            administracaoGetSet objAdminGetSet = new administracaoGetSet();
            objAdminGetSet.setId_Admin(rs.getInt("id_Admin"));
            objAdminGetSet.setNome_Admin(rs.getString("nome_Admin"));
            objAdminGetSet.setData_Admin(rs.getString("data_Nascimento"));
            objAdminGetSet.setSenha_Admin(rs.getString("senha_Admin"));
                
            lista.add(objAdminGetSet);
                
            }    
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AdministracaoInsertBD - Metódo Pesquisar: "+erro);
        }
        
        return lista;
    }
     
    
    
    
    
    
    public void alterarAdmin(administracaoGetSet objAdministracaoGetSet){
        String sql = "update administracao set nome_admin = ? ,data_Nascimento = ?, senha_admin = ? where id_admin = ?";
        
        conn = new connection_BD().connection_BD();
        
        try{
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objAdministracaoGetSet.getNome_Admin());          
            pstm.setString(2, objAdministracaoGetSet.getData_Admin());
            pstm.setString(3, objAdministracaoGetSet.getSenha_Admin());
            pstm.setInt(4, objAdministracaoGetSet.getId_Admin());
            
            pstm.execute();
            pstm.close();
        
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "alterarAdmin : "+erro);
        }      
    }
    
    
    
    public void deletarAdmin(administracaoGetSet objAdministracaoGetSet){
        String sql = "delete from administracao where id_admin = ?";
        
        conn = new connection_BD().connection_BD();
        
        try{
            
            pstm = conn.prepareStatement(sql); 
            pstm.setInt(1, objAdministracaoGetSet.getId_Admin());
            
            
            pstm.execute();
            pstm.close();
        
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "deletarAdmin : "+erro);
        }
    
    }
    
  }  
    
