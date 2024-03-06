package vet;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ClasseSoma soma = new ClasseSoma();
		float auxSoma[] = new float[10];

		for (int i = 0; i < 10; i++) {
			
			System.out.print("\nNumero " + (i+1) + ": ");
			auxSoma[i] = input.nextFloat();
			soma.setSoma(auxSoma);

		}

		soma.ImprimirSoma();

	}

}
