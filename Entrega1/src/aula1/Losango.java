package aula1;

public class Losango extends Poligono{

	public Losango(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base*altura;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return (2 * base ) + (2 * altura);
	}


}
