package formaGeometrica;

public class circulo implements formaGeometrica {
	
	private double area;
	
	public circulo(double area) {
		this.area = area;
	}
	
	public double calcularArea() {
		return Math.PI * area * area;
	}
	
	public double calcularPerimetro() {
		return 2 * Math.PI * area;
	}

}
