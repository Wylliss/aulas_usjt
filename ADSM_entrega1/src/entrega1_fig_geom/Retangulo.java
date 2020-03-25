package entrega1_fig_geom;


public class Retangulo extends Poligono implements Diagonal{

	public Retangulo(double altura, double base) {
		super(altura, base);

	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base*altura;
	}

	@Override
	public double calcDiagonal() {

		return Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
	}


	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 4 * base;
	}

	public String toString() {

		return "\n******RETANGULO******"
				+"\n Área: " + area()
				+"\n Diagonal:" + (calcDiagonal())
				+"\n Perímetro:" + (perimetro())
				+"\n"
				+"\n";
	}


}


