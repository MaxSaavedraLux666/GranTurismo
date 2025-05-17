/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Itinerario;
import modelo.ItinerarioArreglo;
import vista.fmrItinerario;

/**
 *
 * @author User
 */
public class ControladorItinerario{

    fmrItinerario vistaItinerario;
    ItinerarioArreglo modeloItinerario;

    public ControladorItinerario(fmrItinerario vistaItinerario, ItinerarioArreglo modeloItinerario) {
        this.vistaItinerario = vistaItinerario;
        this.modeloItinerario = modeloItinerario;

        this.vistaItinerario.btn_AgregarItinerario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Itinerario itinerario = new Itinerario(vistaItinerario.txtFieldCodigoItinerario.getText(), vistaItinerario.txtFieldDescripcionItinerario.getText(),
                        vistaItinerario.txtFieldHoraItinerario.getText());
                if (modeloItinerario.agregarItinerario(itinerario)) {
                    limpiarControles();
                    vistaItinerario.txtFieldDescripcionItinerario.setText("");
                    vistaItinerario.txtFieldHoraItinerario.setText("");
                    vistaItinerario.txtFieldCodigoItinerario.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, """
                                                        Error
                                                        Los datos no han sido agregados exitosamente""");
                }
            }
        });

        this.vistaItinerario.btn_EliminarItinerario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (modeloItinerario.eliminarItinerario(JOptionPane.showInputDialog("Ingrese el indice del itinerario\n"))) {
                    JOptionPane.showMessageDialog(null,
                            "Los datos han sido eliminados exitosamente");
                    limpiarControles();
                } else {
                    JOptionPane.showMessageDialog(null, """
                                                        Error
                                                        Los datos no han sido eliminados exitosamente""");
                }
            }
        });
        
        this.vistaItinerario.btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaItinerario.dispose();
            }
        });
    }

    private void limpiarControles() {
        String[] cabecera = modeloItinerario.getCabecera();
        String[][] datos = modeloItinerario.getItinerarios();
        DefaultTableModel modeloTabla = new DefaultTableModel(datos, cabecera);
        vistaItinerario.tablaItinerario.setModel(modeloTabla);
    }

    public void iniciarItinerario() {
        this.vistaItinerario.setVisible(true);
        this.vistaItinerario.setLocationRelativeTo(null);
        limpiarControles();
    }
}
