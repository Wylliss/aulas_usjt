package aula1;


public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base*altura)/2;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return  (0.5 * (Math.pow(base/2,2)) + (Math.pow(altura,2))) + base;
	}
	
	public String toString() {
				return "******TRIANGULO******"
			   +"\n �rea: " + area()
			   +"\n Per�metro:" + (perimetro())
			   +"\n";

}
}