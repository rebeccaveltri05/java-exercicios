package model;

import java.util.ArrayList;

public abstract class Publicacao {

    private ArrayList<Bloco> blocos;

    public Publicacao() {
        this.blocos = new ArrayList<Bloco>();
    }

    public Publicacao(ArrayList<Bloco> blocos) {
        this.blocos = blocos;
    }

    public abstract void imprimirPublicação();

    public ArrayList<Bloco> getBlocos() {
        return blocos;
    }

    public void setBlocos(ArrayList<Bloco> blocos) {
        this.blocos = blocos;
    }

}
