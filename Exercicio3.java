import java.util.Scanner;

public class Exercicios3{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double qtdkw, salarioMinimo, valorKw, total, desconto;

        System.out.println("Digite o valor do Salario Minimo:");
        salarioMinimo = teclado.nextDouble();
        System.out.println("Digite a quantidade de kw consumido");
        qtdkw = teclado.nextDouble();

        valorkw = salarioMinimo/700;
        total = valorKw * qtdkw;
        desconto = valortotal * 0.9;

        System.out.printf("valor de 1kw R$ %.2f/n", valorKw);
        System.out.printf("valor total da conta R$ % 2f\n", total);
        System.out.printf("Valor com desconto de 10%% RS %.2f\n", desconto);



    }
}           