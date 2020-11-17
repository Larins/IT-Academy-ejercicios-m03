//Declarar el paquete.
package m03_ejercicios;

//Importamos los paquetes necesarios.
import java.util.*;
import javax.swing.*;

//Clase principal y main.
public class M03_Fase01 {

	public static void main(String[] args) {
		
		//Crear las 6 variables solicitadas.
		String city1 = "";
		String city2 = "";
		String city3 = "";
		String city4 = "";
		String city5 = "";
		String city6 = "";
		
		//Bucle 1
		city1 = "Barcelona";
		String salida = "SALIR";
		String entrada1 = "";
		while (city1.equalsIgnoreCase(entrada1) == false) {			
			entrada1 = JOptionPane.showInputDialog("Introduce las ciudades por este orden, por favor.\n1. Barcelona\n2. Madrid\n3. Valencia\n4. Malaga\n5. Cadiz\n6. Santander\nDe lo contrario, escribe SALIR.");
			if (salida.equalsIgnoreCase(entrada1) == true) {
				System.out.println("Vuelve a intentarlo cuando quieras.");
				System.exit(0);
			}
			else if (city1.equalsIgnoreCase(entrada1) == false) {
				System.out.println("Vuelve a intentarlo. Recuerda el orden: Barcelona, Madrid, Valencia, Malaga, Cadiz, Santander.");
			}
		}
		System.out.println("Correcto, has introducido la ciudad nº1: " + city1);

		//Bucle 2
		city2 = "Madrid";		
		String entrada2 = "";
		while (city2.equalsIgnoreCase(entrada2) == false) {
			entrada2 = JOptionPane.showInputDialog("Introduce las ciudades por este orden, por favor.\n1. Barcelona\n2. Madrid\n3. Valencia\n4. Malaga\n5. Cadiz\n6. Santander\nDe lo contrario, escribe SALIR.");
			if (salida.equalsIgnoreCase(entrada2) == true) {
				System.out.println("Vuelve a intentarlo cuando quieras.");
				System.exit(0);
			}
			else if (city2.equalsIgnoreCase(entrada2) == false) {
				System.out.println("Vuelve a intentarlo. Recuerda el orden: Barcelona, Madrid, Valencia, Malaga, Cadiz, Santander.");			
			}

		}
		System.out.println("Correcto, has introducido la ciudad nº2: " + city2);

		//Bucle 3
		city3 = "Valencia";		
		String entrada3 = "";
		while (city3.equalsIgnoreCase(entrada3) == false) {
			entrada3 = JOptionPane.showInputDialog("Introduce las ciudades por este orden, por favor.\n1. Barcelona\n2. Madrid\n3. Valencia\n4. Malaga\n5. Cadiz\n6. Santander\nDe lo contrario, escribe SALIR.");
			if (salida.equalsIgnoreCase(entrada3) == true) {
				System.out.println("Vuelve a intentarlo cuando quieras.");
				System.exit(0);
			}
			else if (city3.equalsIgnoreCase(entrada3) == false) {
				System.out.println("Vuelve a intentarlo. Recuerda el orden: Barcelona, Madrid, Valencia, Malaga, Cadiz, Santander.");			
			}

		}
		System.out.println("Correcto, has introducido la ciudad nº3: " + city3);
		
		//Bucle 4
		city4 = "Malaga";		
		String entrada4 = "";
		while (city4.equalsIgnoreCase(entrada4) == false) {
			entrada4 = JOptionPane.showInputDialog("Introduce las ciudades por este orden, por favor.\n1. Barcelona\n2. Madrid\n3. Valencia\n4. Malaga\n5. Cadiz\n6. Santander\nDe lo contrario, escribe SALIR.");
			if (salida.equalsIgnoreCase(entrada4) == true) {
				System.out.println("Vuelve a intentarlo cuando quieras.");
				System.exit(0);
			}
			else if (city4.equalsIgnoreCase(entrada4) == false) {
				System.out.println("Vuelve a intentarlo. Recuerda el orden: Barcelona, Madrid, Valencia, Malaga, Cadiz, Santander.");	
			}	
		}
		System.out.println("Correcto, has introducido la ciudad nº4: " + city4);
		
		//Bucle 5
		city5 = "Cadiz";		
		String entrada5 = "";
		while (city5.equalsIgnoreCase(entrada5) == false) {
			entrada5 = JOptionPane.showInputDialog("Introduce las ciudades por este orden, por favor.\n1. Barcelona\n2. Madrid\n3. Valencia\n4. Malaga\n5. Cadiz\n6. Santander\nDe lo contrario, escribe SALIR.");
			if (salida.equalsIgnoreCase(entrada5) == true) {
				System.out.println("Vuelve a intentarlo cuando quieras.");
				System.exit(0);
			}
			else if (city5.equalsIgnoreCase(entrada5) == false) {
				System.out.println("Vuelve a intentarlo. Recuerda el orden: Barcelona, Madrid, Valencia, Malaga, Cadiz, Santander.");			
			}
		}
		System.out.println("Correcto, has introducido la ciudad nº5: " + city5);
		
		//Bucle 6
		city6 = "Santander";		
		String entrada6 = "";
		while (city6.equalsIgnoreCase(entrada6) == false) {
			entrada6 = JOptionPane.showInputDialog("Introduce las ciudades por este orden, por favor.\n1. Barcelona\n2. Madrid\n3. Valencia\n4. Malaga\n5. Cadiz\n6. Santander\nDe lo contrario, escribe SALIR.");
			if (salida.equalsIgnoreCase(entrada6) == true) {
				System.out.println("Vuelve a intentarlo cuando quieras.");
				System.exit(0);
			}
			else if (city6.equalsIgnoreCase(entrada6) == false) {
				System.out.println("Vuelve a intentarlo. Recuerda el orden: Barcelona, Madrid, Valencia, Malaga, Cadiz, Santander.");			
			}
		}
		System.out.println("Correcto, has introducido la ciudad nº6: " + city6);
		
		//Frase final con los 6 nombres de ciudades.
		System.out.println("Has introducido las 6 ciudades correctamente: " + city1 + ", " + city2 + ", " + city3+ ", " + city4 + ", " + city5  + ", " + city6 + ".");

	}

}
