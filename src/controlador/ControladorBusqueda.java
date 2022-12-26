/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.PersonaArreglo;
import modelo.TourArreglo;
import modelo.VehiculoArreglo;
import vista.fmrBusqueda;
import vista.fmrRegistrarTour;
import vista.fmrReserva;

/**
 *
 * @author User
 */
public class ControladorBusqueda {

    fmrBusqueda vistaBusqueda;
    TourArreglo modeloTour;
    VehiculoArreglo modeloVehiculo;
    PersonaArreglo modeloPersona;

    public ControladorBusqueda(fmrBusqueda vistaBusqueda, TourArreglo modeloTour, VehiculoArreglo modeloVehiculo, PersonaArreglo modeloPersona) {
        this.vistaBusqueda = vistaBusqueda;
        this.modeloTour = modeloTour;
        this.modeloVehiculo = modeloVehiculo;
        this.modeloPersona = modeloPersona;

        this.vistaBusqueda.btnReservar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrReserva vistaReserva = new fmrReserva();
                ControladorReserva controlador = new ControladorReserva(vistaReserva, modeloTour, modeloVehiculo, modeloPersona);
                controlador.iniciarReserva();
            }
        });

        this.vistaBusqueda.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaBusqueda.dispose();
            }
        });
    }

    public void iniciarBusqueda() {
        this.vistaBusqueda.setVisible(true);
        this.vistaBusqueda.setLocationRelativeTo(null);
    }
}
