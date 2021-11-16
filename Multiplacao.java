package exercicio;

import java.util.Scanner;

public class Multiplacao {
	
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int valor;
	int valor1;
		
	System.out.println("Digite o valor 1 :");
	valor = sc.nextInt();
	
	System.out.println("Digite o valor 2 :");
	valor1 = sc.nextInt();
	
	int total = (valor * valor1);
	System.out.print("O valor total é :" + total);
	sc.close();
	}
}
