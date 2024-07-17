package formaGeometrica;

public class quadrado implements formaGeometrica {

	private double area;
	
	public quadrado(double area) {
		this.area = area;
	}
	
	public double calcularArea() {
		return area * area;
	}
	
	public double calcularPerimetro() {
		return area * 4;
	}
}
