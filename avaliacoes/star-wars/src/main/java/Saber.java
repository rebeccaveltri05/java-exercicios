//Saber herda comportamentos e características de Weapon
public class Saber extends Weapon {

    public Saber(String descricao, int dano) {
        super(descricao, dano);
    }

    @Override
    public void pickUp(Object o, Object p, Object q) {
        System.out.println(
                "O " + o.toString() + ", " + p + " " + q.toString() + ", recebeu o sabre " + super.getDescricao());
    }

    /*
     * //Argumentos herdados de Weapon
     * public Saber(String descricao, int dano) {
     * super(descricao, dano);
     * }
     */
    // Método

    public void slash(Object a, Object b, Object c) {
        System.out.println("O " + a.toString() + ", " + b + " " + c.toString() + ", cortou o inimigo usando seu sabre "
                + super.getDescricao());
    }

    @Override
    public void drop(Object d, Object e, Object f, String g) {
        // TODO Auto-generated method stub
        super.drop(d, e, f, g);
    }

}