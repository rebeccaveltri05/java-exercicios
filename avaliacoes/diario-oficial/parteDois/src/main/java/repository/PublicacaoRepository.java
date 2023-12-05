package repository;

public abstract class PublicacaoRepository implements Repository {

    @Override
    public void salvar(Object obj) {
        System.out.println("O Diário Oficial foi Registrado com Sucesso.");
    }

    @Override
    public void novo(Object obj) {
        System.out.println("O Diário Oficial foi Criado com Sucesso.");
    }

    @Override
    public void apagar(Object obj) {
        System.out.println("O Diário Oficial foi Apagado com Sucesso.");
    }

    @Override
    public Object buscar() {
        return new Object();
    }
}
