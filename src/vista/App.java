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

        TourArreglo tourTamaño = new TourArreglo(2);
        ItinerarioArreglo itinerarios = new ItinerarioArreglo(1);

        itinerario = new Itinerario(new Date(2021, 21, 11), " 4:20 ", " Caminata por la ciudad de Machu Picchu");
        itinerarios.agregar(itinerario);

        tour1 = new Tour("Machu Picchu", itinerario, 14.5f, 8, "CD23", "LIBRE");
        tourTamaño.agregar(tour1);

        itinerario = new Itinerario(new Date(2021, 22, 11), " 11:20 ", " Paseo en bus por la ciudadela");
        itinerarios.agregar(itinerario);

        tour1 = new Tour("Ciudadela", itinerario, 13.5f, 4, "CH56", "OCUPADO");
        tourTamaño.agregar(tour1);

        itinerario = new Itinerario(new Date(2021, 23, 11), " 12:20 ", "Ceremonia del Inti Raymi");
        itinerarios.agregar(itinerario);

        tour1 = new Tour("IntiRaymi", itinerario, 12.5f, 5, "CF23", "LIBRE");
        tourTamaño.agregar(tour1);

        mensaje.mostrarTours(tourTamaño);

        fmrPrincipal vista = new fmrPrincipal();
        ControladorPrincipal controlador = new ControladorPrincipal(vista);
        controlador.iniciar();
    }
}
