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
	
	public String leerCadena(String mensaje) {
        System.out.print(mensaje + ": ");
        return sc.nextLine().trim();
    }

    public int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje + ": ");
                int valor = Integer.parseInt(sc.nextLine().trim());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número entero válido.");
            }
        }
    }

    public double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje + ": ");
                double valor = Double.parseDouble(sc.nextLine().trim());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un valor numérico decimal válido (ej. 70.0).");
            }
        }
    }
	
	public void mostrarMenu() {
        System.out.println("\n=== CONTROL DE CALIDAD: LÍNEA DE CHOCOLATE ===");
        System.out.println("1. Agregar lote a la línea de producción");
        System.out.println("2. Ver línea de producción actual");
        System.out.println("3. Extraer lotes defectuosos por % mínimo de cacao");
        System.out.println("4. Ver lista acumulada de lotes rechazados");
        System.out.println("5. Salir");
    }
}
