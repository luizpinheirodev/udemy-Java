package aula176.demo1.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		//Set<String> set = new HashSet<>(); // Mais r�pido, mas n�o garante a ordem
		//Set<String> set = new TreeSet<>(); // Mais lento e ordena
		Set<String> set = new LinkedHashSet<>(); //Intermedi�rio, mantem ordem de inser��o
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		//set.remove("Tablet");
		//set.removeIf(x -> x.length() >= 3);
		set.removeIf(x -> x.charAt(0) == 'T');
	
		//System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
	}

}
