import vought.BillyCompoundV;
import vought.Hero;
import vought.Person;

public class MyApp {

    public static void main(String[] args) {

        Person billy = new Person("Billy", "Butcher");
        Hero billyHero = new Hero(billy, "Brutus", 10, 10, 10);
        BillyCompoundV billyCompoundV = new BillyCompoundV();
        billyCompoundV.activateDurability(billyHero);
        System.out.println("Energy is now " + billyHero.getEnergy());

    }
}
