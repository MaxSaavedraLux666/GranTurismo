/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.chrono.ThaiBuddhistEra;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.PersonaArreglo;
import vista.fmrCliente;
import vista.fmrMantenimientoCliente;

/**
 *
 * @author Sebastian
 */
public class ControladorMC {
    fmrMantenimientoCliente vistaMC;
    PersonaArreglo modelo;

    public ControladorMC(fmrMantenimientoCliente vistaMC, PersonaArreglo modelo) {
        this.vistaMC = vistaMC;
        this.modelo = modelo;
        this.vistaMC.btnSalirMC.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaMC.dispose();
            }  
        });
        this.vistaMC.btnBuscarMC.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.buscarPersona(vistaMC.txtFieldBuscar.getText());
                
            } 
        });
        this.vistaMC.btnEliminarMC.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (modelo.eliminarCliente(vistaMC.txtFieldBuscar.getText())) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido eliminado exitosamente");
                    vistaMC.txtFieldBuscar.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido eliminado exitosamente");
                }
             
            } 
        });
    }
    
    public void limpiarControles() {
        String[] cabecera = modelo.getCabecera();
        String[][] datos = modelo.getClientes();
        DefaultTableModel modeloTabla = new DefaultTableModel(datos, cabecera);
        vistaMC.tblMC.setModel(modeloTabla);
    }
    
    
    
    public void iniciarControladorMC(){
        this.vistaMC.setVisible(true);
        this.vistaMC.setResizable(false);
        this.vistaMC.setLocationRelativeTo(null);
        limpiarControles();
    }
 
}
