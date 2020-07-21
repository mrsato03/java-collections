package br.com.treinaweb.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import br.com.treinaweb.java.collections.models.Pessoa;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa(3, "Henrique 3"));
		pessoas.add(new Pessoa(1, "Henriq 1"));
		pessoas.add(new Pessoa(2, "Henr 2"));
		System.out.println("Antes da ordena��o: ");
		System.out.println(pessoas);

		// Comparable - compareTo
//		Collections.sort(pessoas);
		
		// Comparator
//		Collections.sort(pessoas, (Comparator<Pessoa>)(o1, o2) -> {
//			if (o1.getNome().length() == o2.getNome().length()) {
//				return 0;
//			} else if (o1.getNome().length() < o2.getNome().length()) {
//				return -1;
//			}
//			return 1;
//		});
		
//		Collections.sort(pessoas, new PessoaTamanhoNomeComparator());;
		
//		pessoas.sort((o1, o2) -> {
//			if (o1.getNome().length() == o2.getNome().length()) {
//				return 0;
//			} else if (o1.getNome().length() < o2.getNome().length()) {
//				return -1;
//			}
//			return 1;
//		});

//		pessoas.sort(Comparator.comparingInt(Pessoa::getId));
		
//		pessoas.sort(Comparator.comparing(Pessoa::getNome, (o1, o2) -> {
//			if (o1.length() == o2.length()) {
//				return 0;
//			} else if (o1.length() < o2.length()) {
//				return -1;
//			}
//			return 1;
//		}));
		
		// Usa compareTo
//		pessoas.sort(Comparator.naturalOrder());
//		pessoas.sort(Comparator.reverseOrder());
		
		System.out.println("Depois da ordena��o: ");
		System.out.println(pessoas);
		
//		pessoas.remove(new Pessoa(1, "Henrique 1"));
//		
//		System.out.println(pessoas.contains(new Pessoa(2, "Henrique 2")));
		
//		System.out.println("Com FOR: ");
//		for (int i = 0; i < pessoas.size(); i++) {
//			Pessoa p = pessoas.get(i);
//			System.out.println(p);
//		}
		
//		System.out.println("Com ITERATOR: ");
//		Iterator<Pessoa> iteratorPessoa = pessoas.iterator();
//		while (iteratorPessoa.hasNext()) {
//			Pessoa p = iteratorPessoa.next();
//			if (p.getId() == 1) {
////				pessoas.remove(p);
//				iteratorPessoa.remove();
//			}
//			System.out.println(p);
//		}
//		pessoas.removeIf(p -> p.getId() == 1);
//		System.out.println(pessoas);
//		
		// For-each
//		System.out.println("Com FOREACH: ");
//		for (Pessoa p : pessoas) {
//			System.out.println(p);
//		}
		
		System.out.println("FIM!");
	}
}
