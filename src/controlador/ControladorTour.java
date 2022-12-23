/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
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
    TourArreglo modelo;

    public ControladorTour(TourArreglo modelo, fmrTour vistaTour) {
        this.vistaTour = vistaTour;
        this.modelo = modelo;

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

        this.vistaTour.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaTour.dispose();
            }

        });
    }

    public void limpiarControles() {
        String[] cabecera = modelo.getCabecera();
        String[][] datos = modelo.getTours();
        DefaultTableModel modeloTabla = new DefaultTableModel(datos, cabecera);
        vistaTour.tablaTours.setModel(modeloTabla);
    }

    public void iniciarTour() {
        this.vistaTour.setVisible(true);
        this.vistaTour.setLocationRelativeTo(null);
        limpiarControles();
    }
}
