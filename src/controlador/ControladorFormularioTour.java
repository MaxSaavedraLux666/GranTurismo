/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Itinerario;
import modelo.ItinerarioArreglo;
import modelo.Tour;
import modelo.TourArreglo;
import vista.fmrRegistrarTour;
import vista.fmrTour;

/**
 *
 * @author User
 */
public class ControladorFormularioTour {

    fmrRegistrarTour vistaRegistrarTour;
    TourArreglo modeloTour;
    ItinerarioArreglo modeloItinerarios;

    public ControladorFormularioTour(fmrRegistrarTour vistaRegistrarTour, TourArreglo modeloTour, ItinerarioArreglo modeloItinerarios) {
        this.vistaRegistrarTour = vistaRegistrarTour;
        this.modeloTour = modeloTour;
        this.modeloItinerarios = modeloItinerarios;

        this.vistaRegistrarTour.btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Tour tour = new Tour(vistaRegistrarTour.txtField_Lugar.getText(), modeloItinerarios,
                        Float.parseFloat(vistaRegistrarTour.txtField_Precio.getText()),
                        vistaRegistrarTour.comboBox_Hora.getSelectedIndex(),
                        vistaRegistrarTour.txtField_Codigo.getText(), "LIBRE", new Date(2022 / 12 / 16));
                if (modeloTour.agregarTour(tour)) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido agregados exitosamente");
                    vistaRegistrarTour.tablaItinerario.removeAll();
                    vistaRegistrarTour.txtFieldBuscarCod.setText("");
                    vistaRegistrarTour.txtFieldDescripcionItinerario.setText("");
                    vistaRegistrarTour.txtFieldHoraItinerario.setText("");
                    vistaRegistrarTour.txtField_Codigo.setText("");
                    vistaRegistrarTour.txtField_Codigo1.setText("");
                    vistaRegistrarTour.txtField_Lugar.setText("");
                    vistaRegistrarTour.txtField_Precio.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido agregados exitosamente");
                }
            }
        });

        this.vistaRegistrarTour.btnSalirTourFmr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaRegistrarTour.dispose();
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
                        vistaRegistrarTour.txtField_Codigo.getText(), "LIBRE", new Date(2022 / 12 / 16));

                if (modeloTour.modificarTour(vistaRegistrarTour.txtFieldBuscarCod.getText(), tourNuevo)) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido modificados exitosamente");
                    vistaRegistrarTour.tablaItinerario.removeAll();
                    vistaRegistrarTour.txtFieldBuscarCod.setText("");
                    vistaRegistrarTour.txtFieldDescripcionItinerario.setText("");
                    vistaRegistrarTour.txtFieldHoraItinerario.setText("");
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

        this.vistaRegistrarTour.btn_AgregarItinerario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Itinerario itinerario = new Itinerario(vistaRegistrarTour.txtFieldCodigoItinerario.getText(), vistaRegistrarTour.txtFieldDescripcionItinerario.getText(),
                        vistaRegistrarTour.txtFieldHoraItinerario.getText());

                if (modeloItinerarios.agregarItinerario(itinerario)) {
                    limpiarControles();
                    vistaRegistrarTour.txtFieldDescripcionItinerario.setText("");
                    vistaRegistrarTour.txtFieldHoraItinerario.setText("");
                    vistaRegistrarTour.txtFieldCodigoItinerario.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido agregados exitosamente");
                }
            }
        });

        this.vistaRegistrarTour.btn_EliminarItinerario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (modeloItinerarios.eliminarItinerario(JOptionPane.showInputDialog("Ingrese el indice del itinerario\n"))) {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos han sido eliminados exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido eliminados exitosamente");
                }
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

    public void rellenarCbHoras() {
        String[] horas = this.modeloTour.getDuracion();
        vistaRegistrarTour.comboBox_Hora.removeAllItems();
        for (String hora : horas) {
            vistaRegistrarTour.comboBox_Hora.addItem(hora);
        }
    }

    private void limpiarControles() {
        String[] cabecera = modeloItinerarios.getCabecera();
        String[][] datos = modeloItinerarios.getItinerarios();
        DefaultTableModel modeloTabla = new DefaultTableModel(datos, cabecera);
        vistaRegistrarTour.tablaItinerario.setModel(modeloTabla);
    }

    public void iniciarRegistroTour() {
        this.vistaRegistrarTour.setVisible(true);
        this.vistaRegistrarTour.setResizable(false);
        this.vistaRegistrarTour.setLocationRelativeTo(null);
        rellenarCbHoras();
    }
}
