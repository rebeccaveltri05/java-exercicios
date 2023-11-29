import java.util.ArrayList;
import model.Player;
import model.Team;

public class MyApp {

    public static void main(String[] args) {

        Player german = new Player();
        german.setName("German");
        german.setSurname("Cano");
        german.setNumber(14);
        german.setPosition("atacante");

        Player john = new Player();
        john.setName("John");
        john.setSurname("Kennedy");
        john.setNumber(9);
        john.setPosition("atacante");

        Player andre = new Player();
        andre.setName("André");
        andre.setSurname(null);
        andre.setNumber(7);
        andre.setPosition("meio-campo");

        Team fluminense = new Team();
        fluminense.setName("Fluminense");
        fluminense.setColors("verde, grená e branca");
        
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(german);
        players.add(john);
        players.add(andre);
        fluminense.setPlayers(players);

    }
    
}
