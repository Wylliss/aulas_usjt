package entrega3_Strategy_6_2;

public class Ordenador {
	private final Ordenacao ordenacao;

	public Ordenador(Ordenacao ordenacao) {
		this.ordenacao = ordenacao;
	}

	public void ordenarVetor (int[]vetor) {
		ordenacao.ordenar(vetor);
	}

}
