package exercicios.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaArrayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<ArrayList<Integer>> linhas = new ArrayList<ArrayList<Integer>>();
		
		System.out.println("Digite o tamanho do array: ");
		int tamanho = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < tamanho; i++) {
			ArrayList<Integer> colunas = new ArrayList<Integer>();
			System.out.println("Digite quantas casas deseja colocar: ");
			int casas = Integer.parseInt(sc.nextLine());
			
			for (int j = 0; j < casas; j++)
				colunas.add(Integer.parseInt(sc.nextLine()));
			
			linhas.add(colunas);
		}
		
		System.out.println("Buscar por elementos (vezes): ");
		int busca = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < busca; i++) {
			int x = Integer.parseInt(sc.nextLine());
			int y = Integer.parseInt(sc.nextLine());
			
			try {
				System.out.println(linhas.get(x-1).get(y-1));
			} catch(Exception ex) {
				System.out.println("ERRO!");
			}
		}
		
		sc.close();
	}

}
