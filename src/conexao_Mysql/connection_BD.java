/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao_Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author PEDRO
 */
public class connection_BD {
    
    public Connection connection_BD(){
            Connection conn = null; //Variavel Conn
            
        try {
                           // Codigo abaixo responsavel pela conexão:
            //jdbc = Drive de conexão | my  sql = forma como sera feita a autenticação
            //localhost = Indicando que sera a maquina local
            //3306 = A porta do Mysql 5.1
            //bancoTeste = Base de dados
            //?user&password = Usuario e senha necessaria para acessar o PhpMyAdmin
            
            String url = "jdbc:mysql://localhost:3306/controle_user?user=root&password=";
            conn = DriverManager.getConnection(url); //Responsavel pela conexão geral do BD
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "connection_BD" + erro.getMessage());
        }
        return conn;
    }
    
}
