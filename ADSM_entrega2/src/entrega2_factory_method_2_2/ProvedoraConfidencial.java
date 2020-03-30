package entrega2_factory_method_2_2;

public class ProvedoraConfidencial implements Provedora {

	@Override
	public String proverInfo() {
		// TODO Auto-generated method stub
		return lerArquivo("confidencial.txt");
	}
}
