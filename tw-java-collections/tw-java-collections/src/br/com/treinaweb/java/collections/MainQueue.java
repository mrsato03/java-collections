package br.com.treinaweb.java.collections;

import java.util.PriorityQueue;
import java.util.Queue;

import br.com.treinaweb.java.collections.models.Pessoa;

public class MainQueue {

	public static void main(String[] args) {
		Queue<Pessoa> queue = new PriorityQueue<Pessoa>((p1, p2) -> {
			return p1.getNome().compareTo(p2.getNome());
		});
		queue.add(new Pessoa(3, "AHenrique 3"));
		queue.add(new Pessoa(1, "Henrique 1"));
		queue.add(new Pessoa(2, "Henrique 2"));
		// "offer" retorna falso, enquanto o "add" lan�a uma exce��o ao ultrapassar o tamanho da estrutura
		queue.offer(new Pessoa(4, "Henrique 4"));
		System.out.println(queue);
		while (!queue.isEmpty()) {
			Pessoa p = queue.poll();
			System.out.println(p);
		}
	
	}

}
