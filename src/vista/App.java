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

        itinerario = new Itinerario(" 4:20 ", " Caminata por la ciudad de Machu Picchu");
        itinerarios.agregarItinerario(itinerario);

        tour1 = new Tour("Machu Picchu", itinerarios, 14.5f, 8, "CD23", "LIBRE", new Date(2021, 21, 11));
        tourTamaño.agregarTour(tour1);

        itinerario = new Itinerario(" 11:20 ", " Paseo en bus por la ciudadela");
        itinerarios.agregarItinerario(itinerario);

        tour1 = new Tour("Ciudadela", itinerarios, 13.5f, 4, "CH56", "OCUPADO", new Date(2021, 22, 11));
        tourTamaño.agregarTour(tour1);

        itinerario = new Itinerario(" 12:20 ", "Ceremonia del Inti Raymi");
        itinerarios.agregarItinerario(itinerario);

        tour1 = new Tour("IntiRaymi", itinerarios, 12.5f, 5, "CF23", "LIBRE", new Date(2021, 23, 11));
        tourTamaño.agregarTour(tour1);

        mensaje.mostrarTours(tourTamaño);

        fmrPrincipal vista = new fmrPrincipal();
        ControladorPrincipal controlador = new ControladorPrincipal(vista, tourTamaño);
        controlador.iniciar();
    }
}
