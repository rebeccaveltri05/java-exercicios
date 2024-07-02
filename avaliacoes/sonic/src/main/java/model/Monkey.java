package model;

public class Monkey extends Character {
    
    public Monkey(String name, int life, String image, int x, int y) {
        super.setName(name);
        super.setLife(life);
        super.setX(x);
        super.setY(y);
        this.setImage(image);
    }

    @Override
    public void mover(Direction direction) {
        if (direction.equals(Direction.FRONT)) {
            super.setX(super.getX() + 1);
            System.out.println("Move: Frente - ( " + super.getX() + "," + super.getY() + " )");
        }

        else if (direction.equals(Direction.BACK)) {
            super.setX(super.getX() - 1);
            System.out.println("Move: Trás - ( " + super.getX() + "," + super.getY() + " )");
        }

        else if (direction.equals(Direction.UP)) {
            System.out.println("Escalando...");
            super.setY(super.getY() + 1);
            System.out.println("Move: Cima - ( " + super.getX() + "," + super.getY() + " )");
        }

        else if (direction.equals(Direction.DOWN)) {
            super.setY(super.getY() - 1);
            System.out.println("Move: Baixo - ( " + super.getX() + "," + super.getY() + " )");
        }
    }
}
