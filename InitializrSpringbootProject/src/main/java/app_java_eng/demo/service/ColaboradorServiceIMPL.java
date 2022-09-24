package app_java_eng.demo.service;

import app_java_eng.demo.model.Agendamento;
import app_java_eng.demo.model.Colaborador;
import app_java_eng.demo.repository.ColaboradorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColaboradorServiceIMPL implements ColaboradorService {
    
    
    @Autowired
    private ColaboradorRepository ColaboradorRepository;
    
    
    
    
       @Override
        public List<Colaborador> listacolaborador(){
        return ColaboradorRepository.findAll();
    }
        
  

    @Override
    public Colaborador salvaColaborador(Colaborador colaborador) {
        return ColaboradorRepository.save(colaborador);
    }

    @Override
    public Optional<Colaborador> getByIdColaborador(Integer codColaborador) {
        return ColaboradorRepository.findById(codColaborador); 
    }

    @Override
    public Colaborador atualizaColaborador(Colaborador colaborador) {
          return ColaboradorRepository.save(colaborador); 
    }

    @Override
    public void deleteByIdColaborador(Integer codColaborador) {
      ColaboradorRepository.deleteById(codColaborador);
    }

   
        
   
     
        
        
        
}
