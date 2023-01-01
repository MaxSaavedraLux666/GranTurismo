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
public class Trabajador extends Persona implements Serializable{
    
    private String codTrabajador;
    private Reserva[] reservas;

    public Trabajador(String codTrabajador,String nombre, String dni, int edad) {
        super(nombre, dni, edad);
        this.codTrabajador = codTrabajador;
    }
    
    @Override 
    public String toString(){
        return super.toString()+"\t"+codTrabajador;
    }
    
}
