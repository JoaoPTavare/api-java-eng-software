/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app_java_eng.demo.repository;

import app_java_eng.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

 
public interface UsuarioRepository  extends JpaRepository<Usuario, Integer>{
    
}
