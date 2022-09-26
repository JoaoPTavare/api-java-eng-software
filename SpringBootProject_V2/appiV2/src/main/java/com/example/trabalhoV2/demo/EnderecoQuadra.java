/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.trabalhoV2.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EnderecoQuadra") 
public class EnderecoQuadra {
    
    @Id
    @Column(name = "codEndereco")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codEndereco;
        
    @Column(name = "endereco")
    private String endereco;
    
    @Column(name = "NumEndereco")
    private Integer numEndereco;
    
    
    @OneToOne
private Colaborador colaborar;

    public EnderecoQuadra() {
    }

    public EnderecoQuadra(Integer codEndereco, String endereco, Integer numEndereco, Colaborador colaborar) {
        this.codEndereco = codEndereco;
        this.endereco = endereco;
        this.numEndereco = numEndereco;
        this.colaborar = colaborar;
    }

    public Integer getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(Integer codEndereco) {
        this.codEndereco = codEndereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumEndereco() {
        return numEndereco;
    }

    public void setNumEndereco(Integer numEndereco) {
        this.numEndereco = numEndereco;
    }

    public Colaborador getColaborar() {
        return colaborar;
    }

    public void setColaborar(Colaborador colaborar) {
        this.colaborar = colaborar;
    }

    @Override
    public String toString() {
        return "EnderecoQuadra{" + "codEndereco=" + codEndereco + ", endereco=" + endereco + ", numEndereco=" + numEndereco + ", colaborar=" + colaborar + '}';
    }
    
    
    
    
}
