/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao_Mysql;

/**
 *
 * @author PEDRO
 */
public class administracaoGetSet {
    private int id_Admin;
    private String nome_Admin, senha_Admin, data_Admin;

    public int getId_Admin() {
        return id_Admin;
    }

    public void setId_Admin(int id_Admin) {
        this.id_Admin = id_Admin;
    }
    

    public String getData_Admin() {
        return data_Admin;
    }

    public void setData_Admin(String data_Admin) {
        this.data_Admin = data_Admin;
    }


    public String getNome_Admin() {
        return nome_Admin;
    }

    public String getSenha_Admin() {
        return senha_Admin;
    }


    public void setNome_Admin(String nome_Admin) {
        this.nome_Admin = nome_Admin;
    }

    public void setSenha_Admin(String senha_Admin) {
        this.senha_Admin = senha_Admin;
    }
    
}
