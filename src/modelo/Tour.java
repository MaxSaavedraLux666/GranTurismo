/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Tour {
    
    private String nombrePaquete;
    private String itinerario;
    private float precioTour;
    private int horas;

    public Tour(String nombrePaquete, String itinerario, float precioTour, int horas) {
        this.nombrePaquete = nombrePaquete;
        this.itinerario = itinerario;
        this.precioTour = precioTour;
        this.horas = horas;
    }
    
    
}
