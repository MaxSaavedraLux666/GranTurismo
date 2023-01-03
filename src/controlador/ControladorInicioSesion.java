/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.GuiaArreglo;
import modelo.PersonaArreglo;
import modelo.TourArreglo;
import modelo.VehiculoArreglo;
import modelo.VentaArreglo;
import vista.fmrInicioSesion;
import vista.fmrTrabajador;

/**
 *
 * @author User
 */
public class ControladorInicioSesion {

    fmrInicioSesion vistaInicioSesion;
    PersonaArreglo modeloPersona;
    TourArreglo modeloTour;
    VehiculoArreglo modeloVehiculo;
    GuiaArreglo modeloGuia;
    VentaArreglo modeloVenta;

    public ControladorInicioSesion(fmrInicioSesion vistaInicioSesion, PersonaArreglo modeloPersona,
            TourArreglo modeloTour, VehiculoArreglo modeloVehiculo, GuiaArreglo modeloGuia,
            VentaArreglo modeloVenta) {

        this.vistaInicioSesion = vistaInicioSesion;
        this.modeloPersona = modeloPersona;
        this.modeloTour = modeloTour;
        this.modeloVenta = modeloVenta;
        this.modeloGuia = modeloGuia;
        this.modeloVehiculo = modeloVehiculo;

        this.vistaInicioSesion.btnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String user = vistaInicioSesion.txtUserName.getText();
                String pass = vistaInicioSesion.txtPassword.getText();

                if (modeloPersona.verificarTrabajador(user, pass)) {
                    fmrTrabajador vistTrabajador = new fmrTrabajador();
                    ControladorTrabajador controlador = new ControladorTrabajador(vistTrabajador,
                            modeloTour, modeloPersona, modeloVehiculo, modeloGuia, modeloVenta);
                    controlador.iniciarTrabajador();
                    vistaInicioSesion.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario o contraseña son incorrectos");
                }
            }
        });

        this.vistaInicioSesion.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaInicioSesion.dispose();
            }
        });
    }

    public void inicioSesion() {
        this.vistaInicioSesion.setVisible(true);
        this.vistaInicioSesion.setLocationRelativeTo(null);
    }
}
