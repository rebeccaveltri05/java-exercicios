import interfaces.I_OperatingOfficer;
import interfaces.I_Partner;

public class COO extends Secretary implements I_Partner, I_OperatingOfficer{

    @Override
    public void supportExecutives() {
        throw new UnsupportedOperationException("Unimplemented method 'supportExecutives'");
    }

    @Override
    public void developPolicies() {
        System.out.println("develop Policies");
    }

    @Override
    public void coordinate() {
        System.out.println("coordinate");
    }

    @Override
    public void decisionMaking() {
        System.out.println("decision Making");
    }

    @Override
    public void profitRevenue() {
        System.out.println("profit Revenue");
    }
    
}
