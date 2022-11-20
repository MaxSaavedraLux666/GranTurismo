/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class TourArreglo {

    private Tour[] tours;
    private int indice;

    public TourArreglo(int tam) {
        this.tours = new Tour[tam];
        this.indice = 0;
    }

    public boolean agregar(Tour tour) {
        boolean result = false;
        if (lleno()) {
            crecer();
        }
        this.tours[this.indice] = tour;
        this.indice++;
        result = true;

        return result;
    }

    public void crecer() {
        Tour[] nuevo = new Tour[indice * 2];
        int i = 0;
        for (Tour obj : this.tours) {
            nuevo[i] = obj;
            i++;
        }
        this.tours = nuevo;
    }

    private boolean lleno() {
        boolean result = false;
        if (this.indice == this.tours.length) {
            result = true;
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (Tour obj : this.tours) {
            result += obj + "\n";
        }
        return result;
    }
}
