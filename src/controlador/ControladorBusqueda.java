/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import modelo.Guia;
import modelo.GuiaArreglo;
import modelo.ItinerarioArreglo;
import modelo.PersonaArreglo;
import modelo.Tour;
import modelo.TourArreglo;
import modelo.Vehiculo;
import modelo.VehiculoArreglo;
import vista.fmrBusqueda;
import vista.fmrCliente;

/**
 *
 * @author User
 */
public class ControladorBusqueda {

    fmrBusqueda vistaBusqueda;
    TourArreglo modeloTour;
    VehiculoArreglo modeloVehiculo;
   
    PersonaArreglo modeloPersona;
    GuiaArreglo modeloGuia;
    Tour tourElegido;
    ItinerarioArreglo modeloItinerario;

    public ControladorBusqueda(fmrBusqueda vistaBusqueda, TourArreglo modeloTour,
            VehiculoArreglo modeloVehiculo, PersonaArreglo modeloPersona,
            Tour tourElegido, ItinerarioArreglo modeloItinerario, GuiaArreglo modeloGuia) {
        this.vistaBusqueda = vistaBusqueda;
        this.modeloTour = modeloTour;
        this.modeloVehiculo = modeloVehiculo;
     
        this.modeloPersona = modeloPersona;
        this.tourElegido = tourElegido;
        this.modeloItinerario = modeloItinerario;
        this.modeloGuia = modeloGuia;

        this.vistaBusqueda.btnReservar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrCliente vistaCliente = new fmrCliente();
                Guia guiaElegido= new Guia(" "," ",0," ");
                ControladorCliente controladorCliente = new ControladorCliente(vistaCliente, modeloPersona, modeloTour, 
                modeloVehiculo, tourElegido, modeloGuia, guiaElegido);
                controladorCliente.iniciarCliente();
            }
        });

        this.vistaBusqueda.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaBusqueda.dispose();
            }
        });
    }

    private void detalleTour() {
        this.vistaBusqueda.labelNombreDestino.setText(tourElegido.getNombrePaquete());
        this.vistaBusqueda.labelPrecio.setText(String.valueOf(tourElegido.getPrecioTour()) + " $");
        this.vistaBusqueda.labelEstado.setText(tourElegido.getEstado());
        this.vistaBusqueda.labelHora.setText(String.valueOf(tourElegido.getHoras()) + " horas");
        this.vistaBusqueda.labelCodigo.setText(tourElegido.getCodTour());
    }

    private void llenarListaItinerario() {
        DefaultListModel modelo = new DefaultListModel();
        modelo.removeAllElements();
        for (int i = 0; i < modeloItinerario.getTotal(); i++) {
           modelo.addElement(Arrays.toString(modeloItinerario.getItinerarios()[i]));
        }
        vistaBusqueda.listItinerario.setModel(modelo);
    }

    public void iniciarBusqueda() {
        this.vistaBusqueda.setVisible(true);
        this.vistaBusqueda.setLocationRelativeTo(null);
        detalleTour();
        llenarListaItinerario();
    }
}
