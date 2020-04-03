package entrega3_facade_5_1;

public class Programa {

	/**
	 * Frequentemente precisamos ocultar um conjunto de classes com uma interface 
	 * complexa por trás de uma classe mais simples. Isso acontece, por exemplo, 
	 * ao reutilizar código escrito por outra equipe de programadores.  
		Escreva uma classe Java chamada IOFacade que simplifique o uso dos recursos de 
		I/O do Java com métodos para abrir arquivos texto, arquivos binários e objetos. 
	 */
	
	public static void main(String[] args) {
		IOFacade ioFacade = new IOFacade ();
		System.out.println(ioFacade.abrirTexto("confidencial.txt"));
	}
}
