
package app_java_eng.demo.model;

public class enderecoUsuario {
 
    
    private Integer codEndereco;
    private String endereco;
    private int numEndereco;

    public enderecoUsuario() {
    }

    public enderecoUsuario(Integer codEndereco, String endereco, int numEndereco) {
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

    public int getNumEndereco() {
        return numEndereco;
    }

    public void setNumEndereco(int numEndereco) {
        this.numEndereco = numEndereco;
    }

    @Override
    public String toString() {
        return "EnderecoUsuario{" + "codEndereco=" + codEndereco + ", endereco=" + endereco + ", numEndereco=" + numEndereco + '}';
    }
    
    
    
    
    
    
}
