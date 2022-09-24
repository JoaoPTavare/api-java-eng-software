
package app_java_eng.demo.controller;

import app_java_eng.demo.model.Usuario;
import app_java_eng.demo.service.UsuarioService;
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



@RestController
@RequestMapping("/api")
public class UsuarioController {
    
    
     @Autowired
     private UsuarioService UsuarioService;
     
         @GetMapping("/usuario")
    public ResponseEntity<List<Usuario>>listausuario(){
        return ResponseEntity.status(HttpStatus.OK).body(UsuarioService.listausuario());
    }
     
 
    
    @GetMapping("Usuario/{codUsuario}")
    public ResponseEntity<Optional<Usuario>> getByIdUsuario(@PathVariable Integer codUsuario){
        return ResponseEntity.status(HttpStatus.OK).body(UsuarioService.getByIdUsuario(codUsuario));
    }

    @PostMapping("usuario")
    public ResponseEntity<Usuario> salvaUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.CREATED).body(UsuarioService.salvaUsuario(usuario));
    }

    @PutMapping("usuario")
    public ResponseEntity<Usuario> atualizaUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.OK).body(UsuarioService.atualizaUsuario(usuario));
    }
    
    @DeleteMapping("Usuário/{codUsuario}")
    public ResponseEntity<String> deleteByIdUsuario(@PathVariable Integer codUsuario){
        UsuarioService.deleteByIdUsuario(codUsuario);
        return ResponseEntity.status(HttpStatus.OK).body("Usuário removido com sucesso");
    }
    
    
    
}
