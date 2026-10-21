package co.edu.udistrital.model;

public class LineaDeProduccion <T> {
	private NodoLote<T> cabeza;
	private int tamanio;
	
	public LineaDeProduccion(NodoLote<T> cabeza, int tamanio) {
		super();
		this.cabeza = cabeza;
		this.tamanio = tamanio;
	}
	
	public LineaDeProduccion() {
		cabeza = null;
		tamanio = 0;
	}
	
	//operaciones basicas
	
	public boolean agregarElemento(T dato) {
		NodoLote<T> nuevo = new NodoLote<>(dato);
		if(cabeza == null) {
			cabeza = nuevo;
		} else {
			NodoLote<T> actual = cabeza;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente(); 
			}
			actual.setSiguiente(nuevo);
		}
		tamanio ++;
		return true;
	}
	
	public ProductosRechazados extraerLotesDefectuosos (double PorcentajeMinimo){
		
		ProductosRechazados rechazados = new ProductosRechazados();
		
		while (cabeza != null && ((LoteChocolate) cabeza.getDato()).getPorcentajeCacao() < PorcentajeMinimo) {
			LoteChocolate loteExtraido = (LoteChocolate) cabeza.getDato();
			loteExtraido.setAprobado(false);
			rechazados.agregarElemento(loteExtraido);
			
			cabeza = cabeza.getSiguiente();
			tamanio--;
		}
		
		if(cabeza!=null) {
			NodoLote <T> actual = cabeza;
			
			while (actual.getSiguiente() != null) {
				LoteChocolate loteExtraido = (LoteChocolate) actual.getSiguiente().getDato();
				loteExtraido.setAprobado(false);
				rechazados.agregarElemento(loteExtraido);
				
				actual.setSiguiente(actual.getSiguiente().getSiguiente());
				tamanio--;
			}
			
		
		}
		
		return rechazados;
		
	}
	
	public String verTodos() {
		String acum = "";
		NodoLote <T> temp = cabeza;
		while(temp != null) {
			acum += temp + " -> ";
			temp = temp.getSiguiente();
		}
		acum += "null";
		return acum;
	}
	
	public boolean isVacia() {
		return cabeza == null;
	}

	public NodoLote<T> getCabeza() {
		return cabeza;
	}

	public int getTamanio() {
		return tamanio;
	}
 }
