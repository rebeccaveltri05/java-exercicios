import java.util.Scanner;

public class MyProgram {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a, b, c;
        double raiz1, raiz2, imaginaria, discriminante;

        System.out.print("Valor do coeficiente a: ");
        a = Double.parseDouble(in.nextLine());

        System.out.print("Valor do coeficiente b: ");
        b = Double.parseDouble(in.nextLine());

        System.out.print("Valor do coeficiente c: ");
        c = Double.parseDouble(in.nextLine());

        discriminante = (b * b) - (4 * a * c);

        if (discriminante > 0) {
            raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Existem duas raizes: x1 = " + raiz1 + " e x2 = " + raiz2);
        }

        else if (discriminante == 0) {
            raiz1 = raiz2 = -b / (2 * a);
            System.out.println("Existem duas raizes iguais: x1 = " + raiz1 + " e x2 = " + raiz2);
        }

        else if (discriminante < 0) {
            raiz1 = raiz2 = -b / (2 * a);
            imaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("Existem duas raízes complexas: x1 = " + raiz1 + " + " + imaginaria + " e x2 = " + raiz2
                    + " - " + imaginaria);

        }
        in.close();
    }
}
