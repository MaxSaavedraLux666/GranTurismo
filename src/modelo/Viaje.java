/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Viaje implements Serializable{

    private Tour tourElegido;
    private Vehiculo vehiculoElegido;
    private Guia guiaElegido;
    private int horaInicio;
    private int horaFin;

    public Viaje(Tour tourElegido, Vehiculo vehiculoElegido, Guia guiaElegido) {
        this.tourElegido = tourElegido;
        this.vehiculoElegido = vehiculoElegido;
        this.guiaElegido = guiaElegido;
    }

    public boolean programarViaje(Tour tours, Vehiculo vehiculo, Guia guia) {
        boolean result = false;
        if (venderTour()) {
            result = true;
        }
        return result;
    }

    public void mostrarTours(TourArreglo tours) {
        if (tours != null) {
            System.out.println(tours);
        }
    }

    public boolean venderTour() {
        boolean result = false;
        
        return result;
    }

    public boolean eliminarTour(String codigo) {
        boolean result = false;
       
        return result;
    }

    public boolean cancelarTour(String codigo) {
        boolean result = false;

        return result;
    }

    public Tour getTourElegido() {
        return tourElegido;
    }

    public void setTourElegido(Tour tourElegido) {
        this.tourElegido = tourElegido;
    }

    public Vehiculo getVehiculoElegido() {
        return vehiculoElegido;
    }

    public void setVehiculoElegido(Vehiculo vehiculoElegido) {
        this.vehiculoElegido = vehiculoElegido;
    }

    public Guia getGuiaElegido() {
        return guiaElegido;
    }

    public void setGuiaElegido(Guia guiaElegido) {
        this.guiaElegido = guiaElegido;
    }

    

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    @Override
    public String toString() {
        return "Viaje{" + "tourElegido=" + tourElegido + ", vehiculoElegido=" + vehiculoElegido + ", guiaElegido=" + guiaElegido + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + '}';
    }  

}
