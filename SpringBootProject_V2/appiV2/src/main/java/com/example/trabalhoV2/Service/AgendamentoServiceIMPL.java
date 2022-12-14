/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.trabalhoV2.Service;

import com.example.trabalhoV2.demo.Agendamento;
import com.example.trabalhoV2.repository.AgendamentoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jptav
 */

@Service
public class AgendamentoServiceIMPL  implements AgendamentoService{

    @Autowired
    private AgendamentoRepository agendamentoRepository ;
    
    
    @Override
    public Agendamento salvaAgendamento(Agendamento agendamento) {
      return agendamentoRepository.save(agendamento);
    }

    @Override
    public List<Agendamento> listaAgendamento() {
        return agendamentoRepository.findAll();// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Agendamento> getByIdAgendamento(Integer codAgendamento) {
      return agendamentoRepository.findById(codAgendamento);
    }

    @Override
    public Agendamento atualizaAgendamento(Agendamento agendamento) {
         return agendamentoRepository.save(agendamento);
    }

    @Override
    public void deleteByIdAgendamento(Integer codAgendamento) {
        agendamentoRepository.deleteById(codAgendamento);
    }
    
    
    
    
}
