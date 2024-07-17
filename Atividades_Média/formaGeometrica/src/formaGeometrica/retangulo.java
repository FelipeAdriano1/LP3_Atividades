package formaGeometrica;

public class retangulo implements formaGeometrica {

	
	private double largura;
	private double altura;
	
	public retangulo(double altura, double largura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return largura * altura;
	}
	
	public double calcularPerimetro() {
		return 2 * (largura * altura);
	}
}
