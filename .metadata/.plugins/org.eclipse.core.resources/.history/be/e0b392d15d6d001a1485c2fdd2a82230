package aula1;


public class Quadrado extends Poligono implements Diagonal {


	public Quadrado(double altura, double base) {
		super(altura, base);

	}

	@Override
	public double area() {		
		return base*altura; }

	@Override
	public double calcDiagonal() {

		return Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return  4 * base;
	}

	public String toString() {

		return "******QUADRADO******"
				+"\n Área: " + area()
				+"\n Diagonal:" + (calcDiagonal())
				+"\n Perímetro:" + (perimetro())
				+"\n"
				+"\n";

	}
}






