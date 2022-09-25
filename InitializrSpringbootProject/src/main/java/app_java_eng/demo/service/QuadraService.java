
package app_java_eng.demo.service;

import app_java_eng.demo.model.Quadra;
import java.util.List;
import java.util.Optional;

public interface QuadraService {
    
    public List<Quadra> listaQuadra();
    
    public Optional<Quadra> getByIdQuadra(Integer codQuadra);
    
    public Quadra atualizaQuadra(Quadra quadra);
    
    public void deleteByIdQuadra(Integer codQuadra);    
    
    public Quadra atualizaUsuario(Quadra quadra);
    
    public Quadra salvaQuadra(Quadra quadra);
    
}