/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.trabalhoV2.controller;

import com.example.trabalhoV2.Service.UsuarioService;
import com.example.trabalhoV2.demo.Usuario;
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
public class UsuarioController {
    
    
   @Autowired
    private UsuarioService usuarioService;
    
   @GetMapping("/usuario")
    public ResponseEntity<List<Usuario>> listaUsuarios(){
    return ResponseEntity.status(HttpStatus.OK).body(usuarioService.listaUsuario());
    }
    
    @GetMapping("Usuario/{codUsuario}")
    public ResponseEntity<Optional<Usuario>> getByIdUsuario(@PathVariable Integer codUsuario){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.getByIdUsuario(codUsuario));
    }

    @PostMapping("usuario")
    public ResponseEntity<Usuario> salvaUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.salvaUsuario(usuario));
    }

    @PutMapping("usuario")
    public ResponseEntity<Usuario> atualizaUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.atualizaUsuario(usuario));
    }
    
    @DeleteMapping("usuario/{codUsuario}")
    public ResponseEntity<String> deleteByIdUsuario(@PathVariable Integer codUsuario){
        usuarioService.deleteByIdUsuario(codUsuario);
        return ResponseEntity.status(HttpStatus.OK).body("Usuario removido com sucesso");
    }
    
}
