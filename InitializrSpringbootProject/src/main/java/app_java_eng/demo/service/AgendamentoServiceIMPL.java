package app_java_eng.demo.service;

import app_java_eng.demo.model.Agendamento;
import app_java_eng.demo.repository.AgendamentoRepository;
import java.util.List;
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
}
