/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Cliente extends Persona{
    
    private String codReserva;
    private String titular;
    private String correo;
    private String telefono;
    private int numPersonas;

    public Cliente(String codReserva,String titular, String correo, String telefono, String nombre, String dni, int edad) {
        super(nombre, dni, edad);
        this.titular = titular;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
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
    public String toString(){
        return nombre+"\t"+dni+"\t"+edad+"\t"+codReserva+"\t"+titular+"\t"+correo+"\t"+telefono;
    }
    
    
}
