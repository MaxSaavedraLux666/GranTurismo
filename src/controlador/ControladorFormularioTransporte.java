/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import libreria.SerializadoraGen;
import modelo.Vehiculo;
import modelo.VehiculoArreglo;
import vista.fmrRegistroTransporte;

/**
 *
 * @author User
 */
public class ControladorFormularioTransporte{

    fmrRegistroTransporte vistaTransporte;
    VehiculoArreglo modeloVehiculo;
    Vehiculo vehiculo;

    public ControladorFormularioTransporte(fmrRegistroTransporte vistaTransporte, VehiculoArreglo modeloVehiculo) {
        this.vistaTransporte = vistaTransporte;
        this.modeloVehiculo = modeloVehiculo;

        this.vistaTransporte.btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vehiculo = new Vehiculo(vistaTransporte.txtCodAuto.getText(), Integer.parseInt(vistaTransporte.txtCapacidad.getText()), 
                        Float.parseFloat(vistaTransporte.txtCostoP.getText()), vistaTransporte.txtNombreDuenio.getText());
                if (modeloVehiculo.agregar(vehiculo)) {
                    limpiarControles();
                    vistaTransporte.txtCapacidad.setText("");
                    vistaTransporte.txtCodAuto.setText("");
                    vistaTransporte.txtCostoP.setText("");
                    vistaTransporte.txtNombreDuenio.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, """
                                                        Error
                                                        Los datos no han sido agregados exitosamente""");
                }
            }
        });

        this.vistaTransporte.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SerializadoraGen.serializar("vehiculos.txt", modeloVehiculo);
                vistaTransporte.dispose();
            }
        });
        

        this.vistaTransporte.btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (modeloVehiculo.eliminarVehiculo(JOptionPane.showInputDialog("Ingrese el codigo del auto\n"))) {
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
    }

    private void limpiarControles() {
        String[] cabecera = modeloVehiculo.getCabecera();
        String[][] datos = modeloVehiculo.getVehiculo();
        DefaultTableModel modeloTabla = new DefaultTableModel(datos, cabecera);
        vistaTransporte.tablaTransporte.setModel(modeloTabla);
    }

    public void iniciarRegistroTransporte() {
        this.vistaTransporte.setVisible(true);
        this.vistaTransporte.setLocationRelativeTo(null);
        limpiarControles();
    }
}
