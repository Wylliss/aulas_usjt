package entrega1_fig_geom;

public abstract class Poligono extends Figura{
	
	protected double  base;
	protected double altura;
	
	
	public Poligono(double base, double altura) {
		this.base = base;
		this.altura = altura;		
	}


	public double altura() {
		// TODO Auto-generated method stub
		return altura;
	}

	public double base() {
		// TODO Auto-generated method stub
		return base;
	}
}