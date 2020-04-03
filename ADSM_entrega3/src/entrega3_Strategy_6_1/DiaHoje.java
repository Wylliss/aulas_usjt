package entrega3_Strategy_6_1;

import java.util.Calendar;

public class DiaHoje {
	public void mensagemDoDia() {
		Calendar c = Calendar.getInstance();
		
		MensagemDoDia m = null;
		
		if(c.get(Calendar.DAY_OF_WEEK) == 1) {
			m = new Domingo();
		}
		
		if(c.get(Calendar.DAY_OF_WEEK) == 2) {
			m = new Segunda();
		}
		
		if(c.get(Calendar.DAY_OF_WEEK) == 3) {
			m = new Terca();
		}
		
		if(c.get(Calendar.DAY_OF_WEEK) == 4) {
			m = new Quarta();
		}
		
		if(c.get(Calendar.DAY_OF_WEEK) == 5) {
			m = new Quinta();
		}
		
		if(c.get(Calendar.DAY_OF_WEEK) == 6) {
			m = new Sexta();
		}
		
		if(c.get(Calendar.DAY_OF_WEEK) == 7) {
			m = new Sabado();
		}
		
		System.out.println(m.msgdia());
	}

}