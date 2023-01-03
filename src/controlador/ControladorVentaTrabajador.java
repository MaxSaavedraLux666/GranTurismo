/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import libreria.SerializadoraGen;
import modelo.Guia;
import modelo.Persona;
import modelo.PersonaArreglo;
import modelo.Tour;
import vista.fmrBoleta;
import vista.fmrVentaTrabajador;

/**
 *
 * @author User
 */
public class ControladorVentaTrabajador {
    
    fmrVentaTrabajador vistaVentaTrabajador;
    Persona clienteElegido;
    Tour tourElegido;
    String fecha;
    Guia guiaElegido;
    PersonaArreglo modeloPersona;
    Date fechaVenta;
    
    public ControladorVentaTrabajador(fmrVentaTrabajador vistaVentaTrabajador,
            Persona clienteElegido, Tour tourElegido, String fecha,
            Guia guiaElegido, PersonaArreglo modeloPersona, Date fechaVenta) {
        this.vistaVentaTrabajador = vistaVentaTrabajador;
        this.clienteElegido = clienteElegido;
        this.tourElegido = tourElegido;
        this.fecha = fecha;
        this.guiaElegido = guiaElegido;
        this.modeloPersona = modeloPersona;
        this.fechaVenta = fechaVenta;
        
        this.vistaVentaTrabajador.btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String user = vistaVentaTrabajador.txtUserName.getText();
                String pass = vistaVentaTrabajador.txtPassword.getText();
                
                if (modeloPersona.verificarTrabajador(user, pass)) {
                    
                    modeloPersona.enviarTrabajador(user, pass).sumarVentas(1);
                    fmrBoleta vistaBoleta = new fmrBoleta();
                    ControladorBoleta controlador = new ControladorBoleta(vistaBoleta, clienteElegido,
                            tourElegido, fecha, guiaElegido, modeloPersona, fechaVenta);
                    controlador.iniciarBoleta();
                    SerializadoraGen.serializar("personas.txt", modeloPersona);
                    vistaVentaTrabajador.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario o contraseña son incorrectos");
                }
            }
        });
        
        this.vistaVentaTrabajador.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaVentaTrabajador.dispose();
            }
        });
    }
    
    public void inicioVentaTrabajador() {
        this.vistaVentaTrabajador.setVisible(true);
        this.vistaVentaTrabajador.setLocationRelativeTo(null);
    }
}
