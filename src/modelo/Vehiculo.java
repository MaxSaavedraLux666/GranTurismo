/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Sebastian
 */
public class Vehiculo {
    private String codigoVehiculo;
    private int capacidad;
    private float costoViaje;
    private String nombreDelDueño;

    public Vehiculo(String codigoVehiculo, int capacidad, float costoViaje, String nombreDelDueño) {
        this.codigoVehiculo = codigoVehiculo;
        this.capacidad = capacidad;
        this.costoViaje = costoViaje;
        this.nombreDelDueño = nombreDelDueño;
    }
    
}

