package Familia57;

import java.util.Scanner;

public class ExArrays2 {

	public static void main(String[] args) {
		int [][] matriz = new int [3][3]; 
		int contador = 0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Matriz M[3][3]\n");
		
		for(int lin = 0; lin < 3; lin++) {
			for(int col = 0; col < 3; col++) {
				System.out.printf("\nEntre com o primeiro valor M[%d][%d]: ",lin+1,col+1);
				matriz[lin][col]=leia.nextInt();
				
				if (matriz[lin][col] > 10) {
					contador++;   
				}
				
			}
		}
		
				System.out.println("\na Matriz ficou assim: \n");
		for(int lin = 0; lin < 3; lin++) {
			for(int col = 0; col < 3; col++) {
				System.out.printf(" %d " ,matriz[lin][col]);
						
			}
		}
				System.out.println("\nValores maiores que 10 são:");{
				System.out.println(contador);
		}
	}

}
	
