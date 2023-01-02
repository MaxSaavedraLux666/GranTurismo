/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Venta;
import modelo.VentaArreglo;
import vista.fmrReporteVenta;

/**
 *
 * @author User
 */
public class ControladorReporteVenta {

    fmrReporteVenta vistaReporte;
    VentaArreglo modeloVenta;

    public ControladorReporteVenta(fmrReporteVenta vistaReporte, VentaArreglo modeloVenta) {
        this.vistaReporte = vistaReporte;
        this.modeloVenta = modeloVenta;

        this.vistaReporte.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaReporte.dispose();
            }
        });

        this.vistaReporte.btnImprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Crear un componente de impresión para la tabla
                MessageFormat encabezado = new MessageFormat("Reporte de ventas");
                MessageFormat piePagina = new MessageFormat("Página {0,number,integer}");
                try {
                    // Imprimir la tabla usando JTable.PrintMode.FIT_WIDTH
                    vistaReporte.tablaReporte.print(JTable.PrintMode.FIT_WIDTH, encabezado, piePagina);
                } catch (PrinterException ex) {
                    JOptionPane.showMessageDialog(null, "Error de impresión" + ex.toString());

                    ex.printStackTrace();
                }
            }
        });
    }

    public void total() {
        DecimalFormat df = new DecimalFormat("0.000");
        String formattedNumber = df.format(modeloVenta.calcularTotalVentas());
        this.vistaReporte.labelTotal.setText(String.valueOf(formattedNumber + " $"));
    }

    public void limpiarControles() {
        String[] cabecera = modeloVenta.getCabecera();
        String[][] datos = modeloVenta.getVenta();
        DefaultTableModel modeloTabla = new DefaultTableModel(datos, cabecera);
        vistaReporte.tablaReporte.setModel(modeloTabla);
    }

    public void iniciarReporte() {
        this.vistaReporte.setVisible(true);
        this.vistaReporte.setLocationRelativeTo(null);
        total();
        limpiarControles();
    }
}
