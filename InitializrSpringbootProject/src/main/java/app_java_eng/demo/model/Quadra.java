package app_java_eng.demo.model;

public class Quadra{
    private Integer cod_Quadra;
    private Integer cod_colaborador;
    private Integer cod_agendament;
    private String modalidades;
    private String localidade;
    private String estrutura;

    public Quadra() {
    }

    public Quadra(Integer cod_Quadra, Integer cod_colaborador, Integer cod_agendament, String modalidades, String localidade, String estrutura) {
        this.cod_Quadra = cod_Quadra;
        this.cod_colaborador = cod_colaborador;
        this.cod_agendament = cod_agendament;
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

    public Integer getCod_colaborador() {
        return cod_colaborador;
    }

    public void setCod_colaborador(Integer cod_colaborador) {
        this.cod_colaborador = cod_colaborador;
    }

    public Integer getCod_agendament() {
        return cod_agendament;
    }

    public void setCod_agendament(Integer cod_agendament) {
        this.cod_agendament = cod_agendament;
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
        return "Quadra{" + "cod_Quadra=" + cod_Quadra + ", cod_colaborador=" + cod_colaborador + ", cod_agendament=" + cod_agendament + ", modalidades=" + modalidades + ", localidade=" + localidade + ", estrutura=" + estrutura + '}';
    }
    
    
    
}
