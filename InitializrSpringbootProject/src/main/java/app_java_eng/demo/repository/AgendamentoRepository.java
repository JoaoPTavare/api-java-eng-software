
package app_java_eng.demo.repository;

import app_java_eng.demo.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer>{
    
       
}
