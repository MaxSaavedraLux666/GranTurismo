/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Cliente;
import modelo.PersonaArreglo;
import vista.fmrCliente;

/**
 *
 * @author Sebastian
 */
public class ControladorCliente {

    fmrCliente vistaCliente = new fmrCliente();
    PersonaArreglo modelo;

    public ControladorCliente(fmrCliente vistaCliente, PersonaArreglo modelo) {
        this.vistaCliente = vistaCliente;
        this.modelo=modelo;

        this.vistaCliente.btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente(vistaCliente.txtFieldCodigoReservaTitular.getText(),
                        vistaCliente.txtFieldNombreTitular.getText(),
                        vistaCliente.txtFieldCorreoTitular.getText(),
                        vistaCliente.txtFieldTelefonoTitular.getText(),
                        vistaCliente.txtFieldDNItitular.getText(),
                        Integer.parseInt(vistaCliente.txtFieldEdadTitular.getText()));
                modelo.agregar(cliente);
            }
    
        });

        this.vistaCliente.btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaCliente.dispose();

            }
        });
    }

    public void iniciarCliente() {
        this.vistaCliente.setVisible(true);
        this.vistaCliente.setLocationRelativeTo(null);
    }
}
