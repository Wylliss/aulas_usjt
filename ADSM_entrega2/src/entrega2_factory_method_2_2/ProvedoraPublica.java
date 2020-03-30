package entrega2_factory_method_2_2;

public class ProvedoraPublica implements Provedora{

	@Override	
	public String proverInfo() {
		return lerArquivo("publico.txt");
	}
}