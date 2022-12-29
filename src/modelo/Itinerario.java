/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Itinerario {

    private String codigoItinerario;
    private String hora;
    private String descripcion;

    public Itinerario(String codigoItinerario, String descripcion, String hora) {
        this.hora = hora;
        this.descripcion = descripcion;
        this.codigoItinerario = codigoItinerario;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoItinerario() {
        return codigoItinerario;
    }

    public void setCodigoItinerario(String codigoItinerario) {
        this.codigoItinerario = codigoItinerario;
    }

    @Override
    public String toString() {
        return " hora " + hora + " descripcion  " + descripcion;
    }
}
