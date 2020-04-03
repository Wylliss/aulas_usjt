package entrega3_facade_5_1;

public class Programa {

	/**
	 * Frequentemente precisamos ocultar um conjunto de classes com uma interface 
	 * complexa por tr�s de uma classe mais simples. Isso acontece, por exemplo, 
	 * ao reutilizar c�digo escrito por outra equipe de programadores.  
		Escreva uma classe Java chamada IOFacade que simplifique o uso dos recursos de 
		I/O do Java com m�todos para abrir arquivos texto, arquivos bin�rios e objetos. 
	 */
	
	public static void main(String[] args) {
		IOFacade ioFacade = new IOFacade ();
		System.out.println(ioFacade.abrirTexto("confidencial.txt"));
	}
}
