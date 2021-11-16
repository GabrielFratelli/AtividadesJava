package exercicio;

import java.util.Scanner;

public class Areatriangulo {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		int valor1;
		
		System.out.println("Digite a Base : ");
		valor = sc.nextInt();
		
		System.out.println("Digite a Altura : ");
		valor1 = sc.nextInt();
		
		int total = (valor * valor1)/2;
		
		System.out.print("A área do triângulo é :" + total);
		sc.close();
	}
}
