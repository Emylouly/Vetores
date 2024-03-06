package veto;

import java.util.Arrays;

public class ClasseNomes {

	private String nomes[] = new String[10];

	public String[] getNomes() {
		return nomes;
	}

	public void setNomes(String[] nomes) {
		this.nomes = nomes;
	}

	public void ImprimirNomes() {

		Arrays.sort(nomes);

		for (String n : nomes) {

			System.out.println(n);
		}

	}

}
