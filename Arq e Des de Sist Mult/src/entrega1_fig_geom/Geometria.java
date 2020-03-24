package entrega1_fig_geom;
import java.util.ArrayList;

public class Geometria {
	public static void main(String[] args) {

		ArrayList<Figura> figuras = new ArrayList<>();

		
		figuras.add(new Losango(3,3));		
		figuras.add(new Triangulo(3,3));
		figuras.add(new Trapezio(3,2,2));
		figuras.add(new Circulo(3));
		figuras.add(new Retangulo(5,3));		
		figuras.add(new Quadrado(2,2));
		figuras.add(new Cubo(2,2));
		figuras.add(new Esfera(3));
		figuras.add(new Piramide(3,3));

		for (Figura figura : figuras) {
					
			System.out.print(figura);

		}


	}

}




