/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.trabalhoV2.Service;

import com.example.trabalhoV2.demo.Colaborador;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author jptav
 */
public interface ColaboradorService {
    
    public Colaborador salvaColaborador(Colaborador colaborador);
    
    public List<Colaborador> listaColaborador();
    
    public Optional<Colaborador> getByIdColaborador(Integer codColaborador);
    
    public Colaborador atualizaColaborador(Colaborador colaborador);
    
    public void deleteByIdColaborador(Integer codColaborador);   
    
    
}
