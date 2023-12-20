import java.util.Scanner;

public class MyProgram {
    

public static void main(String[] args) {
        
    Scanner in = new Scanner (System.in);
    
    double nota1, nota2;
    
    System.out.println("Entre com a primeira nota");
    nota1 = in.nextDouble();
    
    System.out.println("Entre com a segunda nota");
    nota2 = in.nextDouble();


    double media = (nota1+nota2)/2;
    
    if (media >= 6.0) {
        System.out.println("O aluno foi Aprovado!");
    if (media < 2.0) {
        System.out.println("O aluno foi Reprovado!");
    }else{
        if(media >= 2.0 && media < 6.0){
            System.out.println(media + "O aluno está na Prova Final ");
        }
    }
in.close();
}

}
}