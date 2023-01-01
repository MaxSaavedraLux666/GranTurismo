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
public class Tour implements Serializable{

    private String nombrePaquete;
    private ItinerarioArreglo itinerarios;
    private float precioTour;
    private int horas;
    private String codTour;
    private String estado = "LIBRE";

    public Tour(String nombrePaquete, ItinerarioArreglo itinerarios, float precioTour, int horas, String codTour) {
        this.nombrePaquete = nombrePaquete;
        this.itinerarios = itinerarios;
        this.precioTour = precioTour;
        this.horas = horas;
        this.codTour = codTour;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
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

    public ItinerarioArreglo getItinerarios() {
        return itinerarios;
    }

    public void setItinerarios(ItinerarioArreglo itinerarios) {
        this.itinerarios = itinerarios;
    }

    @Override
    public String toString() {
        return nombrePaquete
                + "       Desde : " + precioTour + " $"
                + "         Código : " + codTour;
    }
}
