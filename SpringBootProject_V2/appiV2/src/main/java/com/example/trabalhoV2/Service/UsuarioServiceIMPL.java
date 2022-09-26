/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.trabalhoV2.Service;

import com.example.trabalhoV2.demo.Usuario;
import com.example.trabalhoV2.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jptav
 */


@Service
public class UsuarioServiceIMPL  implements UsuarioService{

    
    
     @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public Usuario salvaUsuario(Usuario usuario) {
       return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> listaUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> getByIdUsuario(Integer codUsuario) {
          return usuarioRepository.findById(codUsuario);
    }

    @Override
    public Usuario atualizaUsuario(Usuario usuario) {
       return usuarioRepository.save(usuario);
    }

    @Override
    public void deleteByIdUsuario(Integer codUsuario) {
       usuarioRepository.deleteById(codUsuario);
    }
    
}
