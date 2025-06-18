package model;

import java.util.ArrayList;

public class Contrato extends Publicacao {

    private ArrayList<Aditivo> aditivos;
    
    public Contrato() {
        aditivos = new ArrayList<Aditivo>();
    }

    public Contrato(String tituloPrincipal, String tituloAuxiliar, String conteudo, Orgao orgao,
            ArrayList<Bloco> blocos, ArrayList<Aditivo> aditivos) {
        super(tituloPrincipal, tituloAuxiliar, conteudo, orgao, blocos);
        this.aditivos = aditivos;
    }

    public ArrayList<Aditivo> getAditivos() {
        return aditivos;
    }

    public void setAditivos(ArrayList<Aditivo> aditivos) {
        this.aditivos = aditivos;
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
