package model;

import java.util.ArrayList;

import model.enums.TipoLegislacao;

public class Legislacao extends Publicacao {

    private TipoLegislacao tipoLegislacao;

    public Legislacao() {
        
    }

    public Legislacao(int id, String tituloPrincipal, String tituloAuxiliar, String conteudo, Orgao orgao,
            ArrayList<Bloco> blocos, TipoLegislacao legislacao) {
        super(tituloPrincipal, tituloAuxiliar, conteudo, orgao, blocos);

        this.tipoLegislacao = legislacao;
    }

    public TipoLegislacao getTipoLegislacao() {
        return tipoLegislacao;
    }

    public void setTipoLegislacao(TipoLegislacao tipoLegislacao) {
        this.tipoLegislacao = tipoLegislacao;
    }

    @Override
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
