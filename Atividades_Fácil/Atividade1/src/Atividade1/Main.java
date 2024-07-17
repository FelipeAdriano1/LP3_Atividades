package Atividade1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Calculadora calc = new Calculadora();
		
		System.out.println("SOMA: " + calc.Somar(12, 78));
		
		System.out.println("Subtração: " + calc.Subtrair(12, 78));
		
		System.out.println("Divisão: " + calc.Dividir(12, 78));
		
		System.out.println("Multiplicação: " + calc.Multiplicação(12, 78));
	}
}
