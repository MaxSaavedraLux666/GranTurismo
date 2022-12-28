/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.*;
import controlador.*;
import java.util.Date;

/**
 *
 * @author User
 */
public class App {

    public static void main(String[] args) {

        Tour tour1;
        Itinerario itinerario;
        Viaje mensaje = new Viaje();

        TourArreglo tourTamaño = new TourArreglo(1);
        ItinerarioArreglo itinerarios = new ItinerarioArreglo(1);
        PersonaArreglo personas = new PersonaArreglo();
        GuiaArreglo guias = new GuiaArreglo(1);
        VehiculoArreglo vehiculos = new VehiculoArreglo(1);

        itinerario = new Itinerario("c34", " Caminata por la ciudad de Machu Picchu", " 4:20 ");
        itinerarios.agregarItinerario(itinerario);

        tour1 = new Tour("Machu Picchu", itinerarios, 14.5f, 8, "CD23", "LIBRE", new Date(2021, 21, 11));
        tourTamaño.agregarTour(tour1);
        
        Cliente cliente1= new Cliente("123","Sebastian Landeo", "sebastian.landeo@unmsm.edu.pe", "959637429","72345678", 21);
        personas.agregar(cliente1);
        
        Cliente cliente2= new Cliente("456","Max Saavedra", "max.saavedra@unmsm.edu.pe", "920797644","75739960", 20);
        personas.agregar(cliente2);
        
        Cliente cliente3= new Cliente("789","Joseph Meza", "joseph.meza@unmsm.edu.pe", "998157090","76543210", 23);
        personas.agregar(cliente3);
        
        itinerario = new Itinerario(" D23", " Paseo en bus por la ciudadela", " 11:20 ");
        itinerarios.agregarItinerario(itinerario);

        tour1 = new Tour("Ciudadela", itinerarios, 13.5f, 4, "CH56", "OCUPADO", new Date(2021, 22, 11));
        tourTamaño.agregarTour(tour1);

        itinerario = new Itinerario(" F45 ", "Ceremonia del Inti Raymi", "12:20 ");
        itinerarios.agregarItinerario(itinerario);

        tour1 = new Tour("IntiRaymi", itinerarios, 12.5f, 5, "CF23", "LIBRE", new Date(2021, 23, 11));
        tourTamaño.agregarTour(tour1);

        mensaje.mostrarTours(tourTamaño);

        fmrPrincipal vista = new fmrPrincipal();

        ControladorPrincipal controlador = new ControladorPrincipal(vista, tourTamaño, itinerarios,
                personas, guias, vehiculos);
        controlador.iniciar();
    }
}
