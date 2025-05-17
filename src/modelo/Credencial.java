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
public class Credencial implements Serializable{

    private String nombreDeUsuario;
    private String contraseña;

    public Credencial(String nombreDeUsuario, String contraseña) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.contraseña = contraseña;
    }

    public boolean verificar(String nombreDeUsuario, String contraseña) {
        return this.nombreDeUsuario.equals(nombreDeUsuario) && this.contraseña.equals(contraseña);
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Credencial{" + "nombreDeUsuario=" + nombreDeUsuario + ", contrase\u00f1a=" + contraseña + '}';
    }
}
