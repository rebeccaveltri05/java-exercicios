import interfaces.I_Lawyer;

public class Attorney extends TypeJob implements I_Lawyer {

    @Override
    public void representClients() {
        System.out.println("represent x");
    }

    @Override
    public void research() {
        System.out.println("research x");
    }

    @Override
    public void analysis(String doc) {
        System.out.println("analysing " + doc);
    }

    @Override
    public void fileDocument(String type) {
        System.out.println("file Document is" + type);
    }
    
}
