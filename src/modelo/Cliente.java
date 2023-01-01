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
public class Cliente extends Persona implements Serializable{

    private String codReserva;
    private String correo;
    private String telefono;
    private int numPersonas;

    public Cliente(String codReserva, String nombre,
            String correo, String telefono, String dni, int edad) {
        super(nombre, dni, edad);
        this.codReserva = codReserva;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(String codReserva) {
        this.codReserva = codReserva;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + codReserva + "\t" + nombre + "\t" + correo + "\t" + telefono;
    }

}
