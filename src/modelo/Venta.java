/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author User
 */
public class Venta implements Serializable {

    private Date fecha;
    private String codTour;
    private String codReserva;
    private float costo;

    public Venta(Date fecha, String codTour, String codReserva, float costo) {
        this.fecha = fecha;
        this.codTour = codTour;
        this.codReserva = codReserva;
        this.costo = costo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCodTour() {
        return codTour;
    }

    public void setCodTour(String codTour) {
        this.codTour = codTour;
    }

    public String getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(String codReserva) {
        this.codReserva = codReserva;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Venta{" + "fecha=" + fecha + ", codTour=" + codTour + ", codReserva=" + codReserva + ", costo=" + costo + '}';
    }

}
