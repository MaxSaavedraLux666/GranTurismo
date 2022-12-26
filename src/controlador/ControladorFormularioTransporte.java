/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.VehiculoArreglo;
import vista.fmrRegistroTransporte;

/**
 *
 * @author User
 */
public class ControladorFormularioTransporte {
    
    fmrRegistroTransporte vistaTransporte;
    VehiculoArreglo modeloVehiculo;

    public ControladorFormularioTransporte(fmrRegistroTransporte vistaTransporte, VehiculoArreglo modeloVehiculo) {
        this.vistaTransporte = vistaTransporte;
        this.modeloVehiculo = modeloVehiculo;
        
        this.vistaTransporte.btnAceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        this.vistaTransporte.btnRegresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaTransporte.dispose();
            }
        });
    }
    
    public void iniciarReserva(){
        this.vistaTransporte.setVisible(true);
        this.vistaTransporte.setLocationRelativeTo(null);
    }
}
