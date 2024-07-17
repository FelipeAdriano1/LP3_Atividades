package Atividade2;

public class Estudante {

	String nome;
	int idade;
	double nota;
	int idEstudante;
	
	public Estudante(String nome, int idade, double nota, int idEstudante) 
	{
		this.idade = idade;
		this.nota = nota;
		this.nome = nome;
		this.idEstudante = idEstudante;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public double getNota() 
	{
		return nota;
	}
	
	public int getIdade() 
	{
		return idade;
	}
	
	public int getId() 
	{
		return idEstudante;
	}
}
