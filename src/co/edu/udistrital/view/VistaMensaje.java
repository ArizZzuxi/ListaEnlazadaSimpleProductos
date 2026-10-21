package co.edu.udistrital.view;

import java.util.Scanner;

public class VistaMensaje {
	private Scanner sc;
	
	public VistaMensaje() {
		sc = new Scanner(System.in);
	}
	
	public void MostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}
	
	public String leerPalabras(String mensaje) {
		System.out.println();
		String dato = sc.next();
		return dato;
	}
	
	public int leerEnteros(int mensaje) {
		System.out.println();
		int dato = sc.nextInt();
		return dato;
	}
}
