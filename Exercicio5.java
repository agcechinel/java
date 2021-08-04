import java.util.Scanner;

public class Exercicios3{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double distancia, velocidade, tempo, consumo;

        System.out.println("Digite a velocidade media");
        velocidade = teclado.nextDouble();
        System.out.println("Digite o tempo em horas de viagem");
        tempo = teclado.nextDouble();

        distancia = velocidade * tempo;
        consumo = distancia / 12.0;

        System.out.printf("Foram necessários %.1f litros de commbustivel\n",consumo);            