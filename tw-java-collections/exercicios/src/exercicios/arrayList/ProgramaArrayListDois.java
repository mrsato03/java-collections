package exercicios.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaArrayListDois {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Integer rep = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < rep; i++) 
			lista.add(sc.nextInt());
		
		int vzs = sc.nextInt();
		
		for (int i = 0; i < vzs; i++) {
			String op = sc.next();
			if(op.equals("Inserir")) {
				int posi = sc.nextInt();
				int valor = sc.nextInt();
				lista.add(posi, valor);
				
			} else {
				int posi = sc.nextInt();
				lista.remove(posi);
			}
		}
		
		lista.forEach(n -> System.out.print(n + " "));
		sc.close();
	}

}
