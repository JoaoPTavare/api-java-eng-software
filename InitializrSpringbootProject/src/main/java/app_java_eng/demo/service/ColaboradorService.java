package app_java_eng.demo.service;

import app_java_eng.demo.model.Colaborador;
import java.util.List;
import java.util.Optional;

public interface ColaboradorService {
    
    public Colaborador salvaColaborador(Colaborador colaborador);
      
    public List<Colaborador> listacolaborador();

    public Optional<Colaborador> getByIdcolaborador(Integer codcolaborador);
    
    public Colaborador atualizacolaborador (Colaborador colaborador);
        
    public void deleteByIdColaborador(Integer codColaborador); 
    
}