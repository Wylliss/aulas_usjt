package entrega2_factory_method_2_1;

public class Nome {

	private String nome, sobrenome;

	public Nome(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	@Override
	public String toString() {
		return nome + " " + sobrenome;
	}	
}


