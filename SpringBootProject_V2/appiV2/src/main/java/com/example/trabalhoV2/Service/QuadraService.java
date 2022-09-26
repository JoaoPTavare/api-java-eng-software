/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.trabalhoV2.Service;

 
 
import com.example.trabalhoV2.demo.Quadra;
import java.util.List;
import java.util.Optional;


public interface QuadraService {
    
    
    public Quadra salvaQuadra(Quadra quadra);
    
    public List<Quadra> listaQuadra();
    
    public Optional<Quadra> getByIdQuadra(Integer codQuadra);
    
    public Quadra atualizaQuadra(Quadra quadra);
    
    public void deleteByIdQuadra(Integer codQuadra); 
    
    
}
