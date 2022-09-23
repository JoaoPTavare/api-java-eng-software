
package app_java_eng.demo.repository;

import app_java_eng.demo.model.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColaboradorRepository  extends JpaRepository<Colaborador, Integer>{
    
}
