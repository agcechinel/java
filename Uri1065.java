import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero;
        int qtdepar = 0;

        for (int cont=1; cont<= 5; cont++){
            numero = teclado.nextInt();
            if (numero % 2 == 0){
                qtdepar = qtdepar + 1;
            }

        }

        System.out.println(qtdepar + " valores pares");


    }
}