package atividadejava07;

import java.util.Arrays;
import java.util.Scanner;

public class AtividadeVetor1 {

	public static void main(String[] args) {
		
		
		int vetorInteiros[] = {2,5,1,3,4,9,7,8,10,6};
		Scanner lerScanner = new Scanner(System.in);
		
		Arrays.sort(vetorInteiros);
		
		System.out.println ("\nDigite o número que você deseja encontrar: " );
	
		for (int i = 0; i < 9; i++) {
			System.out.println( vetorInteiros[i]);
			
	
		System.out.println("\nO elemento escolhido está localizado na posição: ");
		     int posicao = Arrays.binarySearch(vetorInteiros, 10);
		     
	      if (posicao >= 0)
		     System.out.println("\nO elemento foi encontrado e está na Posição: " + posicao); 
		     
		     else  {
		    	 System.out.println("\nO número não foi encontrado!");
		     break;
		     }	
}
	
}
	
}
