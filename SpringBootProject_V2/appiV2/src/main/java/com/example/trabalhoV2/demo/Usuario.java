 
package com.example.trabalhoV2.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jptav
 */


@Entity
@Table(name= "Usuario")
public class Usuario {
    
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codUsuario")  
    private Integer codUsuario;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "cpf")
    private String cpf;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "tell")
    private String tell; 

    public Usuario() {
    }
    
    
    public Usuario(Integer codUsuario, String nome, String cpf, String email, String tell) {
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
        return "Usuario{" + "codUsuario=" + codUsuario + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", tell=" + tell + '}';
    }

    
    
    
    
    
    
}
