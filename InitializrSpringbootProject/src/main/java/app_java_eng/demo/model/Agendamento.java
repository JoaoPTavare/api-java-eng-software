package app_java_eng.demo.model;
 
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
    @JoinColumn(name = "codUsuario", referencedColumnName = "codUsuario")
    private Usuario usuario;

    
    
    public Agendamento() {
    }

    public Agendamento(Integer codAgendamento, String nome, String CNPJ, String dataNasc, String telCont) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.dataNasc = dataNasc;
        this.telCont = telCont;
    }

    public Integer getCodAgendamento() {
        return codAgendamento;
    }

    public void setCodAgendamento(Integer codAgendamento) {
        this.codAgendamento = codAgendamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
        return "Agendamento{" + "codAgendamento=" + codAgendamento + ", nome=" + nome + ", CNPJ=" + CNPJ + ", dataNasc=" + dataNasc + ", telCont=" + telCont + ", usuario=" + usuario + '}';
    }

    
    
    
    
    
 
}
