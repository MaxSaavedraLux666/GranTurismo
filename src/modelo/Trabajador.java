/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Joseph
 */
public class Trabajador extends Persona implements Serializable {

    private String codTrabajador;
    private double sueldo;
    private Credencial credenciales;
    private int ventasRealizadas;

    public Trabajador(String codTrabajador, double sueldo, Credencial credenciales,
            int ventasRealizadas, String nombre, String dni, int edad) {
        super(nombre, dni, edad);
        this.codTrabajador = codTrabajador;
        this.sueldo = sueldo;
        this.credenciales = credenciales;
        this.ventasRealizadas = ventasRealizadas;
    }

    public double calcularComision() {
        double comision = 0;

        if (ventasRealizadas >= 20) {
            comision = sueldo * 0.2;
        } else if (ventasRealizadas >= 10) {
            comision = sueldo * 0.15;
        } else {
            comision = sueldo * 0.1;
        }

        return comision;
    }

    public void sumarVentas(int ventasASumar) {
        this.ventasRealizadas += ventasASumar;
    }

    public String getCodTrabajador() {
        return codTrabajador;
    }

    public void setCodTrabajador(String codTrabajador) {
        this.codTrabajador = codTrabajador;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Credencial getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(Credencial credenciales) {
        this.credenciales = credenciales;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDni() {
        return dni;
    }

    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "codTrabajador=" + codTrabajador + ", sueldo=" + sueldo + ", credenciales=" + credenciales + ", ventasRealizadas=" + ventasRealizadas + '}';
    }
}
