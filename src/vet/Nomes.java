package vet;

import java.util.Scanner;

public class Nomes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ClasseNomes n = new ClasseNomes();
		String auxN[] = new String[10];

		System.out.println("Digite 10 nomes para serem listados: \n");
		
		for (int i = 0; i < 10; i++) {

			auxN[i] = input.nextLine();

			n.setNomes(auxN);

		}
		
		System.out.println("Nomes em ordem alfabética: \n");

		n.ImprimirNomes();

	}

}
