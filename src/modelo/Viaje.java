/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Viaje {

    private Tour tours;
    private Vehiculo vehiculoAsignado;
    private int horaInicio;
    private int horaFin;

    public Viaje() {

    }

    public boolean programarViaje(Tour tours, Vehiculo vehiculo, Guia guia) {
        boolean result = false;

        if (true) {

            result = true;
        } else {

        }

        return result;
    }

    public void mostrarTours(TourArreglo tours) {
        if (tours != null) {
            System.out.println(tours);
        }
    }

    public boolean venderTour(String codigo) {
        boolean result = false;

        if (result) {

            
            result = true;
        } else {
        }

        return result;
    }

    public boolean eliminarTour(String codigo) {
        boolean result = false;

        if (result) {

            result = true;
        } else {

        }

        return result;
    }

    public boolean cancelarTour(String codigo) {
        boolean result = false;

        if (result) {

            result = true;
        } else {

        }

        return result;
    }

    public Tour getTours() {
        return tours;
    }

    public void setTours(Tour tours) {
        this.tours = tours;
    }

    public Vehiculo getVehiculoAsignado() {
        return vehiculoAsignado;
    }

    public void setVehiculoAsignado(Vehiculo vehiculoAsignado) {
        this.vehiculoAsignado = vehiculoAsignado;
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
        return "Viaje{" + "tours=" + tours + ", vehiculoAsignado=" + vehiculoAsignado + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + '}';
    }

}
