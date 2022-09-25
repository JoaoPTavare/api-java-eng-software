package app_java_eng.demo.model;
 
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codAgendamento")
    private Integer codAgendamento;
    
    @Column(name = "nome") 
    private String nome;
    
    @Column(name = "CNPJ")
    private String CNPJ;
    
    @Column(name = "dataNasc")
    private String dataNasc;
    
    @Column(name = "telCont")
    private String telCont;

    @OneToMany
    private List<Usuario> usuario;

    public Agendamento() {
    }

    public Agendamento(Integer codAgendamento, String nome, String CNPJ, String dataNasc, String telCont, List<Usuario> usuario) {
        this.codAgendamento = codAgendamento;
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.dataNasc = dataNasc;
        this.telCont = telCont;
        this.usuario = usuario;
    }

    
    
    
    
    
    public Integer getCodAgendamento() {
        return codAgendamento;
    }

    public void setCodAgendamento(Integer codAgendamento) {
        this.codAgendamento = codAgendamento;
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

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Agendamento{" + "codAgendamento=" + codAgendamento + ", nome=" + nome + ", CNPJ=" + CNPJ + ", dataNasc=" + dataNasc + ", telCont=" + telCont + ", usuario=" + usuario + '}';
    }

    
    
    
 
}
