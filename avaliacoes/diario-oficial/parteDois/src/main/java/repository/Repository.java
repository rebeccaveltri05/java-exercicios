package repository;

public interface Repository {

    void salvar(Object obj);

    void novo(Object obj);

    void apagar(Object obj);

    Object buscar();

}
