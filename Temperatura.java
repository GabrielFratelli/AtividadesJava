package exercicio;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float valor;
		System.out.println("Digite o valor em graus Fahrenheit :");
		valor = sc.nextFloat();
		
		float valorfinal = ((valor-32)/9)*5;
		System.out.println("A temperatura em celsius é :" + valorfinal);
		sc.close();
	}
}
