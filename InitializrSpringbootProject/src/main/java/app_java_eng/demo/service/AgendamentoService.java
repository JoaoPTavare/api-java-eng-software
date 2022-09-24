
package app_java_eng.demo.service;


import app_java_eng.demo.model.Agendamento;
import app_java_eng.demo.model.Usuario;
import java.util.List;
import java.util.Optional;

public interface AgendamentoService {
    public List<Agendamento> listaAgendamento();


    
        
      public List<Agendamento> listaagendamento();


    public Optional<Agendamento> getByIdAgendamento(Integer codAgendamento);
    
    public Usuario atualizaAgendamento(Agendamento agendamento);
    
    public void deleteByIdAgendamento(Integer codAgendamento);    
    
    
    
}