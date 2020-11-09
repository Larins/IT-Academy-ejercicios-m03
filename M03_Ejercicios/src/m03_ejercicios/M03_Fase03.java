package m03_ejercicios;

import java.util.*;

public class M03_Fase03 {
	public static void main(String[] args) {
		
		//Por simplicidad, declaramos e inicializamos las variables manualmente (en lugar de correr los bucles de la fase 01).
		String city1 = "Barcelona";
		String city2 = "Madrid";
		String city3 = "Valencia";
		String city4 = "Malaga";
		String city5 = "Cadiz";
		String city6 = "Santander";
		
		//Declaramos y poblamos el array.
		List<String> arrayCiutats = new LinkedList<>();
		
		arrayCiutats.add(city1);
		arrayCiutats.add(city2);
		arrayCiutats.add(city3);
		arrayCiutats.add(city4);
		arrayCiutats.add(city5);
		arrayCiutats.add(city6);
		
		//Sustituimos los caracteres "a" por "1".
	    
		int i;
	    for (i=0; i<arrayCiutats.size(); i++) {
	    	   String ArrayCiutatsModificades  = arrayCiutats.get(i);
	    	   ArrayCiutatsModificades = ArrayCiutatsModificades.replaceAll("a","4");
	    	   arrayCiutats.set(i, ArrayCiutatsModificades);
	    }

		//Reorganizamos el array por orden alfabético.
        Collections.sort(arrayCiutats); 
        
		//Printamos por pantalla los elementos del array por orden alfabético.
        for (String elemento : arrayCiutats) {
            System.out.println(elemento);
        }
		
	}

}
