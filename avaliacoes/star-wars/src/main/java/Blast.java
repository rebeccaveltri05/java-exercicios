//Blast herda comportamentos e características de Weapon
public class Blast extends Weapon {

    public Blast(String descricao, int dano) {
        super(descricao, dano);
    }

    public void shot(Object a, Object b, Object c) {
        System.out.println("O " + a.toString() + ", " + b + " " + c.toString() + ", atirou no inimigo usando seu blast "
                + super.getDescricao());
    }

    @Override
    public void pickUp(Object o, Object p, Object q) {
        System.out.println(
                "O " + o.toString() + ", " + p + " " + q.toString() + ", recebeu o Blast " + super.getDescricao());
    }

    @Override
    public void drop(Object d, Object e, Object f, String g) {
        // TODO Auto-generated method stub
        super.drop(d, e, f, g);
    }

}