package poligono;

public class Main {

	public static void main(String[] args) {
		
		poligono ret = new retangulo(10, 20);
		triangulo tri = new triangulo(24, 19);
		circulo cr = new circulo(90);
		
		System.out.println("Área do retângulo: " + ret.area());
		System.out.println("Área do triângulo: " + tri.area());
		System.out.println("Área do circulo: " + cr.area());
	}
}
