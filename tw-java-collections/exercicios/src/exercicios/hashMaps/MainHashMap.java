package exercicios.hashMaps;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Produto {
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco)
    {
        this.nome = nome;
        this.preco = preco;
    }
    
    public String toString()
    {
        return String.format("%s - R$%5.2f", nome, preco);
    }
}

public class MainHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Produto> estoque = new TreeMap<Integer, Produto>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// Compara �mpar
				if (o1 % 2 != 0 && o1 < o2)
					return 1;
				else if (o1 % 2 != 0 && o1 > o2) 
					return -1;
				
				// Compara Par
				if (o1 > o2) 
					return 1;
				else if (o1 < o2) 
					return -1;
				// Iguais
				return 0;
			}
		});
		
//		int count = 0;
//		while (sc.hasNext()) {
//			estoque.put(++count, new Produto(sc.next(), sc.nextDouble()));
//		}
		
//        estoque.put(1, new Produto("celular", 999.99));
//        estoque.put(2, new Produto("computador", 2499.90));
//        estoque.put(3, new Produto("tv", 1299.50));
//        estoque.put(4, new Produto("drive", 149.50));
//        estoque.put(5, new Produto("usb", 120.75));
//        estoque.put(6, new Produto("teclado", 450.31));
		
		while (sc.hasNext()) {
			estoque.put(sc.nextInt(), new Produto(sc.next(), sc.nextDouble()));
		}
		
		estoque.forEach((chave, valor) -> System.out.println(String.format("%d=%s", chave, valor)));
	}

}
