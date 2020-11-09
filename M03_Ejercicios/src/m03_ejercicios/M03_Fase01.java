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
		String entrada1 = "";
		while (city1.equals(entrada1) == false) {			
			entrada1 = JOptionPane.showInputDialog("Introduce las ciudades por este orden, por favor.\n1. Barcelona\n2. Madrid\n3. Valencia\n4. Malaga\n5. Cadiz\n6. Santander");
			if (city1.equals(entrada1) == false) {
				System.out.println("Vuelve a intentarlo. Recuerda el orden: Barcelona, Madrid, Valencia, Malaga, Cadiz, Santander.");
			}
		}
		System.out.println("Correcto, has introducido la ciudad nº1: " + city1);

		//Bucle 2
		city2 = "Madrid";		
		String entrada2 = "";
		while (city2.equals(entrada2) == false) {
			entrada2 = JOptionPane.showInputDialog("Introduce la siguiente ciudad por orden, por favor. Recuerda el orden:\n1. Barcelona\n2. Madrid\n3. Valencia\n4. Malaga\n5. Cadiz\n6. Santander");
			if (city2.equals(entrada2) == false) {
				System.out.println("Vuelve a intentarlo. Recuerda el orden: Barcelona, Madrid, Valencia, Malaga, Cadiz, Santander.");			
			}
		}
		System.out.println("Correcto, has introducido la ciudad nº2: " + city2);

		//Bucle 3
		city3 = "Valencia";		
		String entrada3 = "";
		while (city3.equals(entrada3) == false) {
			entrada3 = JOptionPane.showInputDialog("Introduce la siguiente ciudad por orden, por favor. Recuerda el orden:\n1. Barcelona\n2. Madrid\n3. Valencia\n4. Malaga\n5. Cadiz\n6. Santander");
			if (city3.equals(entrada3) == false) {
				System.out.println("Vuelve a intentarlo. Recuerda el orden: Barcelona, Madrid, Valencia, Malaga, Cadiz, Santander.");			
			}
		}
		System.out.println("Correcto, has introducido la ciudad nº3: " + city3);
		
		//Bucle 4
		city4 = "Malaga";		
		String entrada4 = "";
		while (city4.equals(entrada4) == false) {
			entrada4 = JOptionPane.showInputDialog("Introduce la siguiente ciudad por orden, por favor. Recuerda el orden:\n1. Barcelona\n2. Madrid\n4. Valencia\n4. Malaga\n5. Cadiz\n6. Santander");
			if (city4.equals(entrada4) == false) {
				System.out.println("Vuelve a intentarlo. Recuerda el orden: Barcelona, Madrid, Valencia, Malaga, Cadiz, Santander.");			
			}
		}
		System.out.println("Correcto, has introducido la ciudad nº4: " + city4);
		
		//Bucle 5
		city5 = "Cadiz";		
		String entrada5 = "";
		while (city5.equals(entrada5) == false) {
			entrada5 = JOptionPane.showInputDialog("Introduce la siguiente ciudad por orden, por favor. Recuerda el orden:\n1. Barcelona\n2. Madrid\n5. Valencia\n5. Malaga\n5. Cadiz\n6. Santander");
			if (city5.equals(entrada5) == false) {
				System.out.println("Vuelve a intentarlo. Recuerda el orden: Barcelona, Madrid, Valencia, Malaga, Cadiz, Santander.");			
			}
		}
		System.out.println("Correcto, has introducido la ciudad nº5: " + city5);
		
		//Bucle 6
		city6 = "Santander";		
		String entrada6 = "";
		while (city6.equals(entrada6) == false) {
			entrada6 = JOptionPane.showInputDialog("Introduce la siguiente ciudad por orden, por favor. Recuerda el orden:\n1. Barcelona\n2. Madrid\n6. Valencia\n6. Malaga\n6. Cadiz\n6. Santander");
			if (city6.equals(entrada6) == false) {
				System.out.println("Vuelve a intentarlo. Recuerda el orden: Barcelona, Madrid, Valencia, Malaga, Cadiz, Santander.");			
			}
		}
		System.out.println("Correcto, has introducido la ciudad nº6: " + city6);
		
		//Frase final con los 6 nombres de ciudades.
		System.out.println("Has introducido las 6 ciudades correctamente: " + city1 + ", " + city2 + ", " + city3+ ", " + city4 + ", " + city5  + ", " + city6 + ".");

	}

}
