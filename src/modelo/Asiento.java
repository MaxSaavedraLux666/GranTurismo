/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Sebastian
 */
public class Asiento {
    private int numero_De_Asiento;
    private boolean estado;

    public Asiento(int numero_De_Asiento, boolean estado) {
        this.numero_De_Asiento = numero_De_Asiento;
        this.estado = estado;
    }

    public int getNumero_De_Asiento() {
        return numero_De_Asiento;
    }

    public void setNumero_De_Asiento(int numero_De_Asiento) {
        this.numero_De_Asiento = numero_De_Asiento;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
