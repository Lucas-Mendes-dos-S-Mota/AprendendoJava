package Familia57;

import java.util.Scanner;

public class CategoriaIdade {
	public static void main (String arg[]) {
		Scanner leia = new Scanner(System.in); 
		int idade;
		System.out.println("\nImforme sua idade, para saber qual categoria está: ");
		idade = leia.nextInt();
		if (idade<=14) {
				System.out.println("\nVocê está na categoria infantil");
			
		
	}
		else if (idade<=17) {
			System.out.println("\nVocê está na categoria juvenil");
		}
		else if (idade<=25) {
			System.out.println("\nVocê está na categoria adulto");
			
		}
	}
}