package Familia57;

import java.util.Scanner;

public class EXWhile {
	public static void main(String [] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade = 0,contador21=0,contador50=0;
		
		while(idade !=-99) {
			System.out.println("\nImfome sua idade");
			idade = leia.nextInt();
			System.out.printf("\nSua idade é %d ",idade);{
				
			}
			if(idade <= 21) {
			  contador21++;           
				System.out.println("\nVocê está com menos de 21 anos ");
			}
			if(idade >= 50 ) {
			  contador50++;
				  System.out.println("\nVocê está com mais de 50 anos");
				  
			  }
			
				
			}
			System.out.println("\nImfome sua idade ou para encerrar digite-99");
			idade = leia.nextInt();
			{
				
				System.out.printf("\n %d",contador21);
				System.out.printf("\n %d",contador50);
			}
			
		}
		
		
	}


