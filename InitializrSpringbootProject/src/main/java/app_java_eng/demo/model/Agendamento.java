package app_java_eng.demo.model;
 
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



public class Agendamento {
    private String nome;
    private String CNPJ;
    private String dataNasc;
    private String telCont;

    
    
    @OneToMany
    @JoinColumn(name = "codUsuario", referencedColumnName = "codUsuario")
    private Usuario usuario;

    
    
    public Agendamento() {
    }

    public Agendamento(String nome, String CNPJ, String dataNasc, String telCont) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.dataNasc = dataNasc;
        this.telCont = telCont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelCont() {
        return telCont;
    }

    public void setTelCont(String telCont) {
        this.telCont = telCont;
    }

    @Override
    public String toString() {
        return "Agendamento{" + "nome=" + nome + ", CNPJ=" + CNPJ + ", dataNasc=" + dataNasc + ", telCont=" + telCont + '}';
    }
    
    
    
 
}
