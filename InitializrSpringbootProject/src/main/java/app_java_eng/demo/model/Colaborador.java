
package app_java_eng.demo.model;


public class colaborador {
    
    private String nome;
    private String cnpj;
    private String dataNasc;
    private String telCont;

    public colaborador() {
    }

    public colaborador(String nome, String cnpj, String dataNasc, String telCont) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.dataNasc = dataNasc;
        this.telCont = telCont;
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
        return "colaborador{" + "nome=" + nome + ", cnpj=" + cnpj + ", dataNasc=" + dataNasc + ", telCont=" + telCont + '}';
    }
    
    
}
