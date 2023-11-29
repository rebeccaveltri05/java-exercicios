import interfaces.I_Partner;

public class NamePartner extends Attorney implements I_Partner{

    @Override
    public void decisionMaking() {
        System.out.println("decision Making");
    }

    @Override
    public void profitRevenue() {
        System.out.println("profit Revenue");
    }
    
}
