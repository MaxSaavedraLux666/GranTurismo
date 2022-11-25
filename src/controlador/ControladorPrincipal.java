/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.*;

/**
 *
 * @author User
 */
public class ControladorPrincipal {

    fmrPrincipal vista;

    public ControladorPrincipal(fmrPrincipal vista) {
        this.vista = vista;

        this.vista.btn_Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
        );

        this.vista.btnPaquete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //paquete
            }
        }
        );

        this.vista.btnReserva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Reserva
            }
        }
        );

        this.vista.btnTour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Tour
                fmrTour vistaTour = new fmrTour();
                ControladorTour controlTour = new ControladorTour(vistaTour);
                controlTour.iniciarTour();
            }
        }
        );

        this.vista.btnTrabajador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Trabajador
            }
        }
        );
    }

    public void iniciar() {
        this.vista.setVisible(true);

    }
}
