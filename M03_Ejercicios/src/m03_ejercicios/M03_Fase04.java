package m03_ejercicios;
import java.util.*;

public class M03_Fase04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creamos los 6 strings: uno para cada ciudad.
		String barc = "Barcelona";
		String madr = "Madrid";
		String vale = "Valencia";
		String mala = "Malaga";
		String cadi = "Cadiz";
		String sant = "Santander";
		
		//Creamos los 6 arrays: uno para cada ciudad, con la longitud adecuada en cada caso.
		
		char barcelona[] = new char [barc.length()]; 
		char madrid[] = new char [madr.length()]; 
		char valencia[] = new char [vale.length()]; 
		char malaga[] = new char [mala.length()]; 
		char cadiz[] = new char [cadi.length()]; 
		char santander[] = new char [sant.length()]; 
		
		//Poblamos cada uno de los arrays, letra por letra.
		
		barcelona[0] = 'B';
		barcelona[1] = 'a';
		barcelona[2] = 'r';
		barcelona[3] = 'c';
		barcelona[4] = 'e';
		barcelona[5] = 'l';
		barcelona[6] = 'o';
		barcelona[7] = 'n';
		barcelona[8] = 'a';

		madrid[0] = 'M';
		madrid[1] = 'a';
		madrid[2] = 'd';
		madrid[3] = 'r';
		madrid[4] = 'i';
		madrid[5] = 'd';

		valencia[0] = 'V';
		valencia[1] = 'a';
		valencia[2] = 'l';
		valencia[3] = 'e';
		valencia[4] = 'n';
		valencia[5] = 'c';
		valencia[6] = 'i';
		valencia[7] = 'a';

		malaga[0] = 'M';
		malaga[1] = 'a';
		malaga[2] = 'l';
		malaga[3] = 'a';
		malaga[4] = 'g';
		malaga[5] = 'a';

		cadiz[0] = 'C';
		cadiz[1] = 'a';
		cadiz[2] = 'd';
		cadiz[3] = 'i';
		cadiz[4] = 'z';

		santander[0] = 'S';
		santander[1] = 'a';
		santander[2] = 'n';
		santander[3] = 't';
		santander[4] = 'a';
		santander[5] = 'n';
		santander[6] = 'd';
		santander[7] = 'e';
		santander[8] = 'r';
		
		//Printamos los array por consola, de atrás a adelante.

		for (int i= barcelona.length-1; i>=0; i--) {
			System.out.print(barcelona[i]);
		}
		System.out.println();
		
		for (int i= madrid.length-1; i>=0; i--) {
			System.out.print(madrid[i]);
		}
		System.out.println();
		
		for (int i= valencia.length-1; i>=0; i--) {
			System.out.print(valencia[i]);
		}
		System.out.println();
		
		for (int i= malaga.length-1; i>=0; i--) {
			System.out.print(barcelona[i]);
		}
		System.out.println();
			
		for (int i= cadiz.length-1; i>=0; i--) {
			System.out.print(cadiz[i]);
		}
		System.out.println();
		
		for (int i= santander.length-1; i>=0; i--) {
			System.out.print(santander[i]);
		}
		System.out.println();

	}

}
