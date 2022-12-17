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
    private final String[] cabeceraTours = {"LUGAR", "ESTADO", "PRECIO",
        "CODIGO"};

    public TourArreglo() {
        this(5);
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

    public boolean eliminar(String codTour) {
        boolean result = false;

        for (Tour objTour : tours) {
            if (codTour == objTour.getCodTour()) {
                objTour = null;
                result = true;
            }
        }

        return result;
    }

    public Tour buscar(String codTour) {

        Tour result = null;

        for (Tour objTour : tours) {
            if (codTour == objTour.getCodTour()) {
                result = objTour;
            }
        }
        return result;

    }

    public boolean modificar(String codTour, Tour tour) {

        boolean result = false;

        for (Tour objTour : tours) {
            if (codTour == objTour.getCodTour()) {
                objTour = tour;
                result = true;
            }
        }
        return result;
    }

    private boolean lleno() {
        boolean result = false;
        if (this.indice == this.tours.length) {
            result = true;
        }
        return result;
    }

    public String[][] getTours() {
        String[][] resultado = new String[getTotal()][5];

        int i = 0;

        for (Tour obj : this.tours) {
            if (obj != null) {
                if (obj instanceof Tour) {
                    resultado[i][0] = obj.getNombrePaquete();
                    resultado[i][1] = obj.getEstado();
                    resultado[i][2] = String.valueOf(obj.getPrecioTour());
                    resultado[i][3] = obj.getCodTour();
                    i++;
                }
            }
        }
        return resultado;
    }

    public String[] getCabecera() {
        return this.cabeceraTours;
    }

    private int getTotal() {
        int resultado = 0;
        for (Tour obj : this.tours) {
            if (obj != null) {
                resultado++;
            }
        }
        return resultado;
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
