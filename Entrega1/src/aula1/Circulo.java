package aula1;

public class Circulo extends Figura{


	double pi = 3.1416;
	double raio;

	public Circulo(double raio) {		
		this.raio = raio;		
	}

	public double area() {
		return (pi * (raio*raio));
	}

	public double perimetro() {
		// TODO Auto-generated method stub
		return (2 * pi * raio);
	}
	
	public String toString() {
		return "******CIRCULO******"
	   +"\n �rea: " + area()
	   +"\n Per�metro:" + perimetro() 
	   +"\n";

	}
}