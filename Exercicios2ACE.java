import java.util.Scanner;

public class Exercicios2ACE{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double lado, area, altura, base, baseMaior, baseMenor;

        System.out.println("Por favor, digete o valor do lado");
        lado = teclado.nextDouble();

        area = lado * lado;

        System.out.printf("Valor da area = %.3f\n",area);

        //retangulo
   
       
        System.out.println("Por favor, digete o valor da base");
        base = teclado.nextDouble();

        System.out.println("Por favor, digete o valor do altura");
        altura = teclado.nextDouble();

        area = base * altura/2;

        System.out.printf("Valor da area = %.3f\n",area);

        //trapezio

        System.out.printf("Valor da area = %.3f\n",area);
        
        System.out.println("Por favor, digete o valor da base maior");
        baseMaior = teclado.nextDouble();

        System.out.println("Por favor, digete o valor da base menor");
        baseMenor = teclado.nextDouble();
        
        System.out.println("Por favor, digete o valor do altura");
        altura = teclado.nextDouble();

        area = (baseMaior + baseMenor) * altura/2;

        System.out.printf("Valor da area = %.3f\n",area);

    }

}