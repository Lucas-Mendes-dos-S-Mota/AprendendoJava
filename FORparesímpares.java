package Familia57;

import java.util.Scanner;

public class FORparesímpares {
	public static void main(String []args) {
		Scanner leia = new Scanner(System.in);
		int N=0,numeros,pares=0,impares=0;
		
		for(numeros=1;numeros<=10;numeros++) {
			
			System.out.println("\nEntre com os numeros");	
			N = leia.nextInt();
		
			if (N %2 == 0) {
				pares=pares+1;
			}
			else {
				impares = impares +1;  
			}
	 
		}

			System.out.printf("\nSão impares %d",impares);
			System.out.printf("\nSão pares %d", pares );
		}
	}

