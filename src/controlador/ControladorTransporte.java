/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.fmrTransporte;

/**
 *
 * @author User
 */
public class ControladorTransporte {

    fmrTransporte vistaTransporte;

    public ControladorTransporte(fmrTransporte vistaTransporte) {
        this.vistaTransporte = vistaTransporte;

        this.vistaTransporte.btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        this.vistaTransporte.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaTransporte.dispose();

            }
        });
    }

    public void iniciarTransporte() {
        this.vistaTransporte.setVisible(true);
    }
}
