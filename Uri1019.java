import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horas, tempo, segundos, minutos, resto;

        tempo=teclado.nextInt();

        horas  = tempo/ 3600;
        resto = tempo % 3600;
        minutos = resto / 60;
        segundos =  resto % 60;

             

        System.out.println(horas+":"+minutos+":"+segundos);    
        
    }
}