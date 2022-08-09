package Familia57;

import java.util.Scanner;

public class EXDoWhile {
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		int n,soma=0;
		
		
		do {
			
		System.out.println("\nInfome um numero: ");
		n = leia.nextInt();
		soma = n + soma;
		if(n == 0) {
			
			System.out.println("\nA soma é: " + soma );
		}
		
		
		}while(n >= 0);
		
		
		
		
		}		
}