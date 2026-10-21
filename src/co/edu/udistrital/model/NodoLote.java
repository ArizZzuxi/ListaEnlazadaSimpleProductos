package co.edu.udistrital.model;

public class NodoLote <T> {
	
	private T dato;
	private NodoLote<T> siguiente;
	
	public NodoLote(T dato) {
		this.dato = dato;
		this.siguiente = null;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public NodoLote<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoLote<T> siguiente) {
		this.siguiente = siguiente;
	}

	@Override
	public String toString() {
		return dato.toString();
	}
	
	
	
}
