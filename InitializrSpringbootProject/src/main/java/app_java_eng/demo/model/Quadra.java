package app_java_eng.demo.model;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Quadra{
    private Integer cod_Quadra;
    private String modalidades;
    private String localidade;
    private String estrutura;

    @OneToOne
    @JoinColumn(name = "codColaborador", referencedColumnName = "codColaborador")
    private Colaborador colaborador;

    public Quadra() {
    }

    public Quadra(Integer cod_Quadra, String modalidades, String localidade, String estrutura) {
        this.cod_Quadra = cod_Quadra;
        this.modalidades = modalidades;
        this.localidade = localidade;
        this.estrutura = estrutura;
    }

    public Integer getCod_Quadra() {
        return cod_Quadra;
    }

    public void setCod_Quadra(Integer cod_Quadra) {
        this.cod_Quadra = cod_Quadra;
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


    @Override
    public String toString() {
        return "Quadra{" + "cod_Quadra=" + cod_Quadra + ", modalidades=" + modalidades + ", localidade=" + localidade + ", estrutura=" + estrutura + '}';
    }
    
    
    
}
