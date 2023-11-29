import java.time.LocalDate;

public class Law extends Firm{

    private String insuranceQuote;
    private String govApprovement;

    public Law(String name, LocalDate foundation, String insuranceQuote, String govApprovement) {
        super(name, foundation);
        this.insuranceQuote = insuranceQuote;
        this.govApprovement = govApprovement;
    }

    public String info() {
        return "Law [name=" + getName() + ", foundation=" + getFoundation() + ", insuranceQuote=" + insuranceQuote + ", govApprovement=" + govApprovement + listEmployees() + "]";
    }

    public String getInsuranceQuote() {
        return insuranceQuote;
    }

    public void setInsuranceQuote(String insuranceQuote) {
        this.insuranceQuote = insuranceQuote;
    }

    public String getGovApprovement() {
        return govApprovement;
    }

    public void setGovApprovement(String govApprovement) {
        this.govApprovement = govApprovement;
    }
    
}
