package model;

public class Contrato extends Publicacao {

    @Override
    public void imprimirPublicação() {
        for (Bloco b : this.getBlocos()) {
            System.out.println(b.getTexto());
        }
  }
    
}
