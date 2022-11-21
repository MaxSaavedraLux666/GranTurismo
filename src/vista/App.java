/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.*;

/**
 *
 * @author User
 */
public class App {

    public static void main(String[] args) {
        
        Tour tour1;
        TourArreglo tourTamaño = new TourArreglo(2);
        
        tour1 = new Tour("Machu Picchu", "Full Day", 14.5f, 8);
        tourTamaño.agregar(tour1);
        
        tour1 = new Tour("Ciudadela", "Part Time", 13.5f, 4);
        tourTamaño.agregar(tour1);
        
        tour1 = new Tour("IntiRaymi", "Part Time", 12.5f, 5);
        tourTamaño.agregar(tour1);
        
        System.out.println(tourTamaño);
    }
}
