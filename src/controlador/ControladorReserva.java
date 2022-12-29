/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
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

    public ControladorReserva(fmrReserva vistaReserva, TourArreglo modeloTour, VehiculoArreglo modeloVehiculo, PersonaArreglo modeloPersona) {
        this.vistaReserva = vistaReserva;
        this.modeloTour = modeloTour;
        this.modeloVehiculo = modeloVehiculo;
        this.modeloPersona = modeloPersona;
        
        
        
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
    
    public void rellenarCbDestino(){ 
        String lugares[]=new String[3];
        lugares[0]="Machu Picchu";
        lugares[1]="Ciudadela";
        lugares[2]="Inti Raymi";
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for(String obj: lugares){
            model.addElement(obj);
        }
        this.vistaReserva.cbDestino.setModel(model);
    }
    public void iniciarReserva(){
        this.vistaReserva.setVisible(true);
        this.vistaReserva.setLocationRelativeTo(null);
    }
}
