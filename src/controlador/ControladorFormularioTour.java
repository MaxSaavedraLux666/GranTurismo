/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ItinerarioArreglo;
import modelo.Tour;
import modelo.TourArreglo;
import vista.fmrItinerario;
import vista.fmrRegistrarTour;

/**
 *
 * @author User
 */
public class ControladorFormularioTour {

    fmrRegistrarTour vistaRegistrarTour;
    TourArreglo modeloTour;
    ItinerarioArreglo modeloItinerarios;

    public ControladorFormularioTour(fmrRegistrarTour vistaRegistrarTour, TourArreglo modeloTour) {
        this.vistaRegistrarTour = vistaRegistrarTour;
        this.modeloTour = modeloTour;

        this.vistaRegistrarTour.btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Tour tour = new Tour(vistaRegistrarTour.txtField_Lugar.getText(), modeloItinerarios,
                        Float.parseFloat(vistaRegistrarTour.txtField_Precio.getText()),
                        vistaRegistrarTour.comboBox_Hora.getSelectedIndex(),
                        vistaRegistrarTour.txtField_Codigo.getText());
                if (modeloTour.agregarTour(tour)) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido agregados exitosamente");
                    vistaRegistrarTour.txtFieldBuscarCod.setText("");
                    vistaRegistrarTour.txtField_Codigo.setText("");
                    vistaRegistrarTour.txtField_Codigo1.setText("");
                    vistaRegistrarTour.txtField_Lugar.setText("");
                    vistaRegistrarTour.txtField_Precio.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, """
                                                        Error
                                                        Los datos no han sido agregados exitosamente""");
                }
            }
        });

        this.vistaRegistrarTour.btnBuscra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modeloTour.buscarTour(vistaRegistrarTour.txtFieldBuscarCod.getText());
            }
        });

        this.vistaRegistrarTour.btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (modeloTour.eliminarTour(vistaRegistrarTour.txtFieldBuscarCod.getText())) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido eliminado exitosamente");
                    vistaRegistrarTour.txtFieldBuscarCod.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido eliminado exitosamente");
                }
            }
        });

        this.vistaRegistrarTour.btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Tour tourNuevo = new Tour(vistaRegistrarTour.txtField_Lugar.getText(), modeloItinerarios,
                        Float.parseFloat(vistaRegistrarTour.txtField_Precio.getText()),
                        vistaRegistrarTour.comboBox_Hora.getSelectedIndex(),
                        vistaRegistrarTour.txtField_Codigo.getText());

                if (modeloTour.modificarTour(vistaRegistrarTour.txtFieldBuscarCod.getText(), tourNuevo)) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido modificados exitosamente"); 
                    vistaRegistrarTour.txtFieldBuscarCod.setText("");
                    vistaRegistrarTour.txtField_Codigo.setText("");
                    vistaRegistrarTour.txtField_Codigo1.setText("");
                    vistaRegistrarTour.txtField_Lugar.setText("");
                    vistaRegistrarTour.txtField_Precio.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido modificados exitosamente");
                }
            }
        });
        
        this.vistaRegistrarTour.btnAgregarItinerario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrItinerario vistaItinerario = new fmrItinerario();
                modeloItinerarios = new ItinerarioArreglo(1);
                ControladorItinerario controlador = new ControladorItinerario(vistaItinerario, modeloItinerarios);
                controlador.iniciarItinerario();
            }
        });
        
        this.vistaRegistrarTour.btnSalirTourFmr.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaRegistrarTour.dispose();
            }
        });

        this.vistaRegistrarTour.btnAdvertencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, """
                                                    El boton agregar guardar\u00e1 todos los datos llenados en los casilleros
                                                    Para modificar, primero se ingresa el c\u00f3digo en la parte del bot\u00f3n buscar
                                                    Para elimininar, primero se busca el c\u00f3digo en la parte del bot\u00f3n buscar""");
            }
        });
    }

    public void rellenarCbHoras() {
        String[] horas = this.modeloTour.getDuracion();
        vistaRegistrarTour.comboBox_Hora.removeAllItems();
        for (String hora : horas) {
            vistaRegistrarTour.comboBox_Hora.addItem(hora);
        }
    }

    public void iniciarRegistroTour() {
        this.vistaRegistrarTour.setVisible(true);
        this.vistaRegistrarTour.setResizable(false);
        this.vistaRegistrarTour.setLocationRelativeTo(null);
        rellenarCbHoras();
    }
}
