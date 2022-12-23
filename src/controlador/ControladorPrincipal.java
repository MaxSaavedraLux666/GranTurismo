/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelo.TourArreglo;

import vista.*;

/**
 *
 * @author User
 */
public class ControladorPrincipal {

    fmrPrincipal vista;
    TourArreglo modeloArreglo;
    private boolean estado = true;

    public ControladorPrincipal(fmrPrincipal vista, TourArreglo modeloArreglo) {
        this.vista = vista;
        this.modeloArreglo = modeloArreglo;

        this.vista.btn_Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
        );

        this.vista.btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //siguiente
                if (estado) {
                    der(vista.panelDerecho, 1, 2, 400);
                    estado = false;
                } else {
                    izq(vista.panelDerecho, 1, 2, 40);
                    estado = true;
                }
            }
        }
        );

        this.vista.btnReserva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Reserva
            }
        }
        );

        this.vista.btnTour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Tour
                fmrTour vistaTour = new fmrTour();
                ControladorTour controlTour = new ControladorTour(modeloArreglo, vistaTour);
                controlTour.iniciarTour();
            }
        }
        );

        this.vista.btnTrabajador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Trabajador
                fmrTrabajador vistTrabajador = new fmrTrabajador();
                ControladorTrabajador controlador = new ControladorTrabajador(vistTrabajador);
                controlador.iniciarTrabajador();
            }
        }
        );
    }

    public void izq(JComponent componente, int milisegundo, int saltos, int parar) {
        (new Thread() {
            @Override
            public void run() {
                for (int i = componente.getWidth(); i >= parar; i -= saltos) {
                    try {
                        Thread.sleep(milisegundo);
                        componente.setPreferredSize(new Dimension(i, componente.getHeight()));
                        SwingUtilities.updateComponentTreeUI(componente);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error\n"
                                + "Thread interrumpido" + e.toString());
                    }
                }
            }
        }).start();
    }

    public void der(JComponent componente, int milisegundo, int saltos, int parar) {
        (new Thread() {
            @Override
            public void run() {
                for (int i = componente.getWidth(); i <= parar; i += saltos) {
                    try {
                        Thread.sleep(milisegundo);
                        componente.setPreferredSize(new Dimension(i, componente.getHeight()));
                        SwingUtilities.updateComponentTreeUI(componente);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error\n"
                                + "Thread interrumpido");
                    }
                }
            }
        }).start();
    }

    public void iniciar() {
        this.vista.setVisible(true);
        this.vista.setResizable(false);
        this.vista.setLocationRelativeTo(null);
    }
}
