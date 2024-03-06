package vet;

public class ClasseSoma {

	private float soma[] = new float[10];
	private float resultado = 0;

	public float[] getSoma() {
		return soma;
	}

	public void setSoma(float[] soma) {
		this.soma = soma;
	}

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}

	public void ImprimirSoma() {

		for (int i = 0; i < 10; i++) {

			resultado = resultado + soma[i];

		}

		System.out.println("\nResultado da soma: " + resultado);

	}

}
