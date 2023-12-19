package model;

import java.util.ArrayList;

public class Publicacao {

    private String tituloPrincipal;
    private String tituloAuxiliar;
    private String conteudo;
    private Orgao orgao;
    private ArrayList<Bloco> blocos;

    public Publicacao() {
        this.blocos = new ArrayList<Bloco>();
    }

    public Publicacao(ArrayList<Bloco> blocos) {
        this.blocos = blocos;
    }

    public Publicacao(String tituloPrincial, String tituloAuxiliar, String conteudo, Orgao orgao,
            ArrayList<Bloco> blocos) {
        this.tituloPrincipal = tituloPrincial;
        this.tituloAuxiliar = tituloAuxiliar;
        this.conteudo = conteudo;
        this.orgao = orgao;
        this.blocos = blocos;
    }

    public String getTituloPrincipal() {
        return tituloPrincipal;
    }

    public void setTituloPrincipal(String tituloPrincipal) {
        this.tituloPrincipal = tituloPrincipal;
    }

    public String getTituloAuxiliar() {
        return tituloAuxiliar;
    }

    public void setTituloAuxiliar(String tituloAuxiliar) {
        this.tituloAuxiliar = tituloAuxiliar;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Orgao getOrgao() {
        return orgao;
    }

    public void setOrgao(Orgao orgao) {
        this.orgao = orgao;
    }

    public ArrayList<Bloco> getBlocos() {
        return blocos;
    }

    public void setBlocos(ArrayList<Bloco> blocos) {
        this.blocos = blocos;
    }

    public void imprimirPublicação() {
        for (Bloco b : this.getBlocos()) {
            switch (b.getTipo()) {
                case Texto:
                    System.out.println(b.getTexto());
                    break;
                case Imagem:
                    // Implementar um mecanismo para exibir imagens.
                case Tabela:
                    // Implementar um mecanismo para exibir tabelas.
            }
        }
    }

}
