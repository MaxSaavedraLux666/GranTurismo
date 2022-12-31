/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import modelo.Cliente;
import modelo.Guia;
import modelo.GuiaArreglo;
import modelo.Persona;
import modelo.PersonaArreglo;
import modelo.Tour;
import modelo.TourArreglo;
import modelo.Vehiculo;
import modelo.VehiculoArreglo;
import modelo.Viaje;
import vista.fmrCliente;
import vista.fmrGuia;
import vista.fmrReserva;
import vista.fmrTransporte;
import vista.fmrVenta;

/**
 *
 * @author User
 */
public class ControladorReserva {

    fmrReserva vistaReserva;
    TourArreglo modeloTour;
    VehiculoArreglo modeloVehiculo;
    PersonaArreglo modeloPersona;
    GuiaArreglo modeloGuia;
    Tour tourElegido;
    Vehiculo vehiculoElegido;
    Guia guiaElegido;
    Cliente clienteElegido;
    Viaje viaje;

    public ControladorReserva(fmrReserva vistaReserva, TourArreglo modeloTour, 
            VehiculoArreglo modeloVehiculo, PersonaArreglo modeloPersona, 
            Tour tourElegido, GuiaArreglo modeloGuia) {
        this.vistaReserva = vistaReserva;
        this.modeloTour = modeloTour;
        this.modeloVehiculo = modeloVehiculo;
        this.modeloPersona = modeloPersona;
        this.tourElegido = tourElegido;
        this.modeloGuia = modeloGuia;
        
        this.vistaReserva.btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrVenta vistaVenta = new fmrVenta();
                viaje = new Viaje(tourElegido, vehiculoElegido, guiaElegido);
                ControladorVenta controlador = new ControladorVenta(vistaVenta, tourElegido, vehiculoElegido, 
                        guiaElegido, clienteElegido);
                controlador.iniciarVenta();
            }
        });

        this.vistaReserva.btnRegistroCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrCliente vistaCliente = new fmrCliente();
                ControladorCliente controladorCliente = new ControladorCliente(vistaCliente, modeloPersona);
                controladorCliente.iniciarCliente();
                clienteElegido = (Cliente) controladorCliente.devolverCliente();
            }
        });

        this.vistaReserva.btnElegirTranporte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrTransporte vistaTransporte = new fmrTransporte();
                ControladorTransporte controlador = new ControladorTransporte(vistaTransporte, modeloVehiculo);
                controlador.iniciarTransporte();
                vehiculoElegido = controlador.enviarVehiculo();
            }
        });
        
        this.vistaReserva.btnElegirGuia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrGuia vistaGuia = new fmrGuia();
                ControladorGuia controlador = new ControladorGuia(vistaGuia, modeloGuia);
                controlador.iniciarGuia();
                guiaElegido = controlador.enviarGuia();
            }
        });

        this.vistaReserva.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaReserva.dispose();
            }
        });
    }

    public void detallesReserva() {
        vistaReserva.labelDestino.setText(tourElegido.getNombrePaquete());
        vistaReserva.labelPrecio.setText(String.valueOf(tourElegido.getPrecioTour()));

    }

    public void iniciarReserva() {
        this.vistaReserva.setVisible(true);
        this.vistaReserva.setLocationRelativeTo(null);
        detallesReserva();
    }
}
