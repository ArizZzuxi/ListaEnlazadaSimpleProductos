package co.edu.udistrital.controller;

import co.edu.udistrital.model.LineaDeProduccion;
import co.edu.udistrital.model.LoteChocolate;
import co.edu.udistrital.view.VistaMensaje;

public class Controller {
	
	private VistaMensaje vista;
	
	public Controller() {
		vista = new VistaMensaje();
	}
	
	public void iniciar(){
		
		LineaDeProduccion<LoteChocolate> lista = new LineaDeProduccion<LoteChocolate>();
		
		lista.agregarElemento(new LoteChocolate(0,30,"12", true));
		lista.agregarElemento(new LoteChocolate(1,35,"12", true));
		lista.agregarElemento(new LoteChocolate(2,25,"12", true));
		
		vista.MostrarInformacion(lista.verTodos());

		//lista.agregarElemento(new ("Paco", 17));

		//lista.agregarElemento(new Persona("Ana", 23));
	}
}
