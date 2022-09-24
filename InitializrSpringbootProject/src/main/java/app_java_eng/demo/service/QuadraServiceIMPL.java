
package app_java_eng.demo.service;

import app_java_eng.demo.model.Quadra;
import app_java_eng.demo.repository.QuadraRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public abstract class QuadraServiceIMPL implements QuadraService{
   
     @Autowired 
     private QuadraRepository QuadraRepository;
     
 
     @Override
     public List<Quadra> listaQuadra(){
          return QuadraRepository.findAll();
     }
     
         @Override
    public Optional<Quadra> getByIdQuadra(Integer codQuadra) {
        return QuadraRepository.findById(codQuadra); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Quadra atualizaQuadra(Quadra quadra) {
          return QuadraRepository.save(quadra); 
    }

    @Override
    public void deleteByIdQuadra(Integer codQuadra) {
      QuadraRepository.deleteById(codQuadra); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
   
}
