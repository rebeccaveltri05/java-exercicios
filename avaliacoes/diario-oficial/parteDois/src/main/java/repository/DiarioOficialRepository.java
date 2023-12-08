package repository;

import java.util.ArrayList;

import model.DiarioOficial;

public class DiarioOficialRepository implements Repository<DiarioOficial> {

    @Override
    public void salvar(DiarioOficial obj) {
        System.out.println("O Diário Oficial foi salvo com sucesso!");
    }

    @Override
    public void novo(DiarioOficial obj) {
        System.out.println("O Diário Oficial foi criado com sucesso!");
    }

    @Override
    public void apagar(DiarioOficial obj) {
        System.out.println("O Diário Oficial foi apagado com sucesso!");
    }

    @Override
    public ArrayList<DiarioOficial> buscar() {
        return new ArrayList<DiarioOficial>();
    }

}
