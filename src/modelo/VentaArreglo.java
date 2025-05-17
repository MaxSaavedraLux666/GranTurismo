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
public class VentaArreglo implements Serializable {

    private Venta[] ventas;
    private int indice;
    private final String[] cabeceraVentas = {"Fecha", "Código del Tour", "Código de la Reserva",
        "Costo"};

    public VentaArreglo(int tam) {
        this.ventas = new Venta[tam];
        this.indice = 0;
    }

    public boolean agregarVenta(Venta venta) {
        boolean result = false;
        if (lleno()) {
            crecer();
        }
        this.ventas[this.indice] = venta;
        this.indice++;
        result = true;

        return result;
    }

    public void crecer() {
        Venta[] nuevo = new Venta[indice * 2];
        int i = 0;
        for (Venta obj : this.ventas) {
            nuevo[i] = obj;
            i++;
        }
        this.ventas = nuevo;
    }

    private boolean lleno() {
        boolean result = false;
        if (this.indice == this.ventas.length) {
            result = true;
        }
        return result;
    }

    public String[][] getVenta() {
        String[][] resultado = new String[getTotal()][5];

        int i = 0;

        for (Venta obj : this.ventas) {
            if (obj != null) {
                if (obj instanceof Venta) {

                    resultado[i][0] = String.valueOf(obj.getFecha());
                    resultado[i][1] = obj.getCodTour();
                    resultado[i][2] = String.valueOf(obj.getCodReserva());
                    resultado[i][3] = String.valueOf(obj.getCosto());
                    i++;
                }
            }
        }
        return resultado;
    }

    public String[] getCabecera() {
        return this.cabeceraVentas;
    }

    public int getTotal() {
        int resultado = 0;
        for (Venta obj : this.ventas) {
            if (obj != null) {
                resultado++;
            }
        }
        return resultado;
    }

    public double calcularTotalVentas() {
        double total = 0;
        for (Venta obj : ventas) {
            if (obj != null) {
                total += obj.getCosto();
            }
        }
        return total;
    }

    public Venta[] getVentas() {
        return ventas;
    }

    @Override
    public String toString() {
        String result = "";
        for (Venta obj : this.ventas) {
            result += obj + "\n";
        }
        return result;
    }
}
