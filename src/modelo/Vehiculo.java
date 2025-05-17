/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Sebastian
 */
public class Vehiculo implements Serializable{
    private String codigoVehiculo;
    private int capacidad;
    private Asiento asientos[];
    private float costoViaje;
    private String nombreDelDueño;

    public Vehiculo(String codigoVehiculo, int capacidad, float costoViaje, String nombreDelDueño) {
        this.codigoVehiculo = codigoVehiculo;
        this.capacidad = capacidad;
        this.costoViaje = costoViaje;
        this.nombreDelDueño = nombreDelDueño;
    }
    
    private void generarAsientos(){
        this.asientos=new Asiento[this.capacidad];
        for(int i=0; i<this.capacidad; i++){
            this.asientos[i]=new Asiento(i+1,false);
        }
    }
    
    private int getCantidadAsientosLibre(){
        int resultado=0;
        for (int i=0; i<capacidad; i++){
            if(this.asientos[i].getEstado()==false){
                resultado++;
            }
        }
        return resultado;
    }
    
    public Asiento[] asientoslibre(){
        Asiento resultado[] = new Asiento[getCantidadAsientosLibre()];
        int indice=0;
        for (int i=0; i<capacidad;i++){
            if(this.asientos[i].getEstado()==false){
                resultado[indice]=this.asientos[i];
                indice ++;
            }
        }
        return resultado;
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

