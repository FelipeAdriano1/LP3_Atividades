package agenda;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class agenda {
	
	private List<compromissos> lista;
	
	public agenda() {
		lista = new ArrayList<>();
	}
	
	public String addCompromisso(compromissos comp) {
			
		if(comp != null) {
			lista.add(comp);
			return "Compromisso adicionado com sucesso a agenda.";
		}
		else {
			return "Não foi possível adicionar o compromisso a agenda.";
		}
	}
	
	public List<compromissos> localizarComp(String data) {
		
		List<compromissos> comps = new ArrayList<>();
		
		for (compromissos l : lista) {
			if(l.getData() == data) {
				comps.add(l);
			}
		}
		
		return comps;
	}
}
