
package app_java_eng.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "colaborador")
public class Colaborador {
    
    @Id
    @Column(name = "codColaborador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codColaborador;
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "cnpj")
    private String cnpj;
   
    @Column(name = "dataNasc")
    private String dataNasc;
    
    @Column(name = "telCont")
    private String telCont;

    public Colaborador() {
    }

    public Colaborador(long codColaborador, String nome, String cnpj, String dataNasc, String telCont) {
        this.codColaborador = codColaborador;
        this.nome = nome;
        this.cnpj = cnpj;
        this.dataNasc = dataNasc;
        this.telCont = telCont;
    }

    public long getCodColaborador() {
        return codColaborador;
    }

    public void setCodColaborador(long codColaborador) {
        this.codColaborador = codColaborador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        return "colaborador{" + "codColaborador=" + codColaborador + ", nome=" + nome + ", cnpj=" + cnpj + ", dataNasc=" + dataNasc + ", telCont=" + telCont + '}';
    }

}
