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
        //Venta
        VentaArreglo ventas = new VentaArreglo(1);

        /////Primer Trabajador
        /////////////////////////////////////////////////////////////////////////
        //Credencial credencial = new Credencial("cusco", "cusco2023");
        //Trabajador trabajador = new Trabajador("007", 2500d, credencial, 21, "Max Saavedra",
         //      "71749960", 21);
        //personas.agregar(trabajador);
        /////////////////////////////////////////////////////////////////////////
//private static final long serialVersionUID = -4111840617393640442L;
        ///Deserialización
        tours = (TourArreglo) SerializadoraGen.deserializar("tours.txt");
        personas = (PersonaArreglo) SerializadoraGen.deserializar("personas.txt");
        guias = (GuiaArreglo) SerializadoraGen.deserializar("guias.txt");
        vehiculos = (VehiculoArreglo) SerializadoraGen.deserializar("vehiculos.txt");
        ventas = (VentaArreglo) SerializadoraGen.deserializar("ventas.txt");
        //Salidas
        fmrPrincipal vista = new fmrPrincipal();
        ControladorPrincipal controlador = new ControladorPrincipal(vista, tours,
                personas, guias, vehiculos, ventas);
        controlador.iniciar();
    }
}
