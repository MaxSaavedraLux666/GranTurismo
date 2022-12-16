/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Cliente;
import vista.fmrCliente;
import vista.fmrTrabajador;

/**
 *
 * @author Sebastian
 */
public class ControladorCliente {

    fmrCliente vistaCliente = new fmrCliente();

    public ControladorCliente(fmrCliente vistaCliente) {
        this.vistaCliente = vistaCliente;

        this.vistaCliente.btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente(vistaCliente.txtFieldCodigoReservaTitular.getText(),
                        vistaCliente.txtFieldNombreTitular.getText(),
                        vistaCliente.txtFieldCorreoTitular.getText(),
                        vistaCliente.txtFieldTelefonoTitular.getText(),
                        vistaCliente.txtFieldDNItitular.getText(),
                        Integer.parseInt(vistaCliente.txtFieldEdadTitular.getText()));
            }
    
        });

        this.vistaCliente.btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrTrabajador vistaTrabajador = new fmrTrabajador();
                ControladorTrabajador controladorTrabajador = new ControladorTrabajador(vistaTrabajador);
                vistaCliente.dispose();

            }
        });
    }

    public void iniciarCliente() {
        this.vistaCliente.setVisible(true);
        this.vistaCliente.setLocationRelativeTo(null);
    }
}
