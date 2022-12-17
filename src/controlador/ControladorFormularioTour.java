/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Itinerario;
import modelo.ItinerarioArreglo;
import modelo.Tour;
import modelo.TourArreglo;
import vista.fmrRegistrarTour;
import vista.fmrTour;
import vista.fmrTrabajador;

/**
 *
 * @author User
 */
public class ControladorFormularioTour {

    fmrRegistrarTour vistaRegistrarTour;
    TourArreglo modelo;
    fmrTour vistaTour;
    fmrTrabajador vistaTrabajador1;

    public ControladorFormularioTour(fmrRegistrarTour vistaRegistrarTour, TourArreglo modelo) {
        this.vistaRegistrarTour = vistaRegistrarTour;
        this.modelo = modelo;

        this.vistaRegistrarTour.btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Itinerario itinerario = new Itinerario();

                Tour tour = new Tour(vistaRegistrarTour.txtField_Lugar.getText(), itinerario,
                        Float.parseFloat(vistaRegistrarTour.txtField_Precio.getText()),
                        Integer.parseInt(vistaRegistrarTour.comboBox_Hora.getSelectedItem().toString()),
                        vistaRegistrarTour.txtField_Codigo.getText(), "LIBRE", new Date(2022 / 12 / 16));

                if (modelo.agregar(tour)) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido agregados exitosamente");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido agregados exitosamente");
                }

            }
        });

        this.vistaRegistrarTour.btnSalirTourFmr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                fmrTrabajador vistaTrabajador = new fmrTrabajador();
                ControladorTrabajador controlador = new ControladorTrabajador(vistaTrabajador);
                vistaTrabajador1.dispose();
            }
        });

        this.vistaRegistrarTour.btnBuscra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                
                modelo.buscar(vistaRegistrarTour.txtFieldBuscarCod.getText());
                    
                
            }
        });

        this.vistaRegistrarTour.btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (modelo.eliminar(vistaRegistrarTour.txtFieldBuscarCod.getText())) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido eliminado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido eliminado exitosamente");
                }

            }
        });

        this.vistaRegistrarTour.btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Itinerario itinerario = new Itinerario();
                Tour tourNuevo = new Tour(vistaRegistrarTour.txtField_Lugar.getText(), itinerario,
                        Float.parseFloat(vistaRegistrarTour.txtField_Precio.getText()),
                        Integer.parseInt(vistaRegistrarTour.comboBox_Hora.getSelectedItem().toString()),
                        vistaRegistrarTour.txtField_Codigo.getText(), "LIBRE", new Date(2022 / 12 / 16));

                if (modelo.modificar(vistaRegistrarTour.txtFieldBuscarCod.getText(), tourNuevo)) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido modificados exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido modificados exitosamente");
                }

            }
        });

        this.vistaRegistrarTour.btn_AgregarItinerario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Itinerario itinerario = new Itinerario(vistaRegistrarTour.txtFieldDescripcionItinerario.getText(),
                        vistaRegistrarTour.txtFieldHoraItinerario.getText());
                ItinerarioArreglo mensaje = new ItinerarioArreglo(1);

                if (mensaje.agregar(itinerario)) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido agregados exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido agregados exitosamente");
                }
            }
        });

        this.vistaRegistrarTour.comboBox_Hora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        this.vistaRegistrarTour.btnAdvertencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "El boton agregar guardará todos los datos llenados en los casilleros\n"
                        + "Para modificar, primero se ingresa el código en la parte del botón buscar\n"
                        + "Para elimininar, primero se busca el código en la parte del botón buscar");
            }
        });
    }

    public void iniciarRegistroTour() {
        this.vistaRegistrarTour.setVisible(true);
        this.vistaRegistrarTour.setLocationRelativeTo(null);
    }
}
