package com.example.trabalhoV2.controller;


import com.example.trabalhoV2.Service.QuadraService;
import com.example.trabalhoV2.demo.Quadra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api")
public class QuadraController {


    @Autowired
    private QuadraService quadraService;


    @GetMapping("/colaborador")
    public ResponseEntity<List<Quadra>> listaQuadra(){
        return ResponseEntity.status(HttpStatus.OK).body(quadraService.listaQuadra());
    }

    @GetMapping("colaborador/{codproduto}")
    public ResponseEntity<Optional<Quadra>> getByIdQuadra(@PathVariable Integer codproduto){
        return ResponseEntity.status(HttpStatus.OK).body(quadraService.getByIdQuadra(codproduto));
    }

    @PostMapping("colaborador")
    public ResponseEntity<Quadra> salvaQuadra(@RequestBody Quadra quadra){
        return ResponseEntity.status(HttpStatus.CREATED).body(quadraService.salvaQuadra(quadra));
    }

    @PutMapping("colaborador")
    public ResponseEntity<Quadra> atualizaQuadra(@RequestBody Quadra quadra){
        return ResponseEntity.status(HttpStatus.OK).body(quadraService.atualizaQuadra(quadra));
    }

    @DeleteMapping("colaborador/{codproduto}")
    public ResponseEntity<String> deleteByIdColaborador(@PathVariable Integer codQuadra){
        quadraService.deleteByIdQuadra(codQuadra);
        return ResponseEntity.status(HttpStatus.OK).body("Quadra removido com sucesso");
    }


}

