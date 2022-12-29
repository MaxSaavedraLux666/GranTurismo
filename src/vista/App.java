/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.*;
import controlador.*;

/**
 *
 * @author User
 */
public class App {

    public static void main(String[] args) {

        Tour tour1;
        Itinerario itinerario;
        Viaje mensaje = new Viaje();

        //Tours
        TourArreglo tours = new TourArreglo(1); //Correcto
        ItinerarioArreglo itinerarios;
        //Personas
        PersonaArreglo personas = new PersonaArreglo(); //Corregir el constructor vacio
        //Guia
        GuiaArreglo guias = new GuiaArreglo(1); //Correcto
        //Vehiculo
        VehiculoArreglo vehiculos = new VehiculoArreglo(1); //Correcto

        //Tours Llenado
        itinerarios = new ItinerarioArreglo(1);
        itinerario = new Itinerario("c34", "Recojo del transporte", " 4:45 ");
        itinerarios.agregarItinerario(itinerario);
        itinerario = new Itinerario("d34", "Llegada al lugar", " 5:15 ");
        itinerarios.agregarItinerario(itinerario);
        itinerario = new Itinerario("e34", "Ingreso a Machu Picchu", " 5:25 ");
        itinerarios.agregarItinerario(itinerario);
        tour1 = new Tour("Machu Picchu", itinerarios, 14.5f, 8, "CD23");
        tours.agregarTour(tour1);
        System.out.println("------------------------------------------------------------------------------------------------------------");

        itinerarios = new ItinerarioArreglo(1);
        itinerario = new Itinerario("f34", "Desayunno", " 6:45 ");
        itinerarios.agregarItinerario(itinerario);
        itinerario = new Itinerario("g34", "Almuerzo", " 12:15 ");
        itinerarios.agregarItinerario(itinerario);
        itinerario = new Itinerario("h34", "Cena", " 7:25 ");
        itinerarios.agregarItinerario(itinerario);
        tour1 = new Tour("Cusco historico", itinerarios, 14.5f, 8, "CF23");
        tours.agregarTour(tour1);
        System.out.println("------------------------------------------------------------------------------------------------------------");

        itinerarios = new ItinerarioArreglo(1);
        itinerario = new Itinerario("t23", " Paseo en bus por la ciudadela", " 11:20 ");
        itinerarios.agregarItinerario(itinerario);
        itinerario = new Itinerario("y23 ", "Ceremonia del Inti Raymi", "12:20 ");
        itinerarios.agregarItinerario(itinerario);
        itinerario = new Itinerario("u23", "Ceremonia del Inti Raymi", "12:20 ");
        itinerarios.agregarItinerario(itinerario);
        tour1 = new Tour("Iglesia", itinerarios, 14.5f, 8, "CU23");
        tours.agregarTour(tour1);
        System.out.println("------------------------------------------------------------------------------------------------------------");

        //////////////////////
        Cliente cliente1 = new Cliente("123", "Sebastian Landeo", "sebastian.landeo@unmsm.edu.pe", "959637429", "72345678", 21);
        personas.agregar(cliente1);

        Cliente cliente2 = new Cliente("456", "Max Saavedra", "max.saavedra@unmsm.edu.pe", "920797644", "75739960", 20);
        personas.agregar(cliente2);

        Cliente cliente3 = new Cliente("789", "Joseph Meza", "joseph.meza@unmsm.edu.pe", "998157090", "76543210", 23);
        personas.agregar(cliente3);

        //Salidas
        mensaje.mostrarTours(tours);
        fmrPrincipal vista = new fmrPrincipal();
        ControladorPrincipal controlador = new ControladorPrincipal(vista, tours, 
                personas, guias, vehiculos);
        controlador.iniciar();
    }
}
