package aula1;


public class Piramide extends Triangulo implements Volume {

	private double altura;

	public Piramide(double base, double altura) {
		super(base,altura);
		this.altura = altura;

	}

	@Override
	public double volume() {

		return 0.33 * Math.pow(base,2) * altura;
	}


	public String toString() {

		return "---PIRAMIDE---"
				+"\n Volume: " + volume() +" u.m.�"
				+"\n"
				+"\n";

	}

}
