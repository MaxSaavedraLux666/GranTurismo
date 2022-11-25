/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JTable;
import modelo.Tour;
import modelo.TourArreglo;
import vista.fmrPrincipal;
import vista.fmrTour;

/**
 *
 * @author User
 */
public class ControladorTour {

    fmrTour vistaTour;
    ControladorPrincipal controlPricipal;
    Tour tour;
    TourArreglo tours;

    public ControladorTour(fmrTour vistaTour) {
        this.vistaTour = vistaTour;

        this.vistaTour.menu_Inicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        this.vistaTour.btn_BuscarTour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        this.vistaTour.btn_Informacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        this.vistaTour.btn_Reservar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void iniciarTour() {
        this.vistaTour.setVisible(true);
    }
}
