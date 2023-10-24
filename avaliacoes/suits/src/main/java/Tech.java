import java.time.LocalDate;

public class Tech extends Firm {

    private String nonDisclosure;
    private String ipAddress;
    
    Tech(String name, LocalDate foundation, String nonDisclosure, String ipAddress) {
        super(name, foundation);
        this.nonDisclosure = nonDisclosure;
        this.ipAddress = ipAddress;
    }

    public String getNonDisclosure() {
        return nonDisclosure;
    }

    public void setNonDisclosure(String nonDisclosure) {
        this.nonDisclosure = nonDisclosure;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String info() {
        return "Tech [name=" + getName() + ", foundation=" + getFoundation() + " ,nonDisclosure=" + nonDisclosure + ", ipAddress=" + ipAddress + listEmployees() + "]";
    }
    
}
