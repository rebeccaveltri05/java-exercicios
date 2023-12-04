package model;

import java.util.ArrayList;

public class DiarioOficial {

    private String titulo;
    private ArrayList<Publicacao> publicações;

    public DiarioOficial() {
        this.titulo = "";
        this.publicações = new ArrayList<Publicacao>();
    }

    public DiarioOficial(String titulo) {
        this.titulo = titulo;
        this.publicações = new ArrayList<Publicacao>();
    }

    public DiarioOficial(ArrayList<Publicacao> publicações) {
        this.publicações = publicações;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Publicacao> getPublicações() {
        return publicações;
    }

    public void setPublicações(ArrayList<Publicacao> publicações) {
        this.publicações = publicações;
    }

    public void imprimirDiario() {
        for (Publicacao p : this.getPublicações()) {
            p.imprimirPublicação();
        }
    }

}
