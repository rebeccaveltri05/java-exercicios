import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.getNome();
        p1.setNome("Leia");
        p1.getSobrenome();
        p1.setSobrenome("Organa");
        p1.getSexo();
        p1.setSexo("Feminino");
        p1.imprime();
        // sobrescrevendo
        p1 = new Pessoa("Luke", "Skywalker", "Masculino");
        p1.imprime();
        Jedi j1 = new Jedi();
        j1.mindControl();
        Sith s1 = new Sith();
        s1.telepath();
        Jedi j2 = new Jedi("Obi-Wan", "Kenobi", "Jedi");
        j2.imprime();
        j2.mindControl(null);
        j2.mindControl();
        j2.levitation();
        Sith s2 = new Sith("Darth", "Vader", "Sith");
        s2.imprime();
        s2.levitation(null);
        s2.mindControl();
        s2.levitation();
        Saber sb1 = new Saber("azul", 0);
        ;
        Saber sb2 = new Saber("vermelho", 0);
        Blast b1 = new Blast("laser", 0);
        sb2.pickUp(s2.getTitulo(), s2.getNome(), s2.getSobrenome());
        sb1.pickUp(j2.getTitulo(), j2.getNome(), j2.getSobrenome());
        b1.pickUp(j2.getTitulo(), j2.getNome(), j2.getSobrenome());
        sb2.slash(s2.getTitulo(), s2.getNome(), s2.getSobrenome());
        b1.shot(j2.getTitulo(), j2.getNome(), j2.getSobrenome());

        b1.drop(j2.getTitulo(), j2.getNome(), j2.getSobrenome(), "Blaster");
        
    
        
        //ArrayList <Sith> w1 = new ArrayList <Sith>();
        //w1.add(sb2);
       // System.out.println("Armas do(a) " + " [" + s2.getTitulo() + "] " +  s2.getNome() + " " + s2.getSobrenome() + w1.toString());
        

        //ArrayList w2 = new ArrayList();
        //w2.add(sb1);
        //w2.add(b1);
        //System.out.println("Armas do(a) " + " [" + j2.getTitulo() + "] " +  j2.getNome() + " " + j2.getSobrenome() + /*Isso ainda n funfa */ w2.toString());
        
    }

}