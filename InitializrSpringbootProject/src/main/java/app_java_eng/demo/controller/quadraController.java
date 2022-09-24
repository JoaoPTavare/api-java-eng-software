
package app_java_eng.demo.controller;

import app_java_eng.demo.model.Quadra;
import app_java_eng.demo.service.QuadraService;
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
public class QuadraController {
    
    
     @Autowired
     private QuadraController QuadraController;
     
         @GetMapping("/quadra")
    public ResponseEntity<List<quadra>>listaquadra(){
        return ResponseEntity.status(HttpStatus.OK).body(quadraService.quadrausuario());
    }
     
 
    
    @GetMapping("quadra/{codquadra}")
    public ResponseEntity<Optional<quadra>> getByIdquadra(@PathVariable Integer codquadra){
        return ResponseEntity.status(HttpStatus.OK).body(quadraService.getByIdquadra(codquadra));
    }


    @PutMapping("quadra")
    public ResponseEntity<quadra> atualizaquadra(@RequestBody Quadra quadra){
        return ResponseEntity.status(HttpStatus.OK).body(quadraService.atualizaquadra(quadra));
    }
    
    @DeleteMapping("quadra/{codquadra}")
    public ResponseEntity<String> deleteByIdquadra(@PathVariable Integer codquadra){
        quadraService.deleteByIdquadra(codquadra);
        return ResponseEntity.status(HttpStatus.OK).body("Quadra removido com sucesso");
    }
    
    
    
}
