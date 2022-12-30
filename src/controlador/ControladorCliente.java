/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
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
    Cliente clienteElegido;
    static int i = 0;
    String codigo;

    public ControladorCliente(fmrCliente vistaCliente, PersonaArreglo modelo) {
        this.vistaCliente = vistaCliente;
        this.modelo = modelo;

        this.vistaCliente.btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (i == 0) {
                    codigo = "100000";
                }
                Cliente cliente = new Cliente(codigo,
                        vistaCliente.txtFieldNombreTitular.getText(),
                        vistaCliente.txtFieldCorreoTitular.getText(),
                        vistaCliente.txtFieldTelefonoTitular.getText(),
                        vistaCliente.txtFieldDNItitular.getText(),
                        Integer.parseInt(vistaCliente.txtFieldEdadTitular.getText()));
                if (modelo.agregar(cliente)) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido agregados exitosamente");
                    vistaCliente.txtFieldNombreTitular.setText("");
                    vistaCliente.txtFieldCorreoTitular.setText("");
                    vistaCliente.txtFieldTelefonoTitular.setText("");
                    vistaCliente.txtFieldDNItitular.setText("");
                    vistaCliente.txtFieldEdadTitular.setText("");
                    codigo = generarCodigoReserva();
                    vistaCliente.labelCodReserva.setText(codigo);
                    clienteElegido = (Cliente) modelo.buscarPersona(codigo);
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido agregados exitosamente");
                }
                i++;
            }
        });

        this.vistaCliente.btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaCliente.dispose();
            }
        });
    }

    public String generarCodigoReserva() {
        int aleatorio = 0;
        aleatorio = (int) (Math.random() * (999999 - 100000 + 1) + 100000);
        codigo = String.valueOf(aleatorio);
        return codigo;
    }

    public Cliente devolverCliente() {
        return clienteElegido;
    }

    public void iniciarCliente() {
        vistaCliente.labelCodReserva.setText("100000");
        this.vistaCliente.setVisible(true);
        this.vistaCliente.setLocationRelativeTo(null);
    }

}
