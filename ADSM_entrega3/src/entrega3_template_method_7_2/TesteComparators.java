package entrega3_template_method_7_2;

import java.util.Arrays;

public class TesteComparators {

	private static final int NUM = 5;

	private static Double[] construirVetor() {
		Double[] d = new Double[NUM];
		for (int i = 0; i < d.length; i++)
			d[i] = Math.random() * NUM;
		return d;
	}

	public static void main(String[] args) throws Exception {

		Double[] v = construirVetor();

		Arrays.sort(v, new Comparators());

		System.out.print(Arrays.toString(v));
	}
}