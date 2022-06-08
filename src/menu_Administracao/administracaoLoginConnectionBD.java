 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_Administracao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import conexao_Mysql.administracaoGetSet;


//ESSE CÓDIGO É RESPONSAVEL POR BUSCAR O LOGIN NO BANCO DE DADOS E COMPARAR COM O LOGIN DA TELA LOGIN_ADMINISTRACAO.JAVA
//CASO NÃO RETORNE NADA, ENVIARA UMA MSG E RETORNARA VAZIO



/**
 *
 * @author PEDRO
 */
public class administracaoLoginConnectionBD {
    
    Connection conn;
    
    public ResultSet autenticacaoUser(administracaoGetSet objAdmin){
        conn = new conexao_Mysql.connection_BD().connection_BD(); //Chama a classe de conexão e o método connection_BD;
        
        try {
            String sql = "select * from administracao WHERE nome_admin = ? and senha_admin = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objAdmin.getNome_Admin());//No primeiro ponto de interrogação vou setar algum valor
            pstm.setString(2, objAdmin.getSenha_Admin());//No segundo ponto de interrogação vou setar algum valor
            
            ResultSet rs = pstm.executeQuery();
            return rs;
                    
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "usuarioConnection: " + erro);
            return null;
        }
    }
    
}
