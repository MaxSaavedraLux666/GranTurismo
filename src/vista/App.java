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
public class App implements Serializable {

    public static void main(String[] args) {

        //Tours
        TourArreglo tours = new TourArreglo(1); //Correcto
        //Personas
        PersonaArreglo personas = new PersonaArreglo(1); //Correcto
        //Guia
        GuiaArreglo guias = new GuiaArreglo(1); //Correcto
        //Vehiculo
        VehiculoArreglo vehiculos = new VehiculoArreglo(1); //Correcto

        //cliente = new Cliente("123456", "Sebastian Landeo", "sebastian.landeo@unmsm.edu.pe", "959637429", "72345678", 21);
        //personas.agregar(cliente);
        //cliente = new Cliente("456789", "Max Saavedra", "max.saavedra@unmsm.edu.pe", "920797644", "75739960", 20);
        //personas.agregar(cliente);
        //cliente = new Cliente("789123", "Joseph Meza", "joseph.meza@unmsm.edu.pe", "998157090", "76543210", 23);
        //personas.agregar(cliente);
        ///Deserialización
        tours = (TourArreglo) SerializadoraGen.deserializar("tours.txt");
        personas = (PersonaArreglo) SerializadoraGen.deserializar("personas.txt");
        guias = (GuiaArreglo) SerializadoraGen.deserializar("guias.txt");
        vehiculos = (VehiculoArreglo) SerializadoraGen.deserializar("vehiculos.txt");
        //Salidas
        fmrPrincipal vista = new fmrPrincipal();
        ControladorPrincipal controlador = new ControladorPrincipal(vista, tours,
                personas, guias, vehiculos);
        controlador.iniciar();
    }
}
