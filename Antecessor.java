package exercicio;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int valor;
		System.out.print("Digite um valor : ");
		valor = sc.nextInt();
		
		int total = (valor - 1);
		System.out.println("O Antecessor é : " + total);
		sc.close();
	}
}
