package formaGeometrica;

public class Main {

	public static void main(String[] args) {
		
		quadrado quad = new quadrado(10);
		circulo cir = new circulo(20);
		retangulo ret = new retangulo(10, 20);
		
		System.out.println("Área quadrado: " + quad.calcularArea());
		System.out.println("Perímetro quadrado: " + quad.calcularPerimetro() + "\n");
		
		System.out.println("Área do círculo: " + cir.calcularArea());
		System.out.println("Perímetro do círculo: " + cir.calcularPerimetro() + "\n");
		
		System.out.println("Área do retângulo: " + ret.calcularArea());
		System.out.println("Perímetro do retângulo: " + ret.calcularPerimetro() + "\n");
	}
}
