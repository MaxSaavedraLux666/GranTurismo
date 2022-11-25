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
    
    private Vehiculo vehiculo[];
    private int indice;
    
    public VehiculoArreglo(int tamaño){
        this.vehiculo= new Vehiculo[tamaño];
        this.indice=0;
    }
    
    public void agregar(Vehiculo vehiculo){
        this.vehiculo[this.indice]=vehiculo;
        this.indice++;
    }
    
    @Override
    public String toString() {
        String result = "";
        for (Vehiculo obj : this.vehiculo) {
            result += obj + "\n";
        }
        return result;
    }
    
}
