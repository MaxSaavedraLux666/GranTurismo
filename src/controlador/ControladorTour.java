/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import modelo.Tour;
import modelo.TourArreglo;
import vista.fmrTour;

/**
 *
 * @author User
 */
public class ControladorTour implements ActionListener{
    
    fmrTour vistaTour;
    ControladorPrincipal controlPricipal;
    Tour tour;
    TourArreglo tours;

    public ControladorTour(fmrTour vistaTour) {
        this.vistaTour = vistaTour;
        
    }
    
    public void ListarTabla(JTable tabla){
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
