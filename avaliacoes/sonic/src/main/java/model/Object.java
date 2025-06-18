package model;

public class Object extends Character {

    private TipoObjeto tipo;
    
    public Object(String name, String image, int x, int y, TipoObjeto tipo) {
        super.setName(name);
        super.setImage(image);
        super.setX(x);
        super.setY(y);
        this.tipo = tipo;
    }

    public TipoObjeto getTipo() {
        return tipo;
    }

    public void setTipo(TipoObjeto tipo) {
        this.tipo = tipo;
    }

}
