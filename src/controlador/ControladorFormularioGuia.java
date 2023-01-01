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
import modelo.Guia;
import modelo.GuiaArreglo;
import vista.fmrRegistroGuia;

/**
 *
 * @author User
 */
public class ControladorFormularioGuia {
    fmrRegistroGuia vistaGuia;
    GuiaArreglo modeloGuia;

    public ControladorFormularioGuia(fmrRegistroGuia vistaGuia, GuiaArreglo modeloGuia) {
        this.vistaGuia = vistaGuia;
        this.modeloGuia = modeloGuia;
        this.vistaGuia.btnAgregarGuia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Guia guia = new Guia(
                        vistaGuia.txtFieldNombreGuia.getText(),
                        vistaGuia.txtFieldDNIGuia.getText(),
                        Float.parseFloat(vistaGuia.txtFieldSalarioGuia.getText()),
                        vistaGuia.txtFieldIdiomaGuia.getText());
                if (modeloGuia.agregarGuia(guia)) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido agregados exitosamente");
                    limpiarControles();
                    vistaGuia.txtFieldNombreGuia.setText("");
                    vistaGuia.txtFieldDNIGuia.setText("");
                    vistaGuia.txtFieldSalarioGuia.setText("");
                    vistaGuia.txtFieldIdiomaGuia.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido agregados exitosamente");
                
                }
            }
        });
        
        this.vistaGuia.btnRegresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                SerializadoraGen.serializar("guias.txt", modeloGuia);
                vistaGuia.dispose();
            }
  
        });
        
        this.vistaGuia.btnBuscarGuia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modeloGuia.buscarGuia(vistaGuia.txtFieldBuscarGuia.getText());
            }
        });

        this.vistaGuia.btnEliminarGuia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (modeloGuia.eliminarGuia(vistaGuia.txtFieldBuscarGuia.getText())) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido eliminado exitosamente");
                    vistaGuia.txtFieldBuscarGuia.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido eliminado exitosamente");
                }
            }
        });
        
    }
    
    public void limpiarControles(){
        String cabecera[]=modeloGuia.getCabecera();
        String datos[][]=modeloGuia.getGuia();
        DefaultTableModel modeloTabla = new DefaultTableModel(datos, cabecera);
        vistaGuia.tblGuia.setModel(modeloTabla);
    }
    
    public void iniciarGuia(){
        this.vistaGuia.setVisible(true);
        this.vistaGuia.setResizable(false);
        this.vistaGuia.setLocationRelativeTo(null);
        limpiarControles();
    }
}
