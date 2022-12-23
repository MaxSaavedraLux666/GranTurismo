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
    private final String[] cabeceraItinerario = {"CÓDIGO", "DESCRIPCIÓN", "HORA"};

    public ItinerarioArreglo(int tamaño) {
        this.itinerarios = new Itinerario[tamaño];
        this.indice = 0;
    }

    public boolean agregarItinerario(Itinerario itinerario) {
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

    public boolean eliminarItinerario(String cod) {
        boolean result = false;
        
        for (Itinerario itinerario : itinerarios) {
            if (buscarItinerario(cod) == itinerario) {
               itinerario = null;
            }
        }
        return result;
    }

    private Itinerario buscarItinerario(String codigo) {
        Itinerario result = null;
        for (Itinerario itinerario : itinerarios) {
            if (itinerario.getCodigoItinerario() == codigo) {
                result = itinerario;
            }
        }
        return result;
    }

    public boolean modificarItinerario(String indiceItinerario, Itinerario itinerario) {
        boolean result = false;
        for (Itinerario objItinerario : itinerarios) {
            if (buscarItinerario(indiceItinerario) == objItinerario) {
                objItinerario = itinerario;
                result = true;
            }
        }
        return result;
    }

    public String[][] getItinerarios() {
        String[][] resultado = new String[getTotal()][3];

        int i = 0;

        for (Itinerario obj : this.itinerarios) {
            if (obj != null) {
                if (obj instanceof Itinerario) {
                    resultado[i][0] = obj.getCodigoItinerario();
                    resultado[i][1] = obj.getDescripcion();
                    resultado[i][2] = obj.getHora();
                    i++;
                }
            }
        }
        return resultado;
    }

    public String[] getCabecera() {
        return this.cabeceraItinerario;
    }

    private int getTotal() {
        int resultado = 0;
        for (Itinerario obj : this.itinerarios) {
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

    @Override
    public String toString() {
        String result = "";
        for (Itinerario obj : this.itinerarios) {
            result += obj + "\n";
        }
        return result;
    }
}
