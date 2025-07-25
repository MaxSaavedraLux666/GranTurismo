/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import libreria.SerializadoraGen;
import modelo.Cliente;
import modelo.Guia;
import modelo.GuiaArreglo;
import modelo.Persona;
import modelo.PersonaArreglo;
import modelo.Tour;
import modelo.TourArreglo;
import modelo.Vehiculo;
import modelo.VehiculoArreglo;
import modelo.VentaArreglo;
import vista.fmrCliente;
import vista.fmrVenta;

/**
 *
 * @author Sebastian
 */
public class ControladorCliente {

    fmrCliente vistaCliente = new fmrCliente();
    PersonaArreglo modeloPersona;
    VehiculoArreglo modeloVehiculo;
    TourArreglo modeloTour;
    GuiaArreglo modeloGuia;
    VentaArreglo modeloVenta;
    Cliente clienteElegido;
    Vehiculo vehiculoElegido;
    Tour tourElegido;
    Guia guiaElegido;
    String codigoReserva;

    public ControladorCliente(fmrCliente vistaCliente, PersonaArreglo modeloPersona, TourArreglo modeloTour,
            VehiculoArreglo modeloVehiculo, Tour tourElegido, GuiaArreglo modeloGuia, VentaArreglo modeloVenta) {

        this.vistaCliente = vistaCliente;
        this.modeloPersona = modeloPersona;
        this.modeloTour = modeloTour;
        this.modeloVehiculo = modeloVehiculo;
        this.tourElegido = tourElegido;
        this.modeloGuia = modeloGuia;
        this.modeloVenta = modeloVenta;

        this.vistaCliente.btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //genera el código de la reserva
                int min = 10;
                int max = 10000;
                int randomInt = ThreadLocalRandom.current().nextInt(min, max + 1);
                codigoReserva = String.valueOf(randomInt);
                ///

                Cliente cliente = new Cliente(codigoReserva,
                        vistaCliente.txtFieldNombreTitular.getText(),
                        vistaCliente.txtFieldCorreoTitular.getText(),
                        vistaCliente.txtFieldTelefonoTitular.getText(),
                        vistaCliente.txtFieldDNItitular.getText(),
                        Integer.parseInt(vistaCliente.txtFieldEdadTitular.getText()));

                guiaElegido = (Guia) vistaCliente.cbxGuia.getSelectedItem();
                vehiculoElegido = modeloVehiculo.buscarVehiculo(vistaCliente.txtFieldCodigoTransporte.getText());

                if (modeloPersona.agregar(cliente) && vehiculoElegido != null
                        && modeloGuia.buscarGuia(guiaElegido.getDNI()) != null) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido agregados exitosamente");
                    vistaCliente.txtFieldCodigoTransporte.setText("");
                    vistaCliente.txtFieldNombreTitular.setText("");
                    vistaCliente.txtFieldTelefonoTitular.setText("");
                    vistaCliente.txtFieldDNItitular.setText("");
                    vistaCliente.txtFieldEdadTitular.setText("");
                    vistaCliente.txtFieldCorreoTitular.setText("");
                    fmrVenta vistaVenta = new fmrVenta();
                    ControladorVenta controladorVenta = new ControladorVenta(vistaVenta, tourElegido, vehiculoElegido,
                            guiaElegido, cliente, modeloPersona, vistaCliente.txtFieldFecha.getText(), modeloVenta);
                    controladorVenta.iniciarVenta();
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido agregados exitosamente");
                }
            }
        });

        this.vistaCliente.btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaCliente.dispose();
            }
        });

    }

    public void rellenarGuias() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.addElement(" ");
        for (Guia obj : this.modeloGuia.getGuias()) {
            if (obj != null) {
                model.addElement(obj);
            }
        }
        this.vistaCliente.cbxGuia.setModel(model);

    }

    public void detallesReserva() {
        vistaCliente.labelDestino.setText(tourElegido.getNombrePaquete());
        vistaCliente.labelPrecio.setText(String.valueOf(tourElegido.getPrecioTour()));
    }

    public void limpiarControles() {
        String[] cabecera = modeloVehiculo.getCabecera();
        String[][] datos = modeloVehiculo.getVehiculo();
        DefaultTableModel modeloTabla = new DefaultTableModel(datos, cabecera);
        vistaCliente.tblVehiculo.setModel(modeloTabla);
    }

    public void iniciarCliente() {
        rellenarGuias();
        detallesReserva();
        this.vistaCliente.setVisible(true);
        this.vistaCliente.setLocationRelativeTo(null);
        limpiarControles();
    }

}
