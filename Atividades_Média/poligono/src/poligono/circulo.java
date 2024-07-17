package poligono;
import java.math.*;

public class circulo extends poligono{

	private double raio;
	
	public circulo(double raio) {
		this.raio = raio;
	}
	
	double area() {
		double result;
		
		result =  Math.PI * raio * raio;
		
		return result;
	}
}
