/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
                ControladorFormularioTour controlador = new ControladorFormularioTour(vistaRegistro);
                controlador.iniciarRegistroTour();
            }
        });

        this.vistaTrabajador.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrTrabajador vistaTrabajado1 = new fmrTrabajador();
                ControladorTrabajador controlador = new ControladorTrabajador(vistaTrabajado1);
                controlador.iniciarTrabajador();
                vistaTrabajado1.dispose();
            }
        });
    }

    public void iniciarTrabajador() {
        this.vistaTrabajador.setVisible(true);
        this.vistaTrabajador.setLocationRelativeTo(null);
    }
}
