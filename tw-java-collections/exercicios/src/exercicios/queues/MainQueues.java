package exercicios.queues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainQueues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> fila = new LinkedList<>();
		String input = sc.next();
		String[] separado = input.split("");
		fila.addAll(Arrays.asList(separado));

		int parenteses = 0;
		int colchetes = 0;
		int chaves = 0;
		int tamanho = fila.size();
		for (int i = 0; i < tamanho; i++) {
			String sinal = fila.poll();
			switch(sinal) {
				case "(":
					if (parenteses >= 0) {
						parenteses++;
						break;
					}
					break;
				case "[":
					if (colchetes >= 0) {
						colchetes++;
						break;	
					}
					break;
				case "{":
					if (chaves >= 0) {
						chaves++;
						break;
					}
					break;
				case ")":
					parenteses--;
					break;
				case "]":
					colchetes--;
					break;
				case "}":
					chaves--;
					break;
			}
		}
		
		if (parenteses == 0 && colchetes == 0 && chaves == 0) {
			System.out.println("Balanceada");
		} else {
			System.out.println("Não balanceada");
		}
		
		sc.close();
	}

}
