package exercicios.sets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainSets {

	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		int t = Integer.valueOf(s.nextLine());
//	        
//	    List<String> nomes = new ArrayList<String>();
//	        
//	    for (int i = 0; i < t; i++) {
//	    	nomes.add(s.nextLine());
//	    }
//	    s.close();
	 
		Set<Carro> colecao = new TreeSet<>();  
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 9; i++){
            colecao.add(new Carro(sc.next(), sc.next(), sc.nextInt()));
        }
        
        for(Carro c : colecao)
            System.out.println(c);
	    
        sc.close();
	}

}
