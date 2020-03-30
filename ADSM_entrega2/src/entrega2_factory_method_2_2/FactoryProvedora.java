package entrega2_factory_method_2_2;

public class FactoryProvedora {

	public FactoryProvedora(String senha) {
		Provedora p;
		if (senha.equals("designpatterns")) {
			p = new ProvedoraConfidencial();
		}else {
			p = new ProvedoraPublica();
		} 
		System.out.println(p.proverInfo());
	} 
}