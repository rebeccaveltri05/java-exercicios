import vought.BillyCompoundV;
import vought.Hero;
import vought.Homelander;
import vought.HomelanderCompoundV;
import vought.HughieCompoundV;
import vought.Person;
import vought.StarLight;
import vought.StarLightCompoundV;
import vought.Team;

public class MyApp {

    public static void main(String[] args) {

        Person ashley = new Person("Ashley", "Barret");
        Person billy = new Person("Billy", "Butcher");
        Person hughie = new Person("Hughie", "Campbell");
        Person anne = new Person("Rebecca", "Anne January");
        Person john = new Person("John", "Guilman");

        StarLight luzEstrela = new StarLight(anne, "Starlight", 0, 0, 0);
        Homelander capPatria = new Homelander(john, "Homelander", 0, 0, 0);

        StarLightCompoundV anneCompoundV = new StarLightCompoundV();
        HomelanderCompoundV johnCompoundV = new HomelanderCompoundV();

        anneCompoundV.usePower(luzEstrela);
        anneCompoundV.fly(luzEstrela);
        johnCompoundV.usePower(capPatria);
        johnCompoundV.fly(capPatria);

        Team seven = new Team();
        seven.getHeroes().add(luzEstrela);
        seven.getHeroes().add(capPatria);        

        Hero billyHero = new Hero(billy, "Brutus", 10, 10, 10);
        BillyCompoundV billyCompoundV = new BillyCompoundV();
        billyCompoundV.activateDurability(billyHero);
        System.out.println("Energy is now " + billyHero.getEnergy());

        Hero hughieHero = new Hero(billy, "Brutus", 10, 10, 10);
        HughieCompoundV hughieCompoundV = new HughieCompoundV();

        Team boys = new Team();
        boys.getHeroes().add(hughieHero);
        boys.getHeroes().add(billyHero);   

    }
}
