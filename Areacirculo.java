package exercicio;

import java.util.Scanner;

public class Areacirculo {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio, area;

        System.out.println("Escreva o valor do raio:");
        raio = sc.nextDouble();

        area = 3.1416 * (Math.pow(raio, 2));

        System.out.println("O valor da area e:" + area);
        sc.close();
    }
}
