package aula176.demo1.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		//Set<String> set = new HashSet<>(); // Mais rápido, mas não garante a ordem
		//Set<String> set = new TreeSet<>(); // Mais lento e ordena
		Set<String> set = new LinkedHashSet<>(); //Intermediário, mantem ordem de inserção
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
