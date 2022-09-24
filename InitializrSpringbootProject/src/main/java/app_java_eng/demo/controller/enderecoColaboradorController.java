package app_java_eng.demo.controller;

import app_java_eng.demo.model.Colaborador;
import app_java_eng.demo.service.ColaboradorService;
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
public class enderecoColaboradorController {
    
    
     @Autowired
     private ColaboradorService ColaboradorService;
     
         @GetMapping("/colaborador")
    public ResponseEntity<List<Colaborador>>listaColaborador(){
        return ResponseEntity.status(HttpStatus.OK).body(ColaboradorService.listacolaborador());
    }
     
 
    
    @GetMapping("Colaborador/{codColaborador}")
    public ResponseEntity<Optional<Colaborador>> getByIdColaborador(@PathVariable Integer codColaborador){
        return ResponseEntity.status(HttpStatus.OK).body(ColaboradorService.getByIdcolaborador(codColaborador));
    }

    @PostMapping("colaborador")
    public ResponseEntity<Colaborador> salvaColaborador(@RequestBody Colaborador colaborador){
        return ResponseEntity.status(HttpStatus.CREATED).body(ColaboradorService.salvaColaborador(colaborador));
    }

    @PutMapping("colaborador")
    public ResponseEntity<Colaborador> atualizaColaborador(@RequestBody Colaborador colaborador){
        return ResponseEntity.status(HttpStatus.OK).body(ColaboradorService.atualizacolaborador(colaborador));
    }
    
    @DeleteMapping("Colaborador/{codColaborador}")
    public ResponseEntity<String> deleteByIdColaborador(@PathVariable Integer codColaborador){
        ColaboradorService.deleteByIdColaborador(codColaborador);
        return ResponseEntity.status(HttpStatus.OK).body("Colaborador removido com sucesso");
    }
    
    
    
}