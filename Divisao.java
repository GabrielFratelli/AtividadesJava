package exercicio;

import java.util.Scanner;

public class Divisao {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		float valor;
		float valor1;
			
		System.out.println("Digite o valor 1 :");
		valor = sc.nextInt();
		
		System.out.println("Digite o valor 2 :");
		valor1 = sc.nextInt();
		
		float total = (valor / valor1);
		System.out.print("O valor total é :" + total);
		sc.close();
		}
}
