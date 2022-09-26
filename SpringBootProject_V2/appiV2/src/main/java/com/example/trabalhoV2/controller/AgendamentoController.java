/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.trabalhoV2.controller;

import com.example.trabalhoV2.Service.AgendamentoService;
import com.example.trabalhoV2.demo.Agendamento;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jptav
 */

@RestController
@RequestMapping("/api")
public class AgendamentoController {
    
    
     @Autowired
    private AgendamentoService agendamentoService;
    
    @GetMapping("/agendadamento")
    public ResponseEntity<List<Agendamento>> listaProdutos(){
        return ResponseEntity.status(HttpStatus.OK).body(agendamentoService.listaAgendamento());
    }
    
    @GetMapping("agendadamento/{codAgendamento}")
    public ResponseEntity<Optional<Agendamento>> getByIdProduto(@PathVariable Integer codAgendamento){
        return ResponseEntity.status(HttpStatus.OK).body(agendamentoService.getByIdAgendamento(codAgendamento));
    }

    @PostMapping("agendadamento")
    public ResponseEntity<Agendamento> salvaAgendamento(@RequestBody Agendamento agendadamento){
        return ResponseEntity.status(HttpStatus.CREATED).body(agendamentoService.salvaAgendamento(agendadamento));
    }

    @PutMapping("agendadamento")
    public ResponseEntity<Agendamento> atualizaAgendamento(@RequestBody Agendamento agendamento){
        return ResponseEntity.status(HttpStatus.OK).body(agendamentoService.atualizaAgendamento(agendamento));
    }
    
    @DeleteMapping("agendadamento/{codAgendamento}")
    public ResponseEntity<String> deleteByIdProduto(@PathVariable Integer codAgendamento){
        agendamentoService.deleteByIdAgendamento(codAgendamento);
        return ResponseEntity.status(HttpStatus.OK).body("Produto removido com sucesso");
    }
    
}
