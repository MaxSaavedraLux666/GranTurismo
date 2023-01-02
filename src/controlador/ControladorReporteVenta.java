/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.VentaArreglo;
import vista.fmrReporteVenta;

/**
 *
 * @author User
 */
public class ControladorReporteVenta {
    
    fmrReporteVenta vistaReporte;
    VentaArreglo modeloVenta;

    public ControladorReporteVenta(VentaArreglo modeloVenta) {
        this.modeloVenta = modeloVenta;
    }

    public ControladorReporteVenta(fmrReporteVenta vistaReporte, VentaArreglo modeloVenta) {
        this.vistaReporte = vistaReporte;
        this.modeloVenta = modeloVenta;
        
        this.vistaReporte.btnRegresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaReporte.dispose();
            }
        });
    }
    
    public void total(){
        this.vistaReporte.labelTotal.setText(String.valueOf(modeloVenta.calcularTotalVentas(modeloVenta.getVentas())) + " $");
    }
    
    public void limpiarControles() {
        String[] cabecera = modeloVenta.getCabecera();
        String[][] datos = modeloVenta.getVenta();
        DefaultTableModel modeloTabla = new DefaultTableModel(datos, cabecera);
        vistaReporte.tablaReporte.setModel(modeloTabla);
    }
    
    public void iniciarReporte(){
        this.vistaReporte.setVisible(true);
        this.vistaReporte.setLocationRelativeTo(null);
        total();
        limpiarControles();
    }
}
