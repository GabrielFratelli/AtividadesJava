package exercicio;

import java.util.Scanner;

public class Notasescolar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1;
		float n2;
		float n3;
		float p1;
		float p2;
		float p3;
		
		System.out.println("Digite a nota 1 :");
		n1 = sc.nextFloat();
		
		System.out.println("Digite o peso 1 :");
		p1 = sc.nextFloat();
		
		System.out.println("Digite a nota 2 :");
		n2 = sc.nextFloat();
		
		System.out.println("Digite o peso 2 :");
		p2 = sc.nextFloat();
		
		System.out.println("Digite a nota 3 :");
		n3 = sc.nextFloat();
		
		System.out.println("Digite o peso 3 :");
		p3 = sc.nextFloat();
		
		float mediafinal = (n1*p1 + n2*p2 + n3*p3)/10;
		System.out.println("A média final é :" + mediafinal);
		sc.close();
	}
}
