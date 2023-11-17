import java.util.Scanner;

public class MyProgram {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // os coeficientes
        double a, b, c;

        // as duas raizes, a imaginaria e o discriminante
        double raiz1, raiz2, imaginaria, discriminante;

        // Entrada dos valores dos coeficientes pelo usuário

        System.out.print("Valor do coeficiente a: ");
        a = Double.parseDouble(entrada.nextLine());

        System.out.print("Valor do coeficiente b: ");
        b = Double.parseDouble(entrada.nextLine());

        System.out.print("Valor do coeficiente c: ");
        c = Double.parseDouble(entrada.nextLine());

        // vamos calcular o discriminante

        discriminante = (b * b) - (4 * a * c);

        // Se a equação possuir duas soluções reais

        if (discriminante > 0) {
            raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Existem duas raizes: x1 = " + raiz1 + " e x2 = " + raiz2);
        }

        // a equação possui uma única solução real?

        else if (discriminante == 0) {
            raiz1 = raiz2 = -b / (2 * a);
            System.out.println("Existem duas raizes iguais: x1 = " + raiz1 + " e x2 = " + raiz2);
        }
        // a equação não possui solução real?

        else if (discriminante < 0) {
            raiz1 = raiz2 = -b / (2 * a);
            imaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("Existem duas raízes complexas: x1 = " + raiz1 + " + " + imaginaria + " e x2 = " + raiz2 + " - " + imaginaria);

        }
    }
}
