/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import modelo.Cliente;
import modelo.PersonaArreglo;
import modelo.Tour;
import modelo.TourArreglo;
import modelo.VehiculoArreglo;
import vista.fmrCliente;
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
    Tour tourElegido;

    public ControladorReserva(fmrReserva vistaReserva, TourArreglo modeloTour, VehiculoArreglo modeloVehiculo, PersonaArreglo modeloPersona, Tour tourElegido) {
        this.vistaReserva = vistaReserva;
        this.modeloTour = modeloTour;
        this.modeloVehiculo = modeloVehiculo;
        this.modeloPersona = modeloPersona;
        this.tourElegido=tourElegido;
        
        
        
        this.vistaReserva.btnAceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrVenta vistaVenta = new fmrVenta();
                ControladorVenta controlador = new ControladorVenta(vistaVenta);
                controlador.iniciarVenta();
            }
        });
        
        this.vistaReserva.btnRegistroCliente.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrCliente vistaCliente = new fmrCliente();
                ControladorCliente controladorCliente = new ControladorCliente(vistaCliente,modeloPersona);
                controladorCliente.iniciarCliente();
            }  
        });
        
        this.vistaReserva.btnRegresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaReserva.dispose();
            }
        });
    } 
    
    public void detallesReserva(){
        vistaReserva.labelDestino.setText(tourElegido.getNombrePaquete());
        vistaReserva.labelPrecio.setText(String.valueOf(tourElegido.getPrecioTour()));

    }
    public void iniciarReserva(){
        this.vistaReserva.setVisible(true);
        this.vistaReserva.setLocationRelativeTo(null);
        detallesReserva();
    }
}
