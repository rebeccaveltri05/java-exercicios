import java.util.Scanner;

/**
 * MyProgram
 */
public class MyProgram {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double nota1, nota2;

        System.out.println("Entre com a primeira nota");
        nota1 = in.nextDouble();

        System.out.println("Entre com a segunda nota");
        nota2 = in.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7.0) {
            System.out.println("Voce foi Aprovado!");
        } else {
            System.out.println("Voce foi Reprovado!");
        }
        in.close();
    }

}
