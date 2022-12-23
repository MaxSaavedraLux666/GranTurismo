/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ItinerarioArreglo;
import modelo.TourArreglo;
import vista.fmrCliente;
import vista.fmrRegistrarTour;
import vista.fmrTrabajador;

/**
 *
 * @author User
 */
public class ControladorTrabajador {

    fmrTrabajador vistaTrabajador;

    public ControladorTrabajador(fmrTrabajador vistaTrabajador) {
        this.vistaTrabajador = vistaTrabajador;

        this.vistaTrabajador.btnRegistrarTour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrRegistrarTour vistaRegistro = new fmrRegistrarTour();
                TourArreglo modeloTour = new TourArreglo(1);
                ItinerarioArreglo modeloItinerario = new ItinerarioArreglo(1);
                ControladorFormularioTour controlador = new ControladorFormularioTour(vistaRegistro, modeloTour, modeloItinerario);
                controlador.iniciarRegistroTour();
            }
        });

        this.vistaTrabajador.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaTrabajador.dispose();
            }
        });

        this.vistaTrabajador.btnRegistrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrCliente vistaCliente = new fmrCliente();
                ControladorCliente controladorCliente = new ControladorCliente(vistaCliente);
                controladorCliente.iniciarCliente();
            }
        });

    }

    public void iniciarTrabajador() {
        this.vistaTrabajador.setVisible(true);
        this.vistaTrabajador.setLocationRelativeTo(null);
    }
}
