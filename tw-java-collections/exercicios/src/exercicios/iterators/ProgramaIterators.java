package exercicios.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProgramaIterators {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Lista<Integer> lista = new Lista<Integer>(); 
        for (int i = 0; i < n; i++) {
            int valor = scan.nextInt();
            lista.inserir(valor);
        }
        
        for(int valor : lista){
            System.out.print(valor + " ");
        }
        
        scan.close();
    }
}

class Lista<T> implements Iterable<T> {

	private ArrayList<T> lista;
	
	public Lista() {
		lista = new ArrayList<T>();
	}
	
	public void inserir(T elemento) {
		lista.add(elemento);
	}	

	@Override
	public Iterator<T> iterator() {
		return lista.iterator();
	}
	
	
}
