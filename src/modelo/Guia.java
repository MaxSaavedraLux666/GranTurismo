
package modelo;

import java.io.Serializable;


public class Guia implements Serializable{
    private String nombre;
    private String DNI;
    private float SalarioPorHora;
    private String idioma;

    public Guia(String nombre, String DNI, float SalarioPorHora, String idioma) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.SalarioPorHora = SalarioPorHora;
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public float getSalarioPorHora() {
        return SalarioPorHora;
    }

    public void setSalarioPorHora(float SalarioPorHora) {
        this.SalarioPorHora = SalarioPorHora;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return nombre+" habla "+idioma;
    }
    
    
    
}
