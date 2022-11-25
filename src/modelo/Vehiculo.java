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

    public String getCodigoVehiculo() {
        return codigoVehiculo;
    }

    public void setCodigoVehiculo(String codigoVehiculo) {
        this.codigoVehiculo = codigoVehiculo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getCostoViaje() {
        return costoViaje;
    }

    public void setCostoViaje(float costoViaje) {
        this.costoViaje = costoViaje;
    }

    public String getNombreDelDueño() {
        return nombreDelDueño;
    }

    public void setNombreDelDueño(String nombreDelDueño) {
        this.nombreDelDueño = nombreDelDueño;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "codigoVehiculo=" + codigoVehiculo + ", capacidad=" + capacidad + ", costoViaje=" + costoViaje + ", nombreDelDue\u00f1o=" + nombreDelDueño + '}';
    }
    
}

