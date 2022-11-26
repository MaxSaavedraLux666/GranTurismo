/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Joseph
 */
public class TrabajadorArreglo {
    
    private Trabajador[] trabajadores;
    private int indice;

    public TrabajadorArreglo(int tamano){
        this.trabajadores = new Trabajador[tamano];
        this.indice = 0;
    }

    public void agregar(Trabajador trabajador){
        this.trabajadores[this.indice] = trabajador;
        this.indice++;
    }

    @Override
    public String toString(){
        String resultado = "";
        for(int i=0;i<this.indice;i++){
            resultado = resultado + this.trabajadores[i];
        }
        return resultado;
    }
}
