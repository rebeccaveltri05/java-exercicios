package repository;

import model.DiarioOficial;

public class DiarioOficialRepository implements Repository {

    @Override
    public void salvar(Object obj) {
        System.out.println("O Diário Oficial foi salvo com sucesso!");
    }

    @Override
    public void novo(Object obj) {
        System.out.println("O Diário Oficial foi criado com sucesso!");
    }

    @Override
    public void apagar(Object obj) {
        System.out.println("O Diário Oficial foi apagado com sucesso!");
    }

    @Override
    public Object buscar() {
        return new DiarioOficial();
    }

}
