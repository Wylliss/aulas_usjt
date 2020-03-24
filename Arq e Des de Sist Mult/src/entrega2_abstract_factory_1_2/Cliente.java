package entrega2_abstract_factory_1_2;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.FRIDAY;
import static java.util.Calendar.MONDAY;
import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.THURSDAY;
import static java.util.Calendar.TUESDAY;
import static java.util.Calendar.WEDNESDAY;

public class Cliente {
	private Pizzaiolo pizzaiolo;
	private Date data;

	public Cliente (java.util.Date data2) {
		this.data = (Date) data2;


		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data2);
		int diaSemana = calendar.get(DAY_OF_WEEK);

		switch (diaSemana) {

		case MONDAY:
		case WEDNESDAY:
		case FRIDAY:
			pizzaiolo = new PizzaioloCalabresa();
			break;

		case TUESDAY:
		case THURSDAY:
		case SATURDAY:
			pizzaiolo = new PizzaioloPresunto();
			break;
		}	
	}

	public void pedido() {

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy (EEEE)");

		if (pizzaiolo == null) {
			System.out.println("A pizzaria está fechada hoje! - " + df.format(data));
		} else {

			Pizza pizza = pizzaiolo.criarPizza();
			System.out.println("Pizza de hoje - " + df.format(data) + ":\n\t" + pizza.obterIngredientes());

			Calzone calzone = pizzaiolo.criarCalzone();
			System.out.println("Calzone de hoje - " + df.format(data) + ":\n\t" + calzone.obterIngredientes());
		}
	}
}

