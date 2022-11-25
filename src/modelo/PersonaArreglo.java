/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class PersonaArreglo {
    
    private Persona[] personas;
    private int indice;
    
    public PersonaArreglo(int tamano){
        this.personas = new Persona[tamano];
        this.indice = 0;
    }
    
    public void agregar(Persona persona){
        this.personas[this.indice] = persona;
        this.indice++;
    }
    
    @Override
    public String toString(){
        String resultado = "";
        for(int i=0;i<this.indice;i++){
            resultado = resultado + this.personas[i];
        }
        return resultado;  
    }
    
    public String getCliente(){
        String resultado = "";
        for(int i=0;i<this.indice;i++){
            if(this.personas[i] instanceof Cliente){
                resultado = resultado + this.personas[i];
            }
        }
        return resultado;  
    }
    
    public String getTrabajador(){
        String resultado = "";
        for(int i=0;i<this.indice;i++){
            if(this.personas[i] instanceof Trabajador){
                resultado = resultado + this.personas[i];
            }
        }
        return resultado;  
    }
    
            
}
