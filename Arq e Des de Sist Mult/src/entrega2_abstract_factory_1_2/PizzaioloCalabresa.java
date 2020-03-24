package entrega2_abstract_factory_1_2;

public class PizzaioloCalabresa implements Pizzaiolo{

	@Override
	public Pizza criarPizza() {
		return new PizzaCalabresa();
	}

	@Override
	public Calzone criarCalzone() {
		return new CalzoneCalabresa();
	}
}