package classeLivro;

public class estudante {

	private String nome;
	private int idade;
	private double nota;
	
	public estudante(String nome, int idade, double nota) {
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}
	
	public boolean isApproved(double nota) {
		if(nota > 7) {
			return true;
		}
		
		return false;
	}
}
