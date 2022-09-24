package app_java_eng.demo.service;

import app_java_eng.demo.model.Agendamento;
import app_java_eng.demo.model.Usuario;
import app_java_eng.demo.repository.AgendamentoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AgendamentoServiceIMPL implements AgendamentoService{
    
    @Autowired
    private AgendamentoRepository AgendamentoReposytory;
  
    
    @Override
    public List<Agendamento> listaAgendamento(){
        return AgendamentoReposytory.findAll();
    }  

    
    @Override
    public Optional<Agendamento> getByIdAgendamento(Integer codAgendamento) {
       return  AgendamentoReposytory.findById(codAgendamento); 
    }

    @Override
    public Agendamento atualizaAgendamento(Agendamento agendamento) {
           return  AgendamentoReposytory.save(agendamento); 
    }
    
    @Override
    public Agendamento salvaAgendamento(Agendamento agendamento) {
               return AgendamentoReposytory.save(agendamento);
    }

   
    @Override
    public void deleteByIdAgendamento(Integer codAgendamento) {
              AgendamentoReposytory.deleteById(codAgendamento);
    }


}
