package br.com.treinaweb.java.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import br.com.treinaweb.java.collections.models.Pessoa;

public class MainMap {

	public static void main(String[] args) {
		// parameter true: Access Order
		// Default Constructor: Access Insertion
		// Map<String, Pessoa> mapaPessoas = new LinkedHashMap<String, Pessoa>(16, 0.75f, true);
		Map<String, Pessoa> mapaPessoas = new TreeMap<String, Pessoa>(Comparator.reverseOrder());
		System.out.println(mapaPessoas.put("legal", new Pessoa(1, "Henrique 1")));
		System.out.println(mapaPessoas);
		System.out.println(mapaPessoas.put("legal", new Pessoa(2, "Henrique 1")));
		System.out.println(mapaPessoas);
//		mapaPessoas.put(null, new Pessoa(-1, "NULO"));
		System.out.println(mapaPessoas);
//		mapaPessoas.put(null, new Pessoa(-2, "NULO"));
		System.out.println(mapaPessoas);
		mapaPessoas.put("teste", null);
		System.out.println(mapaPessoas);
		Pessoa p = mapaPessoas.get("legal");
		System.out.println(p);
		System.out.println(mapaPessoas);
		mapaPessoas.put("a", new Pessoa(100, "Henrique 100"));
		System.out.println(mapaPessoas);
	}

}
