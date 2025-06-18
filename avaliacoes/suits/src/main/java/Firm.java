import java.time.LocalDate;
import java.util.ArrayList;

public class Firm {

    private String name;
    private LocalDate foundation = LocalDate.now();
    private ArrayList<Person> employeers = new ArrayList<Person>();

    Firm() {
        
    }
    
    Firm(String name, LocalDate foundation) {
        this.name = name;
        this.foundation = foundation;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFoundation() {
        return foundation;
    }

    public void setFoundation(LocalDate foundation) {
        this.foundation = foundation;
    }

    public void setEmployeers(ArrayList<Person> employeers) {
        this.employeers = employeers;
    }

    public ArrayList<Person> getEmployeers() {
        return employeers;
    }

    public void setEmployeers(Person person) {
        this.employeers.add(person);
    }

    public String listEmployees() {
        String r = "Empregados: ";
        if(employeers.size() == 0)
            return r = "nenhum.";
        for (Person person : employeers) {
            r += person.getName() + ",";
        }
        return r + ".";
    }

    public String info() {
        return "Firm [name=" + name + ", foundation=" + foundation + "]";
    }

}
