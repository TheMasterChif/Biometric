package conexao_Mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 */


//Inseri os dados no banco de dados (Cadastro)
public class alunosInsertB{
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<alunosGetSet> lista = new ArrayList<>();
 
    
    public void cadastrarAlunos(alunosGetSet objAlunoGetSet){           //CADASTRAR 1° ANO
        String sql = "insert into alunos (nome_aluno, matricula, turma, ano_inscricao,biometria,foto,data) values (?,?,?,?,?,?,?)";
        
        conn = new connection_BD().connection_BD();
        
        //VALIDAÇÃO
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objAlunoGetSet.getNome_aluno());
            pstm.setString(2, objAlunoGetSet.getMatricula());
            pstm.setString(3, objAlunoGetSet.getTurma());
            pstm.setString(4, objAlunoGetSet.getAno());
            pstm.setByte(5, objAlunoGetSet.getBiometria());
            pstm.setByte(6, objAlunoGetSet.getFoto());
            pstm.setString(7, objAlunoGetSet.getData());
            
            
            pstm.execute(); //Executa a classe
            pstm.close(); //Fecha a classe
            
            JOptionPane.showMessageDialog(null,"Usuario cadastrado com sucesso!");
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "alunosInsertBD" + erro);
        }
    } 
    
    //CRIAÇÃO, ALTERAÇÃO E EXCLUSAO DE USUÁRIO 1° ANO
    
    //Pesquisa e exibi todos os usuarios do banco na tabela
     public ArrayList<alunosGetSet> pesquisarAluno1(){          //PESQUISAR 1° ANO
        
        alunosGetSet objAlunoGetSet2 = new alunosGetSet();
        String data = objAlunoGetSet2.getData();
         
        String sql = "select * from alunos where ano_inscricao = data";
        
            conn = new connection_BD().connection_BD();
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
        while(rs.next()){ //CONDIÇÃO : Enquanto houver linhas, retornara usuarios...
            alunosGetSet objAlunoGetSet = new alunosGetSet();
            objAlunoGetSet.setId_aluno(rs.getInt("id_aluno"));
            objAlunoGetSet.setNome_aluno(rs.getString("nome_aluno"));
            objAlunoGetSet.setMatricula(rs.getString("matricula"));
            objAlunoGetSet.setTurma(rs.getString("turma"));
             objAlunoGetSet.setAno(rs.getString("ano_inscricao"));
            //objAlunoGetSet.setBiometria(rs.getString("biometria"));
            //objAlunoGetSet.setFoto(rs.getString("foto"));
                
            lista.add(objAlunoGetSet); 
            }    
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "alunosInsertBD - Metódo Pesquisar: "+erro);
        }
        
        return lista;
    }
     
     public void alterarAluno1(alunosGetSet objAlunoGetSet){             //ALTERAR 1° ANO
        String sql = "update alunos set nome_aluno = ? ,matricula = ?, turma = ?, ano_inscricao = ? where id_aluno = ?";
        
        conn = new connection_BD().connection_BD();
        
        try{
            
            pstm = conn.prepareStatement(sql); 
            pstm.setString(1, objAlunoGetSet.getNome_aluno());          
            pstm.setString(2, objAlunoGetSet.getMatricula());
            pstm.setString(3, objAlunoGetSet.getTurma());
            pstm.setString(4, objAlunoGetSet.getAno());
            pstm.setInt(5, objAlunoGetSet.getId_aluno());
            
            
            pstm.execute();
            pstm.close();
        
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "alterarAluno : "+erro);
        }   
    }
   
    public void deletarAluno1(alunosGetSet objAlunoGetSet){             //DELETAR 1° ANO
        String sql = "delete from alunos where id_aluno = ?";
        
        conn = new connection_BD().connection_BD();
        
        try{
            
            pstm = conn.prepareStatement(sql); 
            pstm.setInt(1, objAlunoGetSet.getId_aluno());
            
            
            pstm.execute();
            pstm.close();
        
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "deletarAluno : "+erro);
        }
    }
     
