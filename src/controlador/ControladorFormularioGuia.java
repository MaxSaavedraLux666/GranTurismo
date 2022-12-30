/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Guia;
import modelo.GuiaArreglo;
import vista.fmrRegistroGuia;

/**
 *
 * @author User
 */
public class ControladorFormularioGuia {
    fmrRegistroGuia vistaGuia;
    GuiaArreglo modelo;

    public ControladorFormularioGuia(fmrRegistroGuia vistaGuia, GuiaArreglo modelo) {
        this.vistaGuia = vistaGuia;
        this.modelo = modelo;
        this.vistaGuia.btnAgregarGuia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Guia guia = new Guia(
                        vistaGuia.txtFieldNombreGuia.getText(),
                        vistaGuia.txtFieldDNIGuia.getText(),
                        Float.parseFloat(vistaGuia.txtFieldSalarioGuia.getText()),
                        vistaGuia.txtFieldIdiomaGuia.getText());
                if (modelo.agregarGuia(guia)) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido agregados exitosamente");
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
                vistaGuia.dispose();
            }
  
        });
        
        
    }
    
    public void limpiarControles(){
        String cabecera[]=modelo.getCabecera();
        String datos[][]=modelo.getGuia();
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
