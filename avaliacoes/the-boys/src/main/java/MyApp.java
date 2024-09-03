import vought.Hero;
import vought.Person;

public class MyApp {

    public static void main(String[] args) {

        Person billy = new Person("Billy", "Butcher");
        Hero billyHero = new Hero(billy, "Brutus", 10, 10, 10);
        System.out.println("..... " + billyHero.getName());


        

    }
}
