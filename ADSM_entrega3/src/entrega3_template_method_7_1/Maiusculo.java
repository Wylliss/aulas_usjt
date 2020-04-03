package entrega3_template_method_7_1;

public class Maiusculo extends TransformadorDeTextos {

	@Override
	protected void transformar(String texto) {
		System.out.println("Maiusculo: " + texto.toUpperCase());
	}
}