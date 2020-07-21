package exercicios.hashTables;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class MainHashTable {

	public static void main(String args[]) 
	    {
//	        for(Method declaredMethod : Programa.class.getDeclaredMethods())
//	        {
//	            Class<?>[] exceptionTypes = declaredMethod.getExceptionTypes();
//	            if(exceptionTypes.length > 0)
//	            {
//	                System.out.println("N�o deveria, mas implementei no m�todo:");
//	                for (Class<?> exception: exceptionTypes){
//	                    System.out.println(exception);
//	                }
//	            }
//	        }
//	        
	        Hashtable<String, String> dicionario = new Hashtable<String, String>();
	        dicionario.put("gato", "� um mam�fero carn�voro da fam�lia dos fel�deos ");
	        dicionario.put("cachorro", "� um mam�fero carn�voro da fam�lia dos can�deos");
	        
	        Iterator<String> it = dicionario.keySet().iterator();
	        
	        try
	        {
	            geraExcecao(dicionario);
	            
	            while (it.hasNext()) {
	                String chave = it.next();
	                System.out.println(chave + " - " + dicionario.get(chave));
	            }
	            
	        }catch(Exception ex)
	        {
	            System.out.println(ex.getClass().getName());
	        }
	   }

	private static void geraExcecao(Dictionary<String, String> dicionario) {
		Enumeration<String> iteratorChaves = dicionario.keys();
		dicionario.remove("gato");
	}

	        
}

	
