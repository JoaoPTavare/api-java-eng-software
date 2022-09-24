
import app_java_eng.demo.model.Usuario;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


/**
 *
 * @author leo
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "EnderecoQuadra")
public class EnderecoQuadra {

<<<<<<< HEAD
    @Id
    @Column(name = "codEndereco")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codEndereco;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "NumEndereco")
=======
    
    
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codEndereco")
    private Integer codEndereco;
        
           @Column(name = "endereco") 
    private String endereco;
           
              @Column(name = "numEndereco") 
>>>>>>> b12767b1cd6e62d62485fa1b6f900a97407c6dfb
    private Integer numEndereco;
    
    
    
        
     @OneToMany
    @JoinColumn(name = "codUsuario", referencedColumnName = "codUsuario")
    private Usuario usuario;
    
    
    public EnderecoQuadra() {
    }

    public EnderecoQuadra (Integer codEndereco, String endereco, int numEndereco) {
        this.codEndereco = codEndereco;
        this.endereco = endereco;
        this.numEndereco = numEndereco;
    }

    public long getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(Integer codEndereco) {
        this.codEndereco = codEndereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumEndereco() {
        return numEndereco;
    }

    public void setNumEndereco(int numEndereco) {
        this.numEndereco = numEndereco;
    }

    @Override
    public String toString() {
        return "EnderecoQuadra{" + "codEndereco=" + codEndereco + ", endereco=" + endereco + ", numEndereco=" + numEndereco + '}';
    }
    
}
