package entrega3_template_method_7_1;

public abstract class TransformadorDeTextos {

	public final void run(String texto) {
		transformar(texto);

	}

	protected abstract void transformar(String texto); 

}