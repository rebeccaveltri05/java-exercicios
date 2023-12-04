import model.Bloco;
import model.Contrato;
import model.DiarioOficial;
import model.Legislacao;
import repository.DiarioOficialRepository;

public class MyProgram {

    public static void main(String[] args) {

        DiarioOficial doNiteroi = new DiarioOficial("Diário Oficial de Niterói");
        Legislacao lei384 = new Legislacao();
        Contrato c266 = new Contrato();
        doNiteroi.getPublicações().add(lei384);
        doNiteroi.getPublicações().add(c266);

        Bloco bloco1 = new Bloco("Lei Nº 3.824 de 31 de outubro de 2023.");
        Bloco bloco2 = new Bloco("Declara o Grêmio Recreativo Patrimônio Cultural de Niterói.");

        Bloco bloco3 = new Bloco("EXTRATO DE TERMO DE CONTRATO Nº 266/2023");
        Bloco bloco4 = new Bloco("Prestação de Serviços de Buffet.");

        lei384.getBlocos().add(bloco1);
        lei384.getBlocos().add(bloco2);

        c266.getBlocos().add(bloco3);
        c266.getBlocos().add(bloco4);

        doNiteroi.imprimirDiario();

        DiarioOficialRepository doRep = new DiarioOficialRepository();
        doRep.salvar(doRep);

    }

}
