package app_java_eng.demo.controller;
 
import app_java_eng.demo.model.Agendamento;
import app_java_eng.demo.service.AgendamentoService;
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
public class agendamentoController {

     @Autowired
     private AgendamentoService AgendamentoService;
        private Integer codAgendamento;
        private Agendamento Agendamento;
     
         @GetMapping("/agendamento")
    public ResponseEntity<List<Agendamento>>listaAgendamento(){
        return ResponseEntity.status(HttpStatus.OK).body(AgendamentoService.listaAgendamento());
    }
     
 
    
    @GetMapping("Agendamento/{codAgendamento}")
    public ResponseEntity<Optional<Agendamento>> getByIdUsuario(@PathVariable Integer codUsuario){
        return ResponseEntity.status(HttpStatus.OK).body(AgendamentoService.getByIdAgendamento(codAgendamento));
    }

    @PostMapping("Agendamento")
    public ResponseEntity<Agendamento> salvaAgendamento(@RequestBody Agendamento agendamento){
        return ResponseEntity.status(HttpStatus.CREATED).body(AgendamentoService.salvaAgendamento(Agendamento));
    }

    @PutMapping("Agendamento")
    public ResponseEntity<Agendamento> atualizaAgendamento(@RequestBody Agendamento agendamento){
        return ResponseEntity.status(HttpStatus.OK).body(AgendamentoService.atualizaAgendamento(Agendamento));
    }
    
    @DeleteMapping("Agendamento/{codAgendamento}")
    public ResponseEntity<String> deleteByIdAgendamento(@PathVariable Integer codAgendamento){
        AgendamentoService.deleteByIdAgendamento(codAgendamento);
        return ResponseEntity.status(HttpStatus.OK).body("Agendamento removido com sucesso");
    }
    
}