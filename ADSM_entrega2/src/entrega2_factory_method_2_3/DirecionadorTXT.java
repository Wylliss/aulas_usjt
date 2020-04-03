package entrega2_factory_method_2_3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DirecionadorTXT extends Direcionador  {

	@Override
	public void criarLog() {

		int i;

		try {
			FileWriter arqi = new FileWriter("C:\\Users\\Public\\log.txt");
			@SuppressWarnings("resource")
			PrintWriter gravarArq = new PrintWriter(arqi);

			//  gravarArq.printf("+--Resultado--+%\n");
			for (i=1; i<=10; i++) {
				gravarArq.printf(""+i+"\n");
			}
			// gravarArq.printf("+-------------+%n");

			arqi.close();

			System.out.printf("Salvou");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}