/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import modelo.Itinerario;
import modelo.Tour;
import modelo.TourArreglo;
import vista.fmrRegistrarTour;
import vista.fmrTour;
import vista.fmrTrabajador;

/**
 *
 * @author User
 */
public class ControladorFormularioTour {

    fmrRegistrarTour vistaRegistrarTour;
    TourArreglo modelo;
    fmrTour vistaTour;
    fmrTrabajador vistaTrabajador1;

    public ControladorFormularioTour(fmrRegistrarTour vistaRegistrarTour) {
        this.vistaRegistrarTour = vistaRegistrarTour;

        this.vistaRegistrarTour.btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               Itinerario itinerario = new Itinerario();
               
               Tour tour = new Tour(vistaRegistrarTour.txtField_Lugar.getText(), itinerario, 
                        Float.parseFloat(vistaRegistrarTour.txtField_Precio.getText()),
                        Integer.parseInt(vistaRegistrarTour.comboBox_Hora.getSelectedItem().toString()),
                        vistaRegistrarTour.txtField_Codigo.getText(), "LIBRE", new Date(2022/12/16));
               TourArreglo nuevo = new TourArreglo();
               nuevo.agregar(tour);
            }
        });

        this.vistaRegistrarTour.btnSalirTourFmr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                fmrTrabajador vistaTrabajador = new fmrTrabajador();
                ControladorTrabajador controlador = new ControladorTrabajador(vistaTrabajador);
                vistaTrabajador1.dispose();
            }
        });

        this.vistaRegistrarTour.btnBuscra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        this.vistaRegistrarTour.btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        this.vistaRegistrarTour.btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        this.vistaRegistrarTour.btn_AgregarItinerario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        this.vistaRegistrarTour.comboBox_Hora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void iniciarRegistroTour() {
        this.vistaRegistrarTour.setVisible(true);
    }
}
