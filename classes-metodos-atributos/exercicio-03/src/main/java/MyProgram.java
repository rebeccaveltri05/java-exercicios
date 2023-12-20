import java.util.Scanner;

public class MyProgram {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int valor1, valor2, valor3;

        System.out.println("Entre com o primeiro valor");
        valor1 = in.nextInt();

        System.out.println("Entre com o segundo valor");
        valor2 = in.nextInt();

        System.out.println("Entre com o terceiro valor");
        valor3 = in.nextInt();

        if (valor1 > valor2 && valor1 > valor3)
            System.out.println("Maior valor é :" + valor1);
        else if (valor2 > valor1 && valor2 > valor3)
            System.out.println("Maior valor é :" + valor2);
        else
            System.out.println("Maior valor é :" + valor3);

        in.close();
    }
}
