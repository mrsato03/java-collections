package exercicios.queues;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Estudante implements Comparable<Estudante> {
	private int id;
	private String nome;
	private double nota;
	
	public Estudante(int id, String nome, double nota) {
		this.id = id;
		this.nome = nome;
		this.nota = nota;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getNota() {
		return this.nota;
	}

	@Override
	public int compareTo(Estudante o) {
		if (this.getNota() > o.getNota()) {
			return -1;
		} else if (this.getNota() < o.getNota()) {
			return 1;
		} 
		if (this.getNome().compareTo(o.getNome()) == 0) {
			if (this.getId() > o.getId()) {
				return -1;
			} else if (this.getId() < o.getId()) {
				return 1;
			}
		}
		return this.getNome().compareTo(o.getNome());
		}
	}

class Prioridades {

	public List<Estudante> getEstudantes(List<String> eventos) {
		Queue<Estudante> fila = new PriorityQueue<Estudante>();
		for (String eve : eventos) {
			String[] editado = eve.split(" ");
			if (editado[0].equals("ADICIONAR")) {
				int id = Integer.parseInt(editado[3]);
				String nome = editado[1];
				double nota = Double.parseDouble(editado[2]);
				Estudante estudante = new Estudante(id, nome, nota);
				fila.add(estudante);
			} else {
				fila.poll();
			}
		}
		
		List<Estudante> lista = new ArrayList<Estudante>();
		final int TAMANHO = fila.size();
		for (int i = 0; i < TAMANHO; i++) {
			lista.add(fila.poll());
		}
		return lista;
	}
	
}

public class FilaPrioritaria {

	private final static Scanner scan = new Scanner(System.in);
    private final static Prioridades prioridades = new Prioridades();
    
    public static void main(String[] args) {
        int totalEventos = Integer.parseInt(scan.nextLine());    
        List<String> eventos = new ArrayList<>();
        
        while (totalEventos-- != 0) {
            String evento = scan.nextLine();
            eventos.add(evento);
        }
        
        List<Estudante> estudantes = prioridades.getEstudantes(eventos);
        
        if (estudantes.isEmpty()) {
            System.out.println("VAZIO");
        } else {
            for (Estudante st: estudantes) {
                System.out.println(st.getNome());
            }
        }
    }

}
