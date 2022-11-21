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
public class Itinerario {

    private Date fecha;
    private String hora;
    private String descripcion;

    public Itinerario() {
    }

    public Itinerario(Date fecha, String hora, String descripcion) {
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    @Override
    public String toString() {
        return "Fecha : " + fecha + "\nHora : " + hora + "\nDescripcion : " + descripcion;
    }
}
