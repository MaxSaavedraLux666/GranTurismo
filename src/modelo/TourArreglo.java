/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vista.*;

/**
 *
 * @author User
 */
public class TourArreglo {

    private Tour[] tours;
    private int indice;

    fmrTour tabla = new fmrTour();
    
    public TourArreglo() {
    }

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
        agregarTabla(tabla.tablaTours);
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

    public void agregarTabla(JTable tablaDatos) {

        DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();

        Object[] fila = new Object[4];

        fila[0] = tours[this.indice].getNombrePaquete();
        fila[1] = tours[this.indice].getEstado();
        fila[2] = tours[this.indice].getPrecioTour();
        fila[3] = tours[this.indice].getCodTour();

        modelo.addRow(fila);

        tablaDatos.setModel(modelo);
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
