package aula1;


public class Esfera extends Circulo implements Volume {



	public Esfera(double raio) {

		super(raio);

	}




	@Override
	public double volume() {
		return ((4/3) * 3.14 * Math.pow(raio, 3));

	}

	public String toString() {			
		return "******ESFERA******"
				+"\n Volume: " + volume()+" u.m.�"
				+"\n"
				+"\n";

	}


}
