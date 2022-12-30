/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Sebastian
 */
public class VehiculoArreglo {

    private Vehiculo[] vehiculos;
    private int indice;
    private final String[] cabeceraTours = {"CÓDIGO", "CHOFER", "CAPACIDAD",
        "COSTO"};

    public VehiculoArreglo(int tamaño) {
        this.vehiculos = new Vehiculo[tamaño];
        this.indice = 0;
    }

    public boolean agregar(Vehiculo vehiculo) {
        boolean result = false;
        if (lleno()) {
            crecer();
        }
        this.vehiculos[this.indice] = vehiculo;
        this.indice++;
        result = true;

        return result;
    }

    private boolean lleno() {
        boolean result = false;
        if (this.indice == this.vehiculos.length) {
            result = true;
        }
        return result;
    }

    public void crecer() {
        Vehiculo[] nuevo = new Vehiculo[indice * 2];
        int i = 0;
        for (Vehiculo obj : this.vehiculos) {
            nuevo[i] = obj;
            i++;
        }
        this.vehiculos = nuevo;
    }

    public boolean eliminarVehiculo(String codigo) {
        boolean result = false;
        Vehiculo[] nuevo = new Vehiculo[vehiculos.length - 1];
        int pos = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i].getCodigoVehiculo().equals(codigo)) {
                pos = i;
                result = true;
                break;
            }
        }
        if (result) {
            for (int i = 0; i < pos; i++) {
                nuevo[i] = vehiculos[i];
            }
            for (int i = pos + 1; i < vehiculos.length; i++) {
                nuevo[i - 1] = vehiculos[i];
            }
            this.vehiculos = nuevo;
            this.indice--;
        }

        return result;
    }

    public Vehiculo buscarVehiculo(String codigo) {
        Vehiculo result = null;
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i].getCodigoVehiculo().equals(codigo)) {
                result = vehiculos[i];
                break;
            }
        }
        return result;
    }

    public boolean modificarVehiculo(String codigo, Vehiculo vehiculo) {
        boolean result = false;
        for (Vehiculo obj : vehiculos) {
            if (codigo.equals(obj.getCodigoVehiculo())) {
                obj = vehiculo;
                result = true;
            }
        }
        return result;
    }

    public String[][] getVehiculo() {
        String[][] resultado = new String[getTotal()][5];

        int i = 0;

        for (Vehiculo obj : this.vehiculos) {
            if (obj != null) {
                if (obj instanceof Vehiculo) {
                    resultado[i][0] = obj.getCodigoVehiculo();
                    resultado[i][1] = obj.getNombreDelDueño();
                    resultado[i][2] = String.valueOf(obj.getCapacidad());
                    resultado[i][3] = String.valueOf(obj.getCostoViaje());
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
        for (Vehiculo obj : this.vehiculos) {
            if (obj != null) {
                resultado++;
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        String result = "";
        for (Vehiculo obj : this.vehiculos) {
            result += obj + "\n";
        }
        return result;
    }

}
