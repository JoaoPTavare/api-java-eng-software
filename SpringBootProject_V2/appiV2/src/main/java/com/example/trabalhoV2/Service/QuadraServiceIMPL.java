/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.trabalhoV2.Service;

import com.example.trabalhoV2.demo.Quadra;
import com.example.trabalhoV2.repository.QuadraRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jptav
 */


@Service
public class QuadraServiceIMPL implements QuadraService{
    
    @Autowired
    private QuadraRepository quadraRepository;
    
    @Override
    public Quadra salvaQuadra(Quadra quadra) {
        return quadraRepository.save(quadra);
    }

    @Override
    public List<Quadra> listaQuadra() {
         return quadraRepository.findAll();
    }

    @Override
    public Optional<Quadra> getByIdQuadra(Integer codQuadra) {
              return quadraRepository.findById(codQuadra);
    }

    @Override
    public Quadra atualizaQuadra(Quadra quadra) {
              return quadraRepository.save(quadra);
    }

    @Override
    public void deleteByIdQuadra(Integer codQuadra) {
           quadraRepository.deleteById(codQuadra);
    }
    
}
