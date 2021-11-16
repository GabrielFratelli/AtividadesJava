package exercicio;

import java.util.Scanner;

public class Areaquadrado {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		
		int valor;
		
		System.out.println("Digite o valor do lado :");
		valor = sc.nextInt();
		
		int total = valor * valor;
		System.out.print("A area do quadrado é: " + total);
		sc.close();
		
	}
}
