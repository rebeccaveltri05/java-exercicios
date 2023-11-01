public class Weapon extends Pessoa {
    private String descricao;
    private int dano;
    

    public Weapon(String descricao, int dano) {
        this.descricao = descricao;
        this.dano = dano;
    }

    public void drop(Object d, Object e, Object f, String g) {
        System.out.println("O " + d.toString() + ", " + e + " " + f.toString() + ", soltou seu " + g);
    }

    public void pickUp(Object o, Object p, Object q) {
        System.out.println("O " + o.toString() + ", " + p + " " + q.toString() + ", recebeu um " + descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

}
