/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author User
 */
public class Tour {

    private String nombrePaquete;
    private Itinerario itinerario;
    private float precioTour;
    private int horas;
    private String codTour;
    private String estado;
    private Date fecha;

    public Tour() {
    }

    public Tour(String nombrePaquete, Itinerario itinerario, float precioTour, int horas, String codTour, String estado, Date fecha) {
        this.nombrePaquete = nombrePaquete;
        this.itinerario = itinerario;
        this.precioTour = precioTour;
        this.horas = horas;
        this.codTour = codTour;
        this.estado = estado;
        this.fecha = fecha;
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

    public String getCodTour() {
        return codTour;
    }

    public void setCodTour(String codTour) {
        this.codTour = codTour;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Lugar : " + nombrePaquete + "\nItinerario : " + itinerario
            + "\nPrecio del Tour : " + precioTour + "\nHoras : " + horas
            + "\nCodigo de Tour : " + codTour + "\nEstado : " + estado
            + "\nFecha : " + fecha;
    }
}
