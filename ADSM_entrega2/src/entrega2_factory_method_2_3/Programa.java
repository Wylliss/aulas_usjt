package entrega2_factory_method_2_3;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		//para testar, digita "Arquivo" ou "Console"
		String test = JOptionPane.showInputDialog("Digite: ");
		DirecionadorFactory df = new DirecionadorFactory();
		df.gerarArq(test);
	}
}