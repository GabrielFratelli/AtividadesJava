package exercicio;

import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int ano;
		int mes;
		int dia;
		
		System.out.println("Digite seu ano de nascimento");
		ano = sc.nextInt();
		
		System.out.println("Digite seu mês de nascimento");
		mes = sc.nextInt();
		
		System.out.println("Digite seu dia de nascimento");
		dia = sc.nextInt();
		
		
		int total = ano*365 + mes*30+dia;
		System.out.println("o total de dias é: " + total);
		sc.close();
	}
}
