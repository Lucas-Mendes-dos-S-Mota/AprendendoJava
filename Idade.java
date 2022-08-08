package Familia57;

import java.util.Scanner;

public class Idade {
	
	public static void main(String[] args) {
		int idade,res,dias=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nQual sua idade? ");
		
		idade = leia.nextInt();
		
		res = (365 * idade);
			
		System.out.println("\nEm dias são " );
		System.out.println(+res);
		
		System.out.println("\nImforme os dias para saber a quantidade de meses");
		dias = leia.nextInt();
		
		res=(dias/30);
		
		System.out.println("\nSua idade é ");
		 System.out.println (+idade );
		// System.out.print(" anos");
		 
		 System.out.println("\nEm meses são ");
		System.out.println (+res);
		
		System.out.println("\nEm dias são");
		 System.out.println(+dias);
		
	}
	
	

}
