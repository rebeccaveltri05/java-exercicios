package model;

public class Character {

    private String name;
    private int life;
    private String image;
    private int x;
    private int y;

    public Character() {
    }

    public Character(String name, int life, String image, int x, int y) {
        this.name = name;
        this.life = life;
        this.image = image;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getCoordinates() {
        return "x: " + this.x + ", y:" + this.y;
    }

    public void mover(Direction direction) {
        if (direction.equals(Direction.FRONT)) {
            this.x += 1;
            System.out.println("Move: Frente - ( " + this.x + "," + this.y + " )");
        }

        else if (direction.equals(Direction.BACK)) {

            this.x -= 1;
            System.out.println("Move: Trás - ( " + this.x + "," + this.y + " )");
        }

        else if (direction.equals(Direction.UP)) {

            this.y += 1;
            System.out.println("Move: Cima - ( " + this.x + "," + this.y + " )");
        }

        else if (direction.equals(Direction.DOWN)) {

            this.y -= 1;
            System.out.println("Move: Baixo - ( " + this.x + "," + this.y + " )");
        }
    }

}
