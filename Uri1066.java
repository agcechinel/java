import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor;
        int qtdepar, qtdeimpar, qtdepositivo, qtdenegativo;

        for (int cont=1; cont<= 5; cont++){
            valor = teclado.nextInt();
            if (valor > 0){
                qtdepar = qtdepar + 1;
            }

        }

        System.out.println(qtdepar + " valores pares");


    }
}