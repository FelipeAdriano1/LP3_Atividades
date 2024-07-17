package poligono;

public class triangulo {

	private double base;
	private double altura;
	
	public triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	double area() {
		
		double result;
		
		result = (base * altura) / 2;
		
		return result;
	}
}
