package br.com.treinaweb.java.collections;

import java.util.Set;
import java.util.TreeSet;

import br.com.treinaweb.java.collections.models.Pessoa;

public class MainSet2 {

	public static void main(String[] args) {
//		HashSet<Pessoa> pessoas = new HashSet<Pessoa>();
		// HashSet desordena ao passar do tamanho padr�o (16)	
//		System.out.println(pessoas.add(new Pessoa(1, "Henrique 1")));
//		System.out.println(pessoas);
//		System.out.println(pessoas.add(new Pessoa(4, "Henrique 4")));
//		System.out.println(pessoas.add(new Pessoa(2, "Henrique 2")));
//		System.out.println(pessoas.add(new Pessoa(3, "Henrique 3")));
//		System.out.println(pessoas.add(new Pessoa(5, "Henrique 3")));
//		System.out.println(pessoas.add(new Pessoa(6, "Henrique 3")));
//		System.out.println(pessoas.add(new Pessoa(7, "Henrique 3")));
//		System.out.println(pessoas.add(new Pessoa(8, "Henrique 3")));
//		System.out.println(pessoas.add(new Pessoa(9, "Henrique 3")));
//		System.out.println(pessoas.add(new Pessoa(10, "Henrique 3")));
//		System.out.println(pessoas.add(new Pessoa(11, "Henrique 3")));
//		System.out.println(pessoas.add(new Pessoa(12, "Henrique 3")));
//		System.out.println(pessoas.add(new Pessoa(13, "Henrique 3")));
//		System.out.println(pessoas.add(new Pessoa(14, "Henrique 3")));
//		System.out.println(pessoas.add(new Pessoa(15, "Henrique 3")));
//		System.out.println(pessoas.add(new Pessoa(16, "Henrique 3")));
//		System.out.println(pessoas.add(new Pessoa(17, "Henrique 3")));		
//		System.out.println(pessoas);
		
		// LinkedHashSet preserva a ordem de inser��o independente do tamanho
//		Set<Pessoa> pessoas = new LinkedHashSet<Pessoa>();
//		System.out.println(pessoas.add(new Pessoa(1, "Henrique 1")));
//		System.out.println(pessoas);
//		System.out.println(pessoas.add(new Pessoa(2, "Henrique 2")));
//		System.out.println(pessoas.add(new Pessoa(3, "Henrique 3")));
//		System.out.println(pessoas.add(new Pessoa(4, "Henrique 4")));
//		System.out.println(pessoas.add(new Pessoa(5, "Henrique 5")));
//		System.out.println(pessoas.add(new Pessoa(6, "Henrique 6")));
//		System.out.println(pessoas.add(new Pessoa(7, "Henrique 7")));
//		System.out.println(pessoas.add(new Pessoa(8, "Henrique 8")));
//		System.out.println(pessoas.add(new Pessoa(9, "Henrique 9")));
//		System.out.println(pessoas.add(new Pessoa(10, "Henrique 10")));
//		System.out.println(pessoas.add(new Pessoa(11, "Henrique 11")));
//		System.out.println(pessoas.add(new Pessoa(12, "Henrique 12")));
//		System.out.println(pessoas.add(new Pessoa(13, "Henrique 13")));
//		System.out.println(pessoas.add(new Pessoa(14, "Henrique 14")));
//		System.out.println(pessoas.add(new Pessoa(15, "Henrique 15")));
//		System.out.println(pessoas.add(new Pessoa(16, "Henrique 16")));
//		System.out.println(pessoas.add(new Pessoa(17, "Henrique 17")));		
//		System.out.println(pessoas);
//		
		
		// Usa Comparable
		Set<Pessoa> pessoas = new TreeSet<Pessoa>();
		System.out.println(pessoas.add(new Pessoa(1, "Henrique 1")));
		System.out.println(pessoas);
		System.out.println(pessoas.add(new Pessoa(2, "Henrique 2")));
		System.out.println(pessoas.add(new Pessoa(3, "Henrique 3")));
		System.out.println(pessoas.add(new Pessoa(4, "Henrique 4")));
		System.out.println(pessoas.add(new Pessoa(5, "Henrique 5")));
		System.out.println(pessoas.add(new Pessoa(6, "Henrique 6")));
		System.out.println(pessoas.add(new Pessoa(7, "Henrique 7")));
		System.out.println(pessoas.add(new Pessoa(8, "Henrique 8")));
		System.out.println(pessoas.add(new Pessoa(9, "Henrique 9")));
		System.out.println(pessoas.add(new Pessoa(10, "Henrique 10")));
		System.out.println(pessoas.add(new Pessoa(11, "Henrique 11")));
		System.out.println(pessoas.add(new Pessoa(12, "Henrique 12")));
		System.out.println(pessoas.add(new Pessoa(13, "Henrique 13")));
		System.out.println(pessoas.add(new Pessoa(14, "Henrique 14")));
		System.out.println(pessoas.add(new Pessoa(15, "Henrique 15")));
		System.out.println(pessoas.add(new Pessoa(16, "Henrique 16")));
		System.out.println(pessoas.add(new Pessoa(17, "Henrique 17")));		
		System.out.println(pessoas);
	}

}
