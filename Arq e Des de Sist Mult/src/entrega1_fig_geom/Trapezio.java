package entrega1_fig_geom;


public class Trapezio extends Figura{

	double baseMaior;
	double base;
	double altura;

	public Trapezio(double baseMaior, double base, double altura) {
		this.base = base;
		this.altura = altura;
		this.baseMaior = baseMaior;

	}


	public double area() {			

		return (((baseMaior+base)/2) * altura) ;
	}


	public double perimetro() {
		// TODO Auto-generated method stub
		return baseMaior + base + altura + altura;
	}


	public String toString() {			
		return "******TRAP�ZIO******"
				+"\n �rea: " + area()
				+"\n Per�metro:" + (perimetro())
				+"\n"
				+"\n";
	}
}
