/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import libreria.SerializadoraGen;
import modelo.Cliente;
import modelo.Guia;
import modelo.Persona;
import modelo.PersonaArreglo;
import modelo.Tour;
import modelo.Vehiculo;
import modelo.Venta;
import modelo.VentaArreglo;
import vista.fmrBoleta;
import vista.fmrVenta;

/**
 *
 * @author User
 */
public class ControladorVenta {

    fmrVenta vistVenta;
    PersonaArreglo modeloPersona;
    VentaArreglo modeloVenta;
    Tour tourElegido;
    Vehiculo vehiculoElegido;
    Guia guiaElegido;
    Persona clienteElegido;
    String fecha;
    Date fechaVenta;
    Venta venta;

    public ControladorVenta(fmrVenta vistVenta, Tour tourElegido, Vehiculo vehiculoElegido,
            Guia guiaElegido, Persona clienteElegido, PersonaArreglo modeloPersona,
            String fecha, VentaArreglo modeloVenta) {
        this.vistVenta = vistVenta;
        this.guiaElegido = guiaElegido;
        this.tourElegido = tourElegido;
        this.vehiculoElegido = vehiculoElegido;
        this.clienteElegido = clienteElegido;
        this.modeloPersona = modeloPersona;
        this.fecha = fecha;
        this.modeloVenta = modeloVenta;

        this.vistVenta.btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrBoleta vistaBoleta = new fmrBoleta();

                float pago = Float.parseFloat(JOptionPane.showInputDialog(null, " Le corresponde un pago de "
                        + tourElegido.getPrecioTour() + " $ \n" + " Ingresar monto\n"));

                if (pago == tourElegido.getPrecioTour()) {

                    venta = new Venta(fechaVenta, tourElegido.getCodTour(),
                            modeloPersona.enviarCliente((Cliente) clienteElegido).getCodReserva(), 
                            tourElegido.getPrecioTour());
                    modeloVenta.agregarVenta(venta);
                    SerializadoraGen.serializar("ventas.txt", modeloVenta);
                    
                    ControladorBoleta controlador = new ControladorBoleta(vistaBoleta, clienteElegido,
                            tourElegido, fecha, guiaElegido, modeloPersona, fechaVenta);
                    controlador.iniciarBoleta();
                    SerializadoraGen.serializar("personas.txt", modeloPersona);
                    vistVenta.dispose();
                } else {

                    JOptionPane.showMessageDialog(null, "El pago no corresponde, vuelve a intentarlo");
                }
            }
        });

        this.vistVenta.btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistVenta.dispose();
            }
        });
    }

    public void detallesVenta() {
        this.vistVenta.labdelDestino.setText(tourElegido.getNombrePaquete());
        this.vistVenta.labelNCliente.setText(clienteElegido.getNombre());
        this.vistVenta.labelDocumento.setText(clienteElegido.getDni());
        this.vistVenta.labelCorreo.setText(modeloPersona.enviarCliente((Cliente) clienteElegido).getCorreo());
        this.vistVenta.labelTelefono.setText(modeloPersona.enviarCliente((Cliente) clienteElegido).getTelefono());
        this.vistVenta.labelFechaI.setText(fecha);
        this.vistVenta.labelFechaV.setText(fecha);
        LocalDate hoy = LocalDate.now();
        // convertir la fecha a una cadena de texto en el formato "dd/MM/yyyy"
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hoyString = hoy.format(formato);
        this.fechaVenta = new Date(hoyString);
        this.vistVenta.labelFechaCompra.setText(hoyString);
        this.vistVenta.labelCodReserva.setText(modeloPersona.enviarCliente((Cliente) clienteElegido).getCodReserva());
        this.vistVenta.labelNomAgencia.setText("Agencia Cusco travel");
        this.vistVenta.labelGuia.setText(guiaElegido.getNombre());
        this.vistVenta.labCodVehiculo.setText(vehiculoElegido.getCodigoVehiculo());
        this.vistVenta.labelCosto.setText(String.valueOf(tourElegido.getPrecioTour()) + " $");
    }

    public void iniciarVenta() {
        this.vistVenta.setVisible(true);
        this.vistVenta.setLocationRelativeTo(null);
        detallesVenta();
    }
}
