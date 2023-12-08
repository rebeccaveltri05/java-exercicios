package model;

import java.util.ArrayList;

import model.enums.Modalidade;
import model.enums.Fase;

public class Licitacao extends Publicacao {
    private Fase fase;
    private int dataAberturaFase;
    private Modalidade modalidade;
    private int dataEncerramentoFase;
    private int tipoEscolhaVencedor;

    public Licitacao(String tituloPrincipal, String tituloAuxiliar, String conteudo, Orgao orgao,
            ArrayList<Bloco> blocos) {
        super(tituloPrincipal, tituloAuxiliar, conteudo, orgao, blocos);
    }

    @Override
    public void imprimirPublicação() {
        System.out.println(this.getTituloPrincipal());
        System.out.println(this.getTituloAuxiliar());
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

    public int getTipoEscolhaVencedor() {
        return tipoEscolhaVencedor;
    }

    public void setTipoEscolhaVencedor(int tipoEscolhaVencedor) {
        this.tipoEscolhaVencedor = tipoEscolhaVencedor;
    }

    public int getDataEncerramentoFase() {
        return dataEncerramentoFase;
    }

    public void setDataEncerramentoFase(int dataEncerramentoFase) {
        this.dataEncerramentoFase = dataEncerramentoFase;
    }

    public int getDataAberturaFase() {
        return dataAberturaFase;
    }

    public void setDataAberturaFase(int dataAberturaFase) {
        this.dataAberturaFase = dataAberturaFase;
    }

    public Fase getFase() {
        return this.fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }
}
