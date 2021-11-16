package exercicio;

import java.util.Scanner;

public class Vendadecarros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salario;
		float preco_venda;
		
		System.out.println("digite o salário :");
		salario = sc.nextFloat();
		
		System.out.println("Digite o valor das vendas :");
		preco_venda = sc.nextFloat();
		
		if (preco_venda<=1500){
			float salariofinal = salario+(preco_venda*3/100);
			System.out.println("O eu salário final é :" + salariofinal);
		}
		else {
			float salariofinal=salario+(preco_venda*8/100);
			System.out.println("O seu salário final é :" + salariofinal);
		}
		
		sc.close();
	}
}
