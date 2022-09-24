
package app_java_eng.demo.controller;

import app_java_eng.demo.model.Quadra;
import app_java_eng.demo.model.Usuario;
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
     public QuadraService QuadraService;
     
 
    @GetMapping("/quadra")
    public ResponseEntity<List<Quadra>> listaQuadra(){
        return ResponseEntity.status(HttpStatus.OK).body(QuadraService.listaQuadra());
    }   
     
      @GetMapping("produto/{codproduto}")
    public ResponseEntity<Optional<Quadra>> getByIdProduto(@PathVariable Integer codQuadra){
        return ResponseEntity.status(HttpStatus.OK).body(QuadraService.getByIdQuadra(codQuadra));
    }
    
    
    @PostMapping("quadra")
    public ResponseEntity<Quadra> salvaQuadra(@RequestBody Quadra quadra){
        return ResponseEntity.status(HttpStatus.CREATED).body(QuadraService.salvaQuadra(quadra));
    }

    @PutMapping("quadra")
    public ResponseEntity<Quadra> atualizaQuadra(@RequestBody Quadra quadra){
        return ResponseEntity.status(HttpStatus.OK).body(QuadraService.atualizaQuadra(quadra));
    }
    
    @DeleteMapping("Quadra/{codQuadra}")
    public ResponseEntity<String> deleteByIdQuadra(@PathVariable Integer codQuadra){
        QuadraService.deleteByIdQuadra(codQuadra);
        return ResponseEntity.status(HttpStatus.OK).body("Usuário removido com sucesso");
    }
    

     
    
    
}
