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
        Cliente cliente;

        //Tours
        TourArreglo tours = new TourArreglo(1); //Correcto
        ItinerarioArreglo itinerarios;
        //Personas
        PersonaArreglo personas = new PersonaArreglo(1); //Correcto
        //Guia
        GuiaArreglo guias = new GuiaArreglo(1); //Correcto
        Guia guia;
        //Vehiculo
        VehiculoArreglo vehiculos = new VehiculoArreglo(1); //Correcto
        Vehiculo vehiculo;

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
        tour1 = new Tour("Cusco historico", itinerarios, 14.5f, 7, "CF23");
        tours.agregarTour(tour1);
        System.out.println("------------------------------------------------------------------------------------------------------------");

        itinerarios = new ItinerarioArreglo(1);
        itinerario = new Itinerario("t23", " Paseo en bus por la ciudadela", " 11:20 ");
        itinerarios.agregarItinerario(itinerario);
        itinerario = new Itinerario("y23 ", "Ceremonia del Inti Raymi", "12:20 ");
        itinerarios.agregarItinerario(itinerario);
        itinerario = new Itinerario("u23", "Ceremonia del Inti Raymi", "12:20 ");
        itinerarios.agregarItinerario(itinerario);
        tour1 = new Tour("Iglesia", itinerarios, 14.5f, 6, "CU23");
        tours.agregarTour(tour1);
        System.out.println("------------------------------------------------------------------------------------------------------------");

        //////////////////////
        cliente = new Cliente("123456", "Sebastian Landeo", "sebastian.landeo@unmsm.edu.pe", "959637429", "72345678", 21);
        personas.agregar(cliente);

        cliente = new Cliente("456789", "Max Saavedra", "max.saavedra@unmsm.edu.pe", "920797644", "75739960", 20);
        personas.agregar(cliente);

        cliente = new Cliente("789123", "Joseph Meza", "joseph.meza@unmsm.edu.pe", "998157090", "76543210", 23);
        personas.agregar(cliente);

        ////Guias
        guia = new Guia("Fabricio Chuquispuma", "78218381", 8.9f, "Portugues");
        guias.agregarGuia(guia);
        guia = new Guia("Geomar Camacho", "78451231", 1.9f, "Francés");
        guias.agregarGuia(guia);
        ////
        ///Vehiculos
        vehiculo = new Vehiculo("QQ23", 8, 5.5f, "Sergio Mcqueen");
        vehiculos.agregar(vehiculo);
        vehiculo = new Vehiculo("QQ24", 8, 6.5f, "Francesco Bernoulli");
        vehiculos.agregar(vehiculo);
        Vehiculo vehiculoElegido=new Vehiculo(" ",0,0," ");
        ////

        //Salidas
        fmrPrincipal vista = new fmrPrincipal();
        ControladorPrincipal controlador = new ControladorPrincipal(vista, tours,
                personas, guias, vehiculos, vehiculoElegido);
        controlador.iniciar();
    }
}
