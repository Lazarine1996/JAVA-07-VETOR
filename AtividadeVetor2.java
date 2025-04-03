package atividadejava07;

import java.util.Scanner;

public class AtividadeVetor2 {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		int vetorInteiros[] = new int[10];
		int soma = 0;
		double media = 0.0f;

		System.out.println("\nDigite 10 números inteiros de sua escolha: ");
		for (int i = 0; i < 10; i++) {
			vetorInteiros[i] = lerScanner.nextInt();
		}
		System.out.println("\nOs elementos ímpares são:\n");
		for (int i = 1; i < 10; i++) {
			if (!(i % 2 == 0)) {
				System.out.print(" " + vetorInteiros[i]);
			}
		}

		System.out.println("\nOs elementos pares são:\n");
		for (int i = 0; i < 10; i++) {
			if (vetorInteiros[i] % 2 == 0)
				System.out.println("Numeros pares são: " + vetorInteiros[i]);
		}

		for (int i = 0; i < 10; i++) {

			soma += vetorInteiros[i];

		}
		media = (double) soma / 10;
		System.out.printf("Media: %.2f\n", media);
		System.out.println("Soma:" + soma);
		lerScanner.close();
	}
}
