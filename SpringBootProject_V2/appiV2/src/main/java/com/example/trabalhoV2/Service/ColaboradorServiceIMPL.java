/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.trabalhoV2.Service;

import com.example.trabalhoV2.demo.Colaborador;
import com.example.trabalhoV2.repository.ColaboradorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jptav
 */

@Service
public class ColaboradorServiceIMPL  implements ColaboradorService{

    
     @Autowired
    private ColaboradorRepository colaboradorRepository;
    
    
    @Override
    public Colaborador salvaColaborador(Colaborador colaborador) {
          return colaboradorRepository.save(colaborador);
    }

    @Override
    public List<Colaborador> listaColaborador() {
         return colaboradorRepository.findAll();
    }

    @Override
    public Optional<Colaborador> getByIdColaborador(Integer codColaborador) {
         return colaboradorRepository.findById(codColaborador);
    }

    @Override
    public Colaborador atualizaColaborador(Colaborador colaborador) {
            return colaboradorRepository.save(colaborador);
    }

    @Override
    public void deleteByIdColaborador(Integer codColaborador) {
              colaboradorRepository.deleteById(codColaborador);
    }
    
}
