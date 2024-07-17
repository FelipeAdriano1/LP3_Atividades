package Atividade2;
import java.util.ArrayList;
import java.util.List;

public class cadEstudantes {

	List<Estudante> cad;
	
	public cadEstudantes() 
	{
		cad = new ArrayList<>();
	}
	
	public String cadEstudante(Estudante estudante) 
	{
		if(estudante != null) 
		{
			cad.add(estudante);
					
			return "Cadastro efetuado com sucesso !";
		}
		else {return "Não foi possível cadastrar o estudante.";}
	}
	
	public String removerEstudante(int idEstudante) 
	{
		for(Estudante estudante : cad)
		{
			if(estudante.getId() == idEstudante) 
			{
				cad.remove(estudante);
				return "O estudante foi removido com sucesso !!";
			}
		}
		return "Não foi possível remover o estudante.";
	}
	
	public String pesquisarEstudante(int idEstudante) 
	{
		for(Estudante estudante : cad)
		{
			if(estudante.getId() == idEstudante) 
			{
				return "\nNome: " + estudante.getNome() + 
						"\nIdade: " + estudante.getIdade() + 
						"\nNota: " + estudante.getNota() + 
						"\nidEstudante: " + estudante.getId();
			}
		}
		return null;
	}
}
