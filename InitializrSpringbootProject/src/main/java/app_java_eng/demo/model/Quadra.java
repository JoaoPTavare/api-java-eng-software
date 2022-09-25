package app_java_eng.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name= "Quadra")
public class Quadra{
    
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codQuadra")
    private Integer codQuadra;
        
     @Column(name = "modalidades")       
    private String modalidades;
     
      @Column(name = "localidade")      
    private String localidade;
      
      @Column(name = "estrutura")        
    private String estrutura;

    @OneToMany
    @JoinColumn(name = "codColaborador", referencedColumnName = "codColaborador")
    private Colaborador colaborador;

    public Quadra() {
    }

    public Quadra(Integer codQuadra, String modalidades, String localidade, String estrutura, Colaborador colaborador) {
        this.codQuadra = codQuadra;
        this.modalidades = modalidades;
        this.localidade = localidade;
        this.estrutura = estrutura;
        this.colaborador = colaborador;
    }
    
    
    

    public Integer getCodQuadra() {
        return codQuadra;
    }

    public void setCodQuadra(Integer codQuadra) {
        this.codQuadra = codQuadra;
    }

    public String getModalidades() {
        return modalidades;
    }

    public void setModalidades(String modalidades) {
        this.modalidades = modalidades;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getEstrutura() {
        return estrutura;
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    @Override
    public String toString() {
        return "Quadra{" + "codQuadra=" + codQuadra + ", modalidades=" + modalidades + ", localidade=" + localidade + ", estrutura=" + estrutura + ", colaborador=" + colaborador + '}';
    }
 
    
    
    
    
    
}
