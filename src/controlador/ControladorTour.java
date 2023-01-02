/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.GuiaArreglo;
import modelo.PersonaArreglo;
import modelo.Tour;
import modelo.TourArreglo;
import modelo.VehiculoArreglo;
import modelo.VentaArreglo;
import vista.fmrBusqueda;
import vista.fmrTour;

/**
 *
 * @author User
 */
public class ControladorTour {

    fmrTour vistaTour;
    ControladorPrincipal controlPricipal;
    TourArreglo modeloTour;
    VehiculoArreglo modeloVehiculo;
    PersonaArreglo modeloPersona;
    GuiaArreglo modeloGuia;
    VentaArreglo modeloVenta;

    public ControladorTour(TourArreglo modeloTour, fmrTour vistaTour, VehiculoArreglo modeloVehiculo,
            PersonaArreglo modeloPersona, GuiaArreglo modeloGuia, VentaArreglo modeloVenta) {
        this.vistaTour = vistaTour;
        this.modeloTour = modeloTour;
        this.modeloVehiculo = modeloVehiculo;
        this.modeloPersona = modeloPersona;
        this.modeloGuia = modeloGuia;
        this.modeloVenta = modeloVenta;

        this.vistaTour.btn_BuscarTour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tour tour = modeloTour.buscarTour(vistaTour.txtFieldBusqueda.getText());
                if (tour != null) {
                    fmrBusqueda vistaBusqueda = new fmrBusqueda();
                    ControladorBusqueda controlador = new ControladorBusqueda(vistaBusqueda, modeloTour, modeloVehiculo,
                            modeloPersona, modeloTour.buscarTour(vistaTour.txtFieldBusqueda.getText()),
                            modeloTour.buscarTour(vistaTour.txtFieldBusqueda.getText()).getItinerarios(), modeloGuia, modeloVenta);
                    controlador.iniciarBusqueda();
                } else {
                    JOptionPane.showMessageDialog(null, """
                                                        El tour no se encuentra
                                                        Ingrese correctamente el c\u00f3digo""");
                }
            }
        });

        /*this.vistaTour.btn_Reservar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                fmrReserva vistaReserva = new fmrReserva();
                ControladorReserva controlador = new ControladorReserva(vistaReserva, modeloTour, modeloVehiculo, modeloPersona, );
                controlador.iniciarReserva();

            }
        });*/
        this.vistaTour.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaTour.dispose();
            }

        });
    }

    public void limpiarControles() {
        String[] cabecera = modeloTour.getCabecera();
        String[][] datos = modeloTour.getTour();
        DefaultTableModel modeloTabla = new DefaultTableModel(datos, cabecera);
        vistaTour.tablaTours.setModel(modeloTabla);
    }

    public void iniciarTour() {
        this.vistaTour.setVisible(true);
        this.vistaTour.setResizable(false);
        this.vistaTour.setLocationRelativeTo(null);
        limpiarControles();
    }
}
