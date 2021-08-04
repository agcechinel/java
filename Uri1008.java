import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
      Scanner teclado = new Scanner(System.in);

      int nFuncionario, hrTrabalhadas;
      double hrValor, salario;

        //System.out.println("Digite o numero do funcionario:");
        nFuncionario = teclado.nextInt();
        //System.out.println("Digite a quantidade de horas trabalhadas:");
        hrTrabalhadas = teclado.nextInt();
        //System.out.println("Digite o custo por hora:");
        hrValor = teclado.nextDouble();
    
        salario = hrTrabalhadas * hrValor;
        

        System.out.println("NUMBER = " + nFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        
    }
     
}
    

  

