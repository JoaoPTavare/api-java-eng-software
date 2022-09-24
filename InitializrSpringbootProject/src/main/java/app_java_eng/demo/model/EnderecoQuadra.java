


import app_java_eng.demo.model.Usuario;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codEnderecoQuadra")
    private Integer codEnderecoQuadra;

        
    @Column(name = "endereco") 
    private String endereco;
           

    @Column(name = "numEndereco") 
    private Integer numEndereco;

 
    

        
@OneToMany
@JoinColumn(name = "codUsuario", referencedColumnName = "codUsuario")
private Usuario usuario;
    
public EnderecoQuadra() {
}

    public EnderecoQuadra(Integer codEnderecoQuadra, String endereco, Integer numEndereco, Usuario usuario) {
        this.codEnderecoQuadra = codEnderecoQuadra;
        this.endereco = endereco;
        this.numEndereco = numEndereco;
        this.usuario = usuario;
    }







    public Integer getCodEnderecoQuadra() {
        return codEnderecoQuadra;
    }

    public void setCodEnderecoQuadra(Integer codEnderecoQuadra) {
        this.codEnderecoQuadra = codEnderecoQuadra;
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
        return "EnderecoQuadra{" + "codEnderecoQuadra=" + codEnderecoQuadra + ", endereco=" + endereco + ", numEndereco=" + numEndereco + ", usuario=" + usuario + '}';
    }
 




    
}
