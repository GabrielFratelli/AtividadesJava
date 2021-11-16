package exercicio;

import java.util.Scanner;

public class Sucessor {

		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			
			int valor;
			System.out.print("Digite um valor : ");
			valor = sc.nextInt();
			
			int total = (valor + 1);
			System.out.println("O sucessor é : " + total);
			sc.close();
		}
}
