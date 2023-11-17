import java.util.Random;
import java.util.Scanner;

public class MyProgram {

    Scanner in = new Scanner(System.in);

    int numeroAleatorio = new Random().nextInt(100);
    int tentativas = 0;
    int contador = 0;
    int  i;

    
    for (i = 0; i >= tentativas; i++){

        System.out.println("Adivinhe o número?");

        int numero = in.nextInt();

        if (numero > 100) {
            System.out.println("O número digitado não pode ser maior que 100.");
        } else {

            if (numero == numeroAleatorio) {
                System.out.println("Você acetou!!");
                break;

            } else {

                contador++;
                System.out.println("Errou!! você tem " + contador + " chances para acertar");

                if (numero > numeroAleatorio) {
                    System.out.println("O número que foi digitado é maior que o número sorteado.");

                } else {
                    System.out.println("O número que foi digitado é menor que o número sorteado.");

                }
            }

        }
    }

    System.out.println("Número sorteado: "+numeroAleatorio);

}
}