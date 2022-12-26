/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ItinerarioArreglo;
import modelo.PersonaArreglo;
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
    ItinerarioArreglo modeloItinerario;
    TourArreglo modeloTour;
    PersonaArreglo modeloPersona;

    public ControladorTrabajador(fmrTrabajador vistaTrabajador, TourArreglo modeloTour,
            ItinerarioArreglo modeloItinerario,
            PersonaArreglo modeloPersona) {
        this.vistaTrabajador = vistaTrabajador;
        this.modeloTour = modeloTour;
        this.modeloItinerario = modeloItinerario;
        this.modeloPersona = modeloPersona;

        this.vistaTrabajador.btnRegistrarTour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrRegistrarTour vistaRegistro = new fmrRegistrarTour();
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
