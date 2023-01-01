/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.*;
import controlador.*;
import java.io.Serializable;
import libreria.SerializadoraGen;

/**
 *
 * @author User
 */
public class App implements Serializable{

    public static void main(String[] args) {

        Itinerario itinerario;
        Cliente cliente;

        //Tours
        TourArreglo tours = new TourArreglo(1); //Correcto
        
        //Personas
        PersonaArreglo personas = new PersonaArreglo(1); //Correcto
        //Guia
        GuiaArreglo guias = new GuiaArreglo(1); //Correcto
        Guia guia;
        //Vehiculo
        VehiculoArreglo vehiculos = new VehiculoArreglo(1); //Correcto
        Vehiculo vehiculo;

        //cliente = new Cliente("123456", "Sebastian Landeo", "sebastian.landeo@unmsm.edu.pe", "959637429", "72345678", 21);
        //personas.agregar(cliente);

        //cliente = new Cliente("456789", "Max Saavedra", "max.saavedra@unmsm.edu.pe", "920797644", "75739960", 20);
        //personas.agregar(cliente);

        //cliente = new Cliente("789123", "Joseph Meza", "joseph.meza@unmsm.edu.pe", "998157090", "76543210", 23);
        //personas.agregar(cliente);

        ////Guias
        //guia = new Guia("Fabricio Chuquispuma", "78218381", 8.9f, "Portugues");
        //guias.agregarGuia(guia);
        //guia = new Guia("Geomar Camacho", "78451231", 1.9f, "Francés");
        //guias.agregarGuia(guia);
        ////
        ///Vehiculos
        //vehiculo = new Vehiculo("QQ23", 8, 5.5f, "Sergio Mcqueen");
        //vehiculos.agregar(vehiculo);
        //vehiculo = new Vehiculo("QQ24", 8, 6.5f, "Francesco Bernoulli");
        //vehiculos.agregar(vehiculo);
        //Vehiculo vehiculoElegido=new Vehiculo(" ",0,0," ");
        ////
        
        ///Deserialización
        
        tours = (TourArreglo) SerializadoraGen.deserializar("tours.txt");
        //personas = (PersonaArreglo) SerializadoraGen.deserializar("personas.txt");
        guias = (GuiaArreglo) SerializadoraGen.deserializar("guias.txt");
        //Salidas
        fmrPrincipal vista = new fmrPrincipal();
        ControladorPrincipal controlador = new ControladorPrincipal(vista, tours,
                personas, guias, vehiculos);
        controlador.iniciar();
    }
}
