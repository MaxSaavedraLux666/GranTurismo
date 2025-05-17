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
import modelo.PersonaArreglo;
import vista.fmrReportePlanilla;

/**
 *
 * @author User
 */
public class ControladorReportePlanilla {

    fmrReportePlanilla vistaReportePlanilla;
    PersonaArreglo modeloPersona;

    public ControladorReportePlanilla(fmrReportePlanilla vistaReportePlanilla, PersonaArreglo modeloPersona) {
        this.vistaReportePlanilla = vistaReportePlanilla;
        this.modeloPersona = modeloPersona;

        this.vistaReportePlanilla.btnRegresar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaReportePlanilla.dispose();
            }
        });

        this.vistaReportePlanilla.btnImprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Crear un componente de impresión para la tabla
                MessageFormat encabezado = new MessageFormat("Reporte de ventas");
                MessageFormat piePagina = new MessageFormat("Página {0,number,integer}");
                try {
                    // Imprimir la tabla usando JTable.PrintMode.FIT_WIDTH
                    vistaReportePlanilla.tablaReportePlanilla.print(JTable.PrintMode.FIT_WIDTH, encabezado, piePagina);
                } catch (PrinterException ex) {
                    JOptionPane.showMessageDialog(null, "Error de impresión" + ex.toString());
                    ex.printStackTrace();
                }
            }
        });
    }
    
    public void limpiarControles() {
        String[] cabecera = modeloPersona.getCabeceraPlanilla();
        String[][] datos = modeloPersona.getPlanilla();
        DefaultTableModel modeloTabla = new DefaultTableModel(datos, cabecera);
        vistaReportePlanilla.tablaReportePlanilla.setModel(modeloTabla);
    }
    
    public void sueldoBruto(){
        DecimalFormat df = new DecimalFormat("0.000");
        String formattedNumber = df.format(modeloPersona.obtenerTotalSueldos());
        this.vistaReportePlanilla.labelBruto.setText(String.valueOf(formattedNumber + " $"));
    }
    
    public void sueldoNeto(){
        DecimalFormat df = new DecimalFormat("0.000");
        String formattedNumber = df.format(modeloPersona.obtenerTotalSueldosNeto());
        this.vistaReportePlanilla.labelNeto.setText(String.valueOf(formattedNumber + " $"));
    }

    public void iniciarReportePlanilla() {
        this.vistaReportePlanilla.setVisible(true);
        this.vistaReportePlanilla.setLocationRelativeTo(null);
        vistaReportePlanilla.labelTrabajadores.setText(String.valueOf(modeloPersona.getTrabajadores().length) + " trabajadores");
        vistaReportePlanilla.labelCantVentas.setText(String.valueOf(modeloPersona.obtenerTotalVentas()) + " ventas");
        sueldoBruto();
        sueldoNeto();
        limpiarControles();
    }
}
