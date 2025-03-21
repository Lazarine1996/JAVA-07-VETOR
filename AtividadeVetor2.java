package atividadejava07;

import java.util.Scanner;

public class AtividadeVetor2 {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		int vetorInteiros = 10;

		System.out.println("\nDigite 10 números inteiros de sua escolha: ");
		for (int i = 0; i < 10; i++) {
			vetorInteiros = lerScanner.nextInt();
		}
		System.out.println("\nOs elementos pares são:\n");
		for (int i = 0; i < 10; i++) {
			if (vetorInteiros % 2 == 0)
				System.out.println("Numeros pares são: " + i + vetorInteiros);
		}
		System.out.println("\nOs elementos ímpares são:\n");
		for (int i = 1; i < 10; i += 2) {
			System.out.println("Numeros ímpares" + i + vetorInteiros);
break;
		}
	

	int soma = 0;
	for(int i = 0; i < 10; i++) {
	
		soma += vetorInteiros;
				System.out.println ("Soma:" + soma);	
	
		int media = soma / 10;
		System.out.println("Media:" + media );
		
		lerScanner.close();
	}
}
}
