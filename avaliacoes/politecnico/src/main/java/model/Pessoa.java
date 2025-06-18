package model;

public abstract class Pessoa {

    private String nome;
    private String apelido;
    private String numeroFiscal;

    public Pessoa(String nome, String apelido, String numeroFiscal) {
        this.nome = nome;
        this.apelido = apelido;
        this.numeroFiscal = numeroFiscal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public void setNumeroFiscal(String numeroFiscal) {
        this.numeroFiscal = numeroFiscal;
    }
    
    public abstract void imprimirPessoa();

}
