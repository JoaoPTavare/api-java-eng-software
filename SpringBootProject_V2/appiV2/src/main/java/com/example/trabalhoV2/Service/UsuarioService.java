/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.trabalhoV2.Service;

import com.example.trabalhoV2.demo.Usuario;
import java.util.List;
import java.util.Optional;


public interface UsuarioService {
  
    public Usuario salvaUsuario(Usuario usuario);
    
    public List<Usuario> listaUsuario();
    
    public Optional<Usuario> getByIdUsuario(Integer codUsuario);
    
    public Usuario atualizaUsuario(Usuario usuario);
    
    public void deleteByIdUsuario(Integer codUsuario); 
 
    
    
    
    
    
}
