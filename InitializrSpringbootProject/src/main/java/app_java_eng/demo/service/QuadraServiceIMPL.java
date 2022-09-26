
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
     private QuadraRepository quadraRepository;
     
    @Override
    public List<Quadra> listaQuadra(){
        return quadraRepository.findAll();
     }
     
    @Override
    public Optional<Quadra> getByIdQuadra(Integer codQuadra) {
        return quadraRepository.findById(codQuadra);
    }

    @Override
    public Quadra atualizaQuadra(Quadra quadra) {
          return quadraRepository.save(quadra);
    }

    @Override
    public void deleteByIdQuadra(Integer codQuadra) {
      quadraRepository.deleteById(codQuadra);
    }
        
       @Override
    public Quadra salvaQuadra(Quadra quadra) {
        return quadraRepository.save(quadra);
    }
}
