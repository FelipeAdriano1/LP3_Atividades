package aula04main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio02 
{
	public static void main(String[] args) 
	{
        List<String> minhaLista = new ArrayList<>();
        
        minhaLista.add("Banana");
        minhaLista.add("Limão");
        minhaLista.add("Cenoura");
        minhaLista.add("Couve");
        minhaLista.add("Açucar");
        minhaLista.add("Maça");
        
        for(String itens : minhaLista) 
        {
        System.out.println(itens);
        }
        
        System.out.println("\n\nRemovendo o item 1 da lista ");
        
        minhaLista.remove(1);
        
        for(String itens : minhaLista) 
        {
        	System.out.println(itens);
        }
	}
}