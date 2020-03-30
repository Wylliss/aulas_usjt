package entrega2_factory_method_2_1;

public class Programa {

	public static void main(String[] args) {
		String[] lista = {"McNealy, Scott", "James Gosling", "Naughton, Patrick"};
		//se nada for passado como parâmetro
		if(args.length == 0) {
			args = lista;
		}
		@SuppressWarnings("unused")
		Nomes nomes = new Nomes(args);
	}

}
