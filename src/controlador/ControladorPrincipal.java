/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import vista.*;

/**
 *
 * @author User
 */
public class ControladorPrincipal {
    Principal vista;

    public ControladorPrincipal(Principal vista) {
        this.vista = vista;

        this.vista.btn_Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
        );

        this.vista.btn_Paquete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //paquete
            }
        }
        );
        
        this.vista.btn_Reserva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Reserva
            }
        }
        );
        
        this.vista.btn_Tour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Tour
            }
        }
        );
        
        this.vista.btn_Trabajador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Trabajador
            }
        }
        );
    }

    public void iniciar() {
        this.vista.setVisible(true);

    }
}
