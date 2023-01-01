/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.table.DefaultTableModel;
import modelo.Guia;
import modelo.GuiaArreglo;
import modelo.Vehiculo;
import vista.fmrGuia;

/**
 *
 * @author User
 */
public class ControladorGuia{
    
    fmrGuia vista;
    GuiaArreglo modeloGuia;
    Guia guiaElegido;

    public ControladorGuia(fmrGuia vista, GuiaArreglo modeloGuia) {
        this.vista = vista;
        this.modeloGuia = modeloGuia;
        
         this.vista.btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiaElegido = modeloGuia.buscarGuia(vista.txtElegir.getText());
            }
        });

        this.vista.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
            }
        });
        
    }
    private void limpiarControles() {
        String[] cabecera = modeloGuia.getCabecera();
        String[][] datos = modeloGuia.getGuia();
        DefaultTableModel modeloTabla = new DefaultTableModel(datos, cabecera);
        vista.tablaGuia.setModel(modeloTabla);
    }
    
    public Guia enviarGuia(){
        return guiaElegido;
    }
    public void iniciarGuia(){
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        limpiarControles();
    }
}
