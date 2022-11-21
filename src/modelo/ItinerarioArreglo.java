/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class ItinerarioArreglo {
    
    private Itinerario[] itinerarios;
    private int indice;

    public ItinerarioArreglo(int tamaño) {
        this.itinerarios = new Itinerario[tamaño];
        this.indice = 0;
    }
    
    public boolean agregar(Itinerario itinerario) {
        boolean result = false;
        if (lleno()) {
            crecer();
        }
        this.itinerarios[this.indice] = itinerario;
        this.indice++;
        result = true;

        return result;
    }

    public void crecer() {
        Itinerario[] nuevo = new Itinerario[indice * 2];
        int i = 0;
        for (Itinerario obj : this.itinerarios) {
            nuevo[i] = obj;
            i++;
        }
        this.itinerarios = nuevo;
    }

    private boolean lleno() {
        boolean result = false;
        if (this.indice == this.itinerarios.length) {
            result = true;
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (Itinerario obj : this.itinerarios) {
            result += obj + "\n";
        }
        return result;
    }
    
}
