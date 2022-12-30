/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Vehiculo;
import modelo.VehiculoArreglo;
import vista.fmrTransporte;

/**
 *
 * @author User
 */
public class ControladorTransporte {

    fmrTransporte vistaTransporte;
    VehiculoArreglo modeloVehiculo;
    Vehiculo vehiculoElegido;

    public ControladorTransporte(fmrTransporte vistaTransporte, VehiculoArreglo modeloVehiculo) {
        this.vistaTransporte = vistaTransporte;
        this.modeloVehiculo = modeloVehiculo;

        this.vistaTransporte.btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vehiculoElegido = modeloVehiculo.buscarVehiculo(vistaTransporte.txtElegir.getText());
            }
        });

        this.vistaTransporte.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaTransporte.dispose();
            }
        });
    }
    
    private void limpiarControles() {
        String[] cabecera = modeloVehiculo.getCabecera();
        String[][] datos = modeloVehiculo.getVehiculo();
        DefaultTableModel modeloTabla = new DefaultTableModel(datos, cabecera);
        vistaTransporte.tablaAutos.setModel(modeloTabla);
    }
    
    public Vehiculo enviarVehiculo(){
        return vehiculoElegido;
    }

    public void iniciarTransporte() {
        this.vistaTransporte.setVisible(true);
        limpiarControles();
    }
}
