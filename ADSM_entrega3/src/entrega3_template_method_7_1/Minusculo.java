package entrega3_template_method_7_1;

public class Minusculo extends TransformadorDeTextos {

	@Override
	protected void transformar(String texto) {
		System.out.println("Minusculo: " + texto.toLowerCase());
	}
}