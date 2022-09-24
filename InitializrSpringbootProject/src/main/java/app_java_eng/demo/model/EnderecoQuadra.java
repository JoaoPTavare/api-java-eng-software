
import app_java_eng.demo.model.Usuario;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

<<<<<<< HEAD
public class EnderecoQuadra {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "codEndereco")
private Integer codEndereco;
=======

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
>>>>>>> b72ae90f0064718a7e9d7e4c5373a42e48a8ae2e
        
@Column(name = "endereco") 
private String endereco;
           
<<<<<<< HEAD
@Column(name = "numEndereco") 
private Integer numEndereco;
=======
              @Column(name = "numEndereco") 
>>>>>>> b12767b1cd6e62d62485fa1b6f900a97407c6dfb
    private Integer numEndereco;
    
    
    
>>>>>>> b72ae90f0064718a7e9d7e4c5373a42e48a8ae2e
        
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

public Integer getCodEndereco() {
return codEndereco;
    }

 public void setCodEndereco(Integer codEndereco) {
this.codEndereco = codEndereco;
    }

<<<<<<< HEAD
public String getEndereco() {
return endereco;
=======
    public long getCodEndereco() {
        return codEndereco;
>>>>>>> b72ae90f0064718a7e9d7e4c5373a42e48a8ae2e
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
