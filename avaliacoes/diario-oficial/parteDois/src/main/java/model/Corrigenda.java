package model;

import java.util.ArrayList;

public class Corrigenda extends Publicacao {
    private String content;

    public Corrigenda(String tituloPrincipal, String tituloAuxiliar, String conteudo, Orgao orgao,
            ArrayList<Bloco> blocos) {
        super(tituloPrincipal, tituloAuxiliar, conteudo, orgao, blocos);
    }

    @Override
    public void imprimirPublicação() {
        System.out.println(this.getTituloPrincipal());
        System.out.println(this.getTituloAuxiliar());
        for (Bloco bloco : this.getBlocos()) {
            System.out.println(bloco.getTexto());
        }
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
