package Atividade2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inicio {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String nome = null;
		int idade = 0;
		int idEstudante = 0;
		double nota = 0;

		try {
			System.out.println("Cadastrando estudante...");

			System.out.println("Digite o nome do estudante: ");
			nome = reader.readLine();
			
			System.out.println("Digite a idade do estudante: ");
			idade = Integer.parseInt(reader.readLine());
			
			System.out.println("Digite o id do estudante: ");
			nota = Double.parseDouble(reader.readLine());
				
			System.out.println("Digite a nota do estudante: ");
			idEstudante = Integer.parseInt(reader.readLine());
			
		}catch (IOException e) {e.printStackTrace();} 
		finally {System.out.println("Fim do cadastro (finally). \n");}

		Estudante estudante = new Estudante(nome, idade, nota, idEstudante);
		cadEstudantes cad = new cadEstudantes();

		System.out.println(cad.cadEstudante(estudante));
		
		System.out.println("\n\nPesquisando o estudante cadastrado...");
		System.out.println(cad.pesquisarEstudante(idEstudante));
		
		System.out.println("\n\nPor fim, removendo o estudante do cadastro.");
		System.out.println(cad.removerEstudante(idEstudante));

	}
}
