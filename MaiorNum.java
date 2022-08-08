package Familia57;

import java.util.Scanner;

public class MaiorNum {
         public static void main (String args[])
         {
        	 Scanner leia = new Scanner(System.in);
        	 int n1,n2,n3,maior = 0 ;
        	 System.out.println("\nEntre com o primeiro numero inteiro: ");
        	 n1 = leia.nextInt();
        	 System.out.println("\nEntre com o segundo numero inteiro: ");
        	 n2 = leia.nextInt();
        	 System.out.println("\nEntre com o terceiro numero inteiro: ");
        	 n3 = leia.nextInt();
        	 //maior = 
        		//System.out.println("")
        	 if(n1>=n2) {
        		 if(n1>n3)
        		 maior=n1;
        	 }
        	 else {
        		 if(n2>=n3)
        			 maior = n2;
        		 else
        			 maior = n3;
        	 }
        	 System.out.println("\nO maior numero é: "+maior);
         }
}
