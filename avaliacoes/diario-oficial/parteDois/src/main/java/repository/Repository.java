package repository;

import java.util.ArrayList;

/* Essa é a forma mais interessante de se criar a interface: definindo um tipo para ela.
 * Uma resolução alternativa (e esperada como entrega) é não colocar o <Type> e onde estiver type
 * colocar Object.
 */
public interface Repository<Type> {

    void salvar(Type obj);

    void novo(Type obj);

    void apagar(Type obj);

    ArrayList<Type> buscar();

}
