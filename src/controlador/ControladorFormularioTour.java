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
import controlador.*;
import java.io.Serializable;
import libreria.SerializadoraGen;
import vista.fmrPrincipal;

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
                        Integer.parseInt(vistaRegistrarTour.txtHora.getText()), vistaRegistrarTour.txtField_Codigo.getText());
                if (modeloTour.agregarTour(tour)) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido agregados exitosamente");
                    vistaRegistrarTour.txtField_Codigo.setText("");
                    vistaRegistrarTour.txtField_Lugar.setText("");
                    vistaRegistrarTour.txtField_Precio.setText("");
                    
                    fmrPrincipal vista = new fmrPrincipal();
                    ControladorPrincipal control = new ControladorPrincipal(vista, modeloTour);
                    control.llenarLista();
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
                String cod = JOptionPane.showInputDialog(null, "Ingrese el codigo del tour");
                if (modeloTour.buscarTour(cod) != null) {
                    vistaRegistrarTour.txtField_Codigo.setText(modeloTour.buscarTour(cod).getCodTour());
                    vistaRegistrarTour.txtField_Lugar.setText(modeloTour.buscarTour(cod).getNombrePaquete());
                    vistaRegistrarTour.txtHora.setText(String.valueOf(modeloTour.buscarTour(cod).getHoras()));
                    vistaRegistrarTour.txtField_Precio.setText(String.valueOf(modeloTour.buscarTour(cod).getPrecioTour()));
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos son incorrectos");
                }
            }
        });

        this.vistaRegistrarTour.btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cod = JOptionPane.showInputDialog(null, "Ingrese el codigo del tour");
                if (modeloTour.eliminarTour(cod)) {
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

                String cod = JOptionPane.showInputDialog(null, "Ingrese el codigo del tour");

                Tour tourNuevo = new Tour(vistaRegistrarTour.txtField_Lugar.getText(), modeloItinerarios,
                        Float.parseFloat(vistaRegistrarTour.txtField_Precio.getText()),
                        Integer.parseInt(vistaRegistrarTour.txtHora.getText()),
                        vistaRegistrarTour.txtField_Codigo.getText());

                if (modeloTour.buscarTour(cod) != null) {
                    if (modeloTour.modificarTour(cod, tourNuevo)) {
                        JOptionPane.showMessageDialog(null, "Los datos han sido modificados exitosamente");
                        vistaRegistrarTour.txtField_Codigo.setText("");
                        vistaRegistrarTour.txtField_Lugar.setText("");
                        vistaRegistrarTour.txtField_Precio.setText("");
                        vistaRegistrarTour.txtHora.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error\n"
                                + "Los datos no han sido modificados exitosamente");
                    }

                } else if (vistaRegistrarTour.txtField_Codigo.getText().equals("") && vistaRegistrarTour.txtField_Lugar.getText().equals("")
                        && vistaRegistrarTour.txtField_Precio.getText().equals("") && vistaRegistrarTour.txtHora.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Hay datos vacíos");
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

        this.vistaRegistrarTour.btnSalirTourFmr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SerializadoraGen.serializar("tours.txt", modeloTour);
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

    public void iniciarRegistroTour() {
        this.vistaRegistrarTour.setVisible(true);
        this.vistaRegistrarTour.setResizable(false);
        this.vistaRegistrarTour.setLocationRelativeTo(null);

    }
}
