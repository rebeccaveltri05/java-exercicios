package model;

import model.enums.TipoBloco;

public class Bloco {

    private String texto;
    private TipoBloco tipo;
    private int ordem;

    public Bloco() {
        this.texto = "";
    }

    public Bloco(String texto) {
        this.texto = texto;
    }

    public Bloco(String texto, TipoBloco tipo, int ordem) {
        this.texto = texto;
        this.tipo = tipo;
        this.ordem = ordem;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public TipoBloco getTipo() {
        return tipo;
    }

    public void setTipo(TipoBloco tipo) {
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
