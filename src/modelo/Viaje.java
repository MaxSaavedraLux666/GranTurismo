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

    public boolean programarViaje(Tour tours, Vehiculo vehiculo) {
        boolean result = false;
        
        return result;
    }

    public void mostrarTours(TourArreglo tours) {
        if (tours != null) {
            System.out.println(tours);
        }
    }
}
