/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.trabalhoV2.demo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

 
 @Entity
@Table(name= "Quadra")
public class Quadra {
    
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codQuadra")
    private Integer codQuadra;
    
    @Column(name = "modalidades")       
    private String modalidades;
     
    @Column(name = "localidade")      
    private String localidade;
      
    @Column(name = "estrutura")        
    private String estrutura;
    
    @OneToMany
    private List<Colaborador> colaborador;

    public Quadra() {
    }

    public Quadra(Integer codQuadra, String modalidades, String localidade, String estrutura, List<Colaborador> colaborador) {
        this.codQuadra = codQuadra;
        this.modalidades = modalidades;
        this.localidade = localidade;
        this.estrutura = estrutura;
        this.colaborador = colaborador;
    }

    public Integer getCodQuadra() {
        return codQuadra;
    }

    public void setCodQuadra(Integer codQuadra) {
        this.codQuadra = codQuadra;
    }

    public String getModalidades() {
        return modalidades;
    }

    public void setModalidades(String modalidades) {
        this.modalidades = modalidades;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getEstrutura() {
        return estrutura;
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

    public List<Colaborador> getColaborador() {
        return colaborador;
    }

    public void setColaborador(List<Colaborador> colaborador) {
        this.colaborador = colaborador;
    }

    @Override
    public String toString() {
        return "Quadra{" + "codQuadra=" + codQuadra + ", modalidades=" + modalidades + ", localidade=" + localidade + ", estrutura=" + estrutura + ", colaborador=" + colaborador + '}';
    }
    
 
    
}
