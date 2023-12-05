package model;

import model.enums.TipoAditivo;

public class Aditivo {

    private int id;
    private TipoAditivo tipoAditivo;

    public TipoAditivo getTipoAditivo() {
        return tipoAditivo;
    }

    public void setTipoAditivo(TipoAditivo tipoAditivo) {
        this.tipoAditivo = tipoAditivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
