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

@Entity
@Table(name = "EnderecoQuadra")
public class EnderecoQuadra {

    @Id
    @Column(name = "codEndereco")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codEndereco;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "NumEndereco")
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

    public Integer getCodEndereco() {
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