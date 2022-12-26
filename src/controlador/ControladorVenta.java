/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.fmrVenta;

/**
 *
 * @author User
 */
public class ControladorVenta {
    
    fmrVenta vistVenta;

    public ControladorVenta(fmrVenta vistVenta) {
        this.vistVenta = vistVenta;
        
        this.vistVenta.btnAceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
            }
        });
        
        this.vistVenta.btnCancelar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                vistVenta.dispose();
                
            }
        });
    }
    
    public void iniciarVenta(){
        this.vistVenta.setVisible(true);
    }
}
