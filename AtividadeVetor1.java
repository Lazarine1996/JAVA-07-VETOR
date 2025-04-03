package atividadejava07;

import java.util.Arrays;
import java.util.Scanner;

public class AtividadeVetor1 {

	public static void main(String[] args) {
		int numeroProcurado;
		int posicaoEncontrada = 0;
		boolean foiEncontrado = false;

		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		Scanner Scanner = new Scanner(System.in);

		Arrays.sort(vetorInteiros);

		System.out.println("\nDigite o número que você deseja encontrar: ");
		numeroProcurado = Scanner.nextInt();

		for (int i = 0; i < 10; i++) {
			if (vetorInteiros[i] == numeroProcurado) {
				posicaoEncontrada = i;
				foiEncontrado = true;
			}
		}

		if (foiEncontrado)
			System.out.printf("\nO numero %d foi encontrado e está na Posição %d ", numeroProcurado, posicaoEncontrada);

		else {
			System.out.printf("\nO número %d não foi encontrado!", numeroProcurado);

		}
		Scanner.close();
	}

}
