package entrega1_fig_geom;

public class Cubo extends Quadrado implements Volume{



	public Cubo(double base, double altura) {
		super(base, altura);


	}

	public double volume() {
		//sendo base = altura
		return Math.pow(base, 3);

	}

	public String toString() {
		return "******CUBO******"
				+"\n Volume: " + volume()+" u.m.³"
				+"\n"
				+"\n";

	}


}


