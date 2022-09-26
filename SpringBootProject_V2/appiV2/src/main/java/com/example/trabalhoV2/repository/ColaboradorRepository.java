/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.trabalhoV2.repository;

import com.example.trabalhoV2.demo.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jptav
 */
public interface ColaboradorRepository   extends JpaRepository<Colaborador, Integer>{
    
}
