package model;

import java.util.ArrayList;

import model.enums.Esfera;

public class DiarioOficial {

    private String titulo;
    private int numero;
    private Esfera esfera;
    private String data;
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

    public DiarioOficial(String data, int numero, String titulo, Esfera esfera, ArrayList<Publicacao> publicações) {
        this.data = data;
        this.numero = numero;
        this.titulo = titulo;
        this.esfera = esfera;
        this.publicações = publicações;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Esfera getEsfera() {
        return esfera;
    }

    public void setEsfera(Esfera esfera) {
        this.esfera = esfera;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<Publicacao> getPublicações() {
        return publicações;
    }

    public void setPublicações(ArrayList<Publicacao> publicações) {
        this.publicações = publicações;
    }

    public void imprimirDiario() {
        System.out.println(this.titulo);
        System.out.println(this.data);
        for (Publicacao p : this.getPublicações()) {
            System.out.println("");
            p.imprimirPublicação();
        }
    }

}
