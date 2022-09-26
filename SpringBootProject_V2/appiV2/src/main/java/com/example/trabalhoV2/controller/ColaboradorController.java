/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.trabalhoV2.controller;

import com.example.trabalhoV2.Service.ColaboradorService;
import com.example.trabalhoV2.demo.Colaborador;
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
public class ColaboradorController {
    
    @Autowired
    private ColaboradorService colaboradorService;
     
    
    
    
        @GetMapping("/colaborador")
    public ResponseEntity<List<Colaborador>> listaColaborador(){
        return ResponseEntity.status(HttpStatus.OK).body(colaboradorService.listaColaborador());
    }
    
    @GetMapping("colaborador/{codproduto}")
    public ResponseEntity<Optional<Colaborador>> getByIdColaborador(@PathVariable Integer codproduto){
        return ResponseEntity.status(HttpStatus.OK).body(colaboradorService.getByIdColaborador(codproduto));
    }

    @PostMapping("colaborador")
    public ResponseEntity<Colaborador> salvaColaborador(@RequestBody Colaborador colaborador){
        return ResponseEntity.status(HttpStatus.CREATED).body(colaboradorService.salvaColaborador(colaborador));
    }

    @PutMapping("colaborador")
    public ResponseEntity<Colaborador> atualizaColaborador(@RequestBody Colaborador colaborador){
        return ResponseEntity.status(HttpStatus.OK).body(colaboradorService.atualizaColaborador(colaborador));
    }
    
    @DeleteMapping("colaborador/{codproduto}")
    public ResponseEntity<String> deleteByIdColaborador(@PathVariable Integer codColaborador){
        colaboradorService.deleteByIdColaborador(codColaborador);
        return ResponseEntity.status(HttpStatus.OK).body("Produto removido com sucesso");
    }
    
    
    
    
    
}
