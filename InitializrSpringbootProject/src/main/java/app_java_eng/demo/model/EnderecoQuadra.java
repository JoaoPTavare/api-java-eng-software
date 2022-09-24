
import app_java_eng.demo.model.Usuario;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

<<<<<<< HEAD
@Entity
@Table(name = "EnderecoQuadra")
public class EnderecoQuadra {

=======
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
>>>>>>> 43e0bf78a46d5c089320f048771c04ed159c4901
    @Id
    @Column(name = "codEndereco")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codEndereco;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "NumEndereco")
<<<<<<< HEAD
    private Integer numEndereco;
  
=======
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
        
>>>>>>> 43e0bf78a46d5c089320f048771c04ed159c4901
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
<<<<<<< HEAD
public String getEndereco() {
return endereco;
=======
    public long getCodEndereco() {
        return codEndereco;
>>>>>>> b72ae90f0064718a7e9d7e4c5373a42e48a8ae2e
>>>>>>> 43e0bf78a46d5c089320f048771c04ed159c4901
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumEndereco() {
        return numEndereco;
    }

    public void setNumEndereco(Integer numEndereco) {
        this.numEndereco = numEndereco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    @Override
    public String toString() {
        return "EnderecoQuadra{" + "codEndereco=" + codEndereco + ", endereco=" + endereco + ", numEndereco=" + numEndereco + '}';
    }
    
}
