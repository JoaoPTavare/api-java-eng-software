/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_java_eng.demo.model;

/**
 *
 * @author jptav
 */
public class usuario {
    
    private Integer codUsuario;
    private String nome;
    private String cpf;
    private String email;
    private String tell;

    public usuario() {
    }

    public usuario(Integer codUsuario, String nome, String cpf, String email, String tell) {
        this.codUsuario = codUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.tell = tell;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    @Override
    public String toString() {
        return "usuario{" + "codUsuario=" + codUsuario + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", tell=" + tell + '}';
    }
    
    
    
    
    
    
}
