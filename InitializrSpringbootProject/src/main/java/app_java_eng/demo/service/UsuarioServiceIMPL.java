/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_java_eng.demo.service;

import app_java_eng.demo.model.Usuario;
import app_java_eng.demo.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 @Service
public class UsuarioServiceIMPL implements UsuarioService {
    
    
    @Autowired
    private UsuarioRepository UsuarioRepository;
    
       @Override
        public List<Usuario> listausuario(){
        return UsuarioRepository.findAll();
    }
}
