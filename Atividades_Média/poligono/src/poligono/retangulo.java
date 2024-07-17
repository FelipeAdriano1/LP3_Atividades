package poligono;

public class retangulo extends poligono{

	private double largura;
	private double altura;
	
	public retangulo(double largura, double altura) {
		
		this.largura = largura;
		this.altura = altura;
	}
	
	double area(){
		double area = largura * altura;
		return area;
	}
}
