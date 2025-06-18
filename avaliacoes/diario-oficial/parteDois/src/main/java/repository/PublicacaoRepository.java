package repository;

import java.util.ArrayList;

import model.Publicacao;

public class PublicacaoRepository implements Repository<Publicacao> {

    @Override
    public void salvar(Publicacao obj) {
        System.out.println("O Diário Oficial foi Registrado com Sucesso.");
    }

    @Override
    public void novo(Publicacao obj) {
        System.out.println("O Diário Oficial foi Criado com Sucesso.");
    }

    @Override
    public void apagar(Publicacao obj) {
        System.out.println("O Diário Oficial foi Apagado com Sucesso.");
    }

    @Override
    public ArrayList<Publicacao> buscar() {
        return new ArrayList<Publicacao>();
    }
}
