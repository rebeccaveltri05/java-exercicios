package model;

public class Legislacao extends Publicacao {

    @Override
    public void imprimirPublicação() {
        for (Bloco b : this.getBlocos()) {
            System.out.println(b.getTexto());
        }
    }

}