////////////////////////////////////////////////////////////////////////////////////////////////
     
     
     
     
     
    //CRIAÇÃO, ALTERAÇÃO E EXCLUSAO DE USUÁRIO 2° ANO
    
   
     public ArrayList<alunosGetSet> pesquisarAluno2(){          //PESQUISAR 2° ANO
        
        alunosGetSet objAlunoGetSet2 = new alunosGetSet();
        String data = objAlunoGetSet2.getData();
         
        String sql = "select * from alunos where ano_inscricao = data - 1";
        
            conn = new connection_BD().connection_BD();
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
        while(rs.next()){ //CONDIÇÃO : Enquanto houver linhas, retornara usuarios...
            alunosGetSet objAlunoGetSet = new alunosGetSet();
            objAlunoGetSet.setId_aluno(rs.getInt("id_aluno"));
            objAlunoGetSet.setNome_aluno(rs.getString("nome_aluno"));
            objAlunoGetSet.setMatricula(rs.getString("matricula"));
            objAlunoGetSet.setTurma(rs.getString("turma"));
             objAlunoGetSet.setAno(rs.getString("ano_inscricao"));
            //objAlunoGetSet.setBiometria(rs.getString("biometria"));
            //objAlunoGetSet.setFoto(rs.getString("foto"));
                
            lista.add(objAlunoGetSet); 
            }    
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "alunosInsertBD - Metódo Pesquisar: "+erro);
        }
        
        return lista;
    }
     
 
    public void alterarAluno2(alunosGetSet objAlunoGetSet){             //ALTERAR 2° ANO
        String sql = "update alunos set nome_aluno = ? ,matricula = ?, turma = ?, ano_inscricao = ? where id_aluno = ?";
        
        conn = new connection_BD().connection_BD();
        
        try{
            
            pstm = conn.prepareStatement(sql); 
            pstm.setString(1, objAlunoGetSet.getNome_aluno());          
            pstm.setString(2, objAlunoGetSet.getMatricula());
            pstm.setString(3, objAlunoGetSet.getTurma());
            pstm.setString(4, objAlunoGetSet.getAno());
            pstm.setInt(5, objAlunoGetSet.getId_aluno());
            
            
            pstm.execute();
            pstm.close();
        
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "alterarAluno : "+erro);
        }   
    }
   
    public void deletarAluno2(alunosGetSet objAlunoGetSet){             //DELETAR 2° ANO
        String sql = "delete from alunos where id_aluno = ?";
        
        conn = new connection_BD().connection_BD();
        
        try{
            
            pstm = conn.prepareStatement(sql); 
            pstm.setInt(1, objAlunoGetSet.getId_aluno());
            
            
            pstm.execute();
            pstm.close();
        
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "deletarAluno : "+erro);
        }
    
    }
    
    
    //CRIAÇÃO, ALTERAÇÃO E EXCLUSAO DE USUÁRIO 3° ANO
    
   
     public ArrayList<alunosGetSet> pesquisarAluno3(){          //PESQUISAR 3° ANO
        
        alunosGetSet objAlunoGetSet2 = new alunosGetSet();
        String data = objAlunoGetSet2.getData();
         
        String sql = "select * from alunos where ano_inscricao = data - 2";
        
            conn = new connection_BD().connection_BD();
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
        while(rs.next()){ //CONDIÇÃO : Enquanto houver linhas, retornara usuarios...
            alunosGetSet objAlunoGetSet = new alunosGetSet();
            objAlunoGetSet.setId_aluno(rs.getInt("id_aluno"));
            objAlunoGetSet.setNome_aluno(rs.getString("nome_aluno"));
            objAlunoGetSet.setMatricula(rs.getString("matricula"));
            objAlunoGetSet.setTurma(rs.getString("turma"));
             objAlunoGetSet.setAno(rs.getString("ano_inscricao"));
            //objAlunoGetSet.setBiometria(rs.getString("biometria"));
            //objAlunoGetSet.setFoto(rs.getString("foto"));
                
            lista.add(objAlunoGetSet); 
            }    
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "alunosInsertBD - Metódo Pesquisar: "+erro);
        }
        
        return lista;
    }
     
 
    public void alterarAluno3(alunosGetSet objAlunoGetSet){             //ALTERAR 3° ANO
        String sql = "update alunos set nome_aluno = ? ,matricula = ?, turma = ?, ano_inscricao = ? where id_aluno = ?";
        
        conn = new connection_BD().connection_BD();
        
        try{
            
            pstm = conn.prepareStatement(sql); 
            pstm.setString(1, objAlunoGetSet.getNome_aluno());          
            pstm.setString(2, objAlunoGetSet.getMatricula());
            pstm.setString(3, objAlunoGetSet.getTurma());
            pstm.setString(4, objAlunoGetSet.getAno());
            pstm.setInt(5, objAlunoGetSet.getId_aluno());
            
            
            pstm.execute();
            pstm.close();
        
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "alterarAluno : "+erro);
        }   
    }
   
    public void deletarAluno3(alunosGetSet objAlunoGetSet){             //DELETAR 3° ANO
        String sql = "delete from alunos where id_aluno = ?";
        
        conn = new connection_BD().connection_BD();
        
        try{
            
            pstm = conn.prepareStatement(sql); 
            pstm.setInt(1, objAlunoGetSet.getId_aluno());
            
            
            pstm.execute();
            pstm.close();
        
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "deletarAluno : "+erro);
        }
    
    }
    

    
    
    
    public ArrayList<alunosGetSet> frequencia(){          //PESQUISAR 1° ANO
        
        alunosGetSet objAlunoGetSet = new alunosGetSet();
        String turma1 = objAlunoGetSet.getTurma();
        String serie = objAlunoGetSet.getAno();
         
        String sql = "select * from alunos where turma = turma1";
        
            conn = new connection_BD().connection_BD();
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
        while(rs.next()){ //CONDIÇÃO : Enquanto houver linhas, retornara usuarios...
            alunosGetSet objAlunoGetSet1 = new alunosGetSet();
            objAlunoGetSet1.setNome_aluno(rs.getString("nome_aluno"));
            objAlunoGetSet1.setMatricula(rs.getString("matricula"));
            objAlunoGetSet1.setTurma(rs.getString("turma"));
             objAlunoGetSet1.setAno(rs.getString("ano_inscricao"));
            //objAlunoGetSet.setBiometria(rs.getString("biometria"));
            //objAlunoGetSet.setFoto(rs.getString("foto"));
                
            lista.add(objAlunoGetSet1); 
            }    
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "alunosInsertBD - Metódo Pesquisar: "+erro);
        }
        
        return lista;
    }
    
    
    
    
    
    
    

   
  }  
    
