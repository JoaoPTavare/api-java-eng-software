
package app_java_eng.demo.controller;

import app_java_eng.demo.model.Usuario;
import app_java_eng.demo.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class usuarioController {
    
    
     @Autowired
     private UsuarioService UsuarioService;
     
         @GetMapping("/carros")
    public ResponseEntity<List<Usuario>>listausuario(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(UsuarioService.listausuario());
    }
     
}
