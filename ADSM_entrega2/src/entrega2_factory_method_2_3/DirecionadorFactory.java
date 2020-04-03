package entrega2_factory_method_2_3;

public class DirecionadorFactory {

	public Direcionador gerarArq(String arq) {
		if(arq.equals("Arquivo")) {
			Direcionador dr = new DirecionadorTXT();
			dr.criarLog();
		}
		else if(arq.equals("Console")) {
			Direcionador dc = new DirecionadorConsole();
			dc.criarLog();
		}

		return null;
	}

}