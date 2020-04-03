package entrega3_template_method_7_1;

public class Duplicar extends TransformadorDeTextos{

	@Override
	protected void transformar(String texto) {
		String duplicado;
		duplicado = texto;
		System.out.println("Duplicado: "+ duplicado + " " + texto);	

	}
}