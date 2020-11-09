//Clase principal y main.
package m03_ejercicios;

//Importamos los paquetes necesarios.
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//Clase principal y main.
public class M03_Fase02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
	
		//Reorganizamos el array por orden alfabético.
        Collections.sort(arrayCiutats); 
        
		//Printamos por pantalla los elementos del array, ahora sí, por orden alfabético.
        for (String elemento : arrayCiutats) {
            System.out.println(elemento);
        }

	}

}
