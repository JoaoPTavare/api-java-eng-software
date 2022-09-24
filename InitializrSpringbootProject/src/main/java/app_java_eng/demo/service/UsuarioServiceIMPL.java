/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_java_eng.demo.service;

import app_java_eng.demo.model.Usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app_java_eng.demo.repository.UsuarioRepository;

@Service
public class UsuarioServiceIMPL implements UsuarioService {
    
    
    @Autowired
    private UsuarioRepository UsuarioRepository;
    
    
    
    //para voltyar tods os usuario
    
       @Override
        public List<Usuario> listausuario(){
        return UsuarioRepository.findAll();
    }
        
  

    @Override
    public Usuario salvaUsuario(Usuario usuario) {
        return UsuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> getByIdUsuario(Integer codUsuario) {
        return UsuarioRepository.findById(codUsuario); 
    }

    @Override
    public Usuario atualizaUsuario(Usuario usuario) {
          return UsuarioRepository.save(usuario); 
    }

    @Override
    public void deleteByIdUsuario(Integer codUsuario) {
      UsuarioRepository.deleteById(codUsuario);
    }

   
        
   
     
        
        
        
}
