package model;

import model.enums.Poder;

public class Orgao {
    private int id;
    private String nomeOrg;
    private Poder poder;

    public Orgao(int id, String nomeOrg, Poder poder) {
        this.id = id;
        this.nomeOrg = nomeOrg;
        this.poder = poder;
    }

    public Poder getPoder() {
        return poder;
    }

    public void setPoder(Poder poder) {
        this.poder = poder;
    }

    public String getNomeOrg() {
        return nomeOrg;
    }

    public void setNomeOrg(String nomeOrg) {
        this.nomeOrg = nomeOrg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
