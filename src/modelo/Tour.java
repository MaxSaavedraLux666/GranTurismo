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
    private Itinerario itinerario;
    private float precioTour;
    private int horas;

    public Tour() {
    }

    public Tour(String nombrePaquete, Itinerario itinerario, float precioTour, int horas) {
        this.nombrePaquete = nombrePaquete;
        this.itinerario = itinerario;
        this.precioTour = precioTour;
        this.horas = horas;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    public float getPrecioTour() {
        return precioTour;
    }

    public void setPrecioTour(float precioTour) {
        this.precioTour = precioTour;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Lugar : " + nombrePaquete + "\nItinerario : " + itinerario + "\nPrecio del Tour : " + precioTour + "\nHoras : " + horas;
    }

}
