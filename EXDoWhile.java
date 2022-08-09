package Familia57;

import java.util.Scanner;

public class EXDoWhile {
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		int n,soma=0;
		//int cont =0;
		
		do {
			
		System.out.println("\nInfome um numero: ");
		n = leia.nextInt();
		if(n == 0) {
			soma = n + n;
			
		}
		
		
		}while(n != 0);
		//soma = n + n;
		System.out.println("\nA soma é: " + soma );
		
		
		}		
}