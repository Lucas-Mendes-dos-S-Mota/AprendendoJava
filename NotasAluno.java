package Familia57;

import java.util.Scanner;

public class NotasAluno {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int nota1 , nota2 , nota3 ;
		double Mediafinal;
		 System.out.println("\nEntre com a primeira nota: " );
		 nota1 = leia.nextInt();
		 
		 System.out.println("\nEntre com a segunda nota: ");
		 nota2 = leia.nextInt();
		 
		 System.out.println("\nEntre com a terceira nota: ");
		 nota3 = leia.nextInt();
		 
		 Mediafinal = (nota1+nota2+nota3)/3;
		 System.out.println("\nSua media geral é: " );
		 System.out.println(+Mediafinal);
		 
	}
	
	{
	
		
	}

}
