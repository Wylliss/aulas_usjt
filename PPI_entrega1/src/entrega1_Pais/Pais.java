package entrega1_Pais;

public class Pais {
	public int id;
	public String nome;
	public long populacao;
	public double area;
	
	public Pais() {
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + ", populacao=" + populacao + ", area="
				+ area + "]";
	}

	public Pais(int id, String nome, long populacao, double area) {
		this.id = id;
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
	}
	
	public int getIdPais() {
		return id;
	}

	public void setIdPais(int idPais) {
		this.id = idPais;
	}

	public String getNomePais() {
		return nome;
	}

	public void setNomePais(String nomePais) {
		this.nome = nomePais;
	}

	public long getPopulacaoPais() {
		return populacao;
	}

	public void setPopulacaoPais(long populacaoPais) {
		this.populacao = populacaoPais;
	}

	public double getAreaPais() {
		return area;
	}

	public void setAreaPais(double areaPais) {
		this.area = areaPais;
	}
	
}