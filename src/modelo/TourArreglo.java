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
    private String[] duracion = {"1", "2", "3", "4", "5", "6", "7", "Part Time", "Full Time"};

    public TourArreglo() {
        this(5);
    }

    public TourArreglo(int tam) {
        this.tours = new Tour[tam];
        this.indice = 0;
    }

    public boolean agregarTour(Tour tour) {
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

    public boolean eliminarTour(String codTour) {
        boolean result = false;
        Tour[] nuevo = new Tour[tours.length - 1];
        int pos = 0;
        for (int i = 0; i < tours.length; i++) {
            if (tours[i].getCodTour().equals(codTour)) {
                pos = i;
                result = true;
                break;
            }
        }
        if (result) {
            for (int i = 0; i < pos; i++) {
                nuevo[i] = tours[i];
            }
            for (int i = pos + 1; i < tours.length; i++) {
                nuevo[i - 1] = tours[i];
            }
            this.tours = nuevo;
            this.indice--;
        }

        return result;
    }

    public Tour buscarTour(String codTour) {
        Tour result = null;
        for (int i = 0; i < tours.length; i++) {
            if (tours[i].getCodTour().equals(codTour)) {
                result = tours[i];
                break;
            }
        }
        return result;
    }

    public boolean modificarTour(String codTour, Tour tour) {
        boolean result = false;
        for (Tour objTour : tours) {
            if (codTour.equals(objTour.getCodTour())) {
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

    public String[][] getTour() {
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

    public String[] getDuracion() {
        return duracion;
    }

    public int getTotal() {
        int resultado = 0;
        for (Tour obj : this.tours) {
            if (obj != null) {
                resultado++;
            }
        }
        return resultado;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public Tour[] getTours() {
        return tours;
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
