/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao_Mysql;

/**
 *
 * @author PEDRO
 */
public class alunosGetSet {
    private String nome_aluno, matricula, turma,ano,data,frequencia;

    public String getData() {
        return data;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public void setData(String data) {
        this.data = data;
    }
    private byte biometria, foto;
    private int id_aluno;

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTurma() {
        return turma;
    }

    
    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

     public byte getBiometria() {
        return biometria;
    }

    public void setBiometria(byte biometria) {
        this.biometria = biometria;
    }

    public byte getFoto() {
        return foto;
    }

    public void setFoto(byte foto) {
        this.foto = foto;
    }

   
    
}
