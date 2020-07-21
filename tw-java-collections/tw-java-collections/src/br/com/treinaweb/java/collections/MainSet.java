package br.com.treinaweb.java.collections;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.treinaweb.java.collections.models.Pessoa;

public class MainSet {

	public static void main(String[] args) {
//		NavigableSet<Pessoa> set = new TreeSet<Pessoa>();
		Set<Pessoa> set = new LinkedHashSet<Pessoa>();
		set.add(new Pessoa(3, "Henrique 3"));
//		set.add(new Pessoa(4, "Henrique 4"));
		set.add(new Pessoa(1, "Henrique 1"));
		set.add(new Pessoa(2, "Henrique 2"));
//		Pessoa teste = set.lower(new Pessoa(2, "Henrique 2"));
//		System.out.println(teste);
		set.add(null);
		System.out.println(set);
		set.add(new Pessoa(2, "Henrique 2"));
		System.out.println(set);
		
		for (Pessoa p : set) {
			System.out.println(p);
		}
	}

}
