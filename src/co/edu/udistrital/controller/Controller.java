package co.edu.udistrital.controller;

import co.edu.udistrital.model.LineaDeProduccion;
import co.edu.udistrital.model.LoteChocolate;
import co.edu.udistrital.model.ProductosRechazados;
import co.edu.udistrital.view.VistaMensaje;

public class Controller {
    private VistaMensaje vista;
    private LineaDeProduccion<LoteChocolate> linea;
    private ProductosRechazados rechazadosAcumulados;

    public Controller() {
        this.vista = new VistaMensaje();
        this.linea = new LineaDeProduccion<>();
        this.rechazadosAcumulados = new ProductosRechazados();
        precargarDatosEjemplo();
    }

    private void precargarDatosEjemplo() {
        linea.agregarElemento(new LoteChocolate("LOTE-001", 72.5, "2026-10-01", true));
        linea.agregarElemento(new LoteChocolate("LOTE-002", 48.0, "2026-10-02", true));
        linea.agregarElemento(new LoteChocolate("LOTE-003", 85.0, "2026-10-03", true));
        linea.agregarElemento(new LoteChocolate("LOTE-004", 55.0, "2026-10-04", true));
        linea.agregarElemento(new LoteChocolate("LOTE-005", 90.0, "2026-10-05", true));
    }

    public void run() {
        int opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.leerEntero("Seleccione una opción");

            switch (opcion) {
                case 1:
                    String id = vista.leerCadena("Ingrese el ID del lote");
                    double cacao = vista.leerDouble("Ingrese el porcentaje de cacao");
                    String fecha = vista.leerCadena("Ingrese la fecha de producción (AAAA-MM-DD)");
                    linea.agregarElemento(new LoteChocolate(id, cacao, fecha, true));
                    vista.MostrarInformacion("Lote agregado correctamente a la línea.");
                    break;

                case 2:
                    vista.MostrarInformacion("\n--- Lotes en Línea de Producción (" + linea.getTamanio() + ") ---");
                    vista.MostrarInformacion(linea.verTodos());
                    break;

                case 3:
                    if (linea.isVacia()) {
                        vista.MostrarInformacion("No hay lotes en la línea de producción para evaluar.");
                        break;
                    }
                    double min = vista.leerDouble("Ingrese el porcentaje mínimo de cacao exigido");
                    ProductosRechazados nuevosRechazados = linea.extraerLotesDefectuosos(min);

                    vista.MostrarInformacion("\n--- Lotes Extraídos en esta evaluación (" + nuevosRechazados.getTamanio() + ") ---");
                    vista.MostrarInformacion(nuevosRechazados.verTodos());

                    // Acumular los lotes rechazados
                    var aux = nuevosRechazados.getCabeza();
                    while (aux != null) {
                        rechazadosAcumulados.agregarElemento(aux.getDato());
                        aux = aux.getSiguiente();
                    }
                    break;

                case 4:
                    vista.MostrarInformacion("\n--- Historial Acumulado de Rechazados (" + rechazadosAcumulados.getTamanio() + ") ---");
                    vista.MostrarInformacion(rechazadosAcumulados.verTodos());
                    break;

                case 5:
                    vista.MostrarInformacion("Finalizando ejecución del sistema de control de calidad.");
                    break;

                default:
                    vista.MostrarInformacion("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }
}
