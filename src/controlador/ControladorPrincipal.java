/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelo.GuiaArreglo;
import modelo.ItinerarioArreglo;
import modelo.PersonaArreglo;
import modelo.TourArreglo;
import modelo.VehiculoArreglo;

import vista.*;

/**
 *
 * @author User
 */
public class ControladorPrincipal {

    fmrPrincipal vista;
    TourArreglo modeloTour;
    PersonaArreglo modeloPersona;
    GuiaArreglo modeloGuia;
    VehiculoArreglo modeloVehiculo;

    private boolean estado = true;

    public ControladorPrincipal(fmrPrincipal vista, TourArreglo modeloTour,
            PersonaArreglo modeloPersona, GuiaArreglo modeloGuia, VehiculoArreglo modeloVehiculo) {
        this.vista = vista;
        this.modeloTour = modeloTour;
        this.modeloPersona = modeloPersona;
        this.modeloGuia = modeloGuia;
        this.modeloVehiculo = modeloVehiculo;

        this.vista.btn_Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.vista.btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //siguiente
                if (estado) {
                    der(vista.panelDerecho, 1, 2, 620);
                    estado = false;
                } else {
                    izq(vista.panelDerecho, 1, 2, 10);
                    estado = true;
                }
            }
        });

        this.vista.btnTour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Tour
                fmrTour vistaTour = new fmrTour();
                ControladorTour controlTour = new ControladorTour(modeloTour, vistaTour, modeloVehiculo, modeloPersona);
                controlTour.iniciarTour();
            }
        });

        this.vista.btnTrabajador.addActionListener(new ActionListener() { //correcto
            @Override
            public void actionPerformed(ActionEvent e) {
                //Trabajador
                fmrTrabajador vistTrabajador = new fmrTrabajador();
                ControladorTrabajador controlador = new ControladorTrabajador(vistTrabajador,
                        modeloTour, modeloPersona, modeloVehiculo, modeloGuia);
                controlador.iniciarTrabajador();
            }
        });

        this.vista.btnBusqueda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (modeloTour.buscarTour(vista.txtFieldBusqueda.getText()) != null) {
                    fmrBusqueda vistaBusqueda = new fmrBusqueda();
                    ControladorBusqueda controlador = new ControladorBusqueda(vistaBusqueda, modeloTour, modeloVehiculo, 
                            modeloPersona, modeloTour.buscarTour(vista.txtFieldBusqueda.getText()));
                    controlador.iniciarBusqueda();
                } else {
                    JOptionPane.showMessageDialog(null, "El tour no se encuentar"
                            + "\nIngrese correctamente el código");
                }
            }
        });

        this.vista.btnNosotros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Somos una empresa de tecnologías de información,  enfocado"
                        + "\nen brindar asesoría y recursos especializados en las plataformas"
                        + "\ntecnológicas acorde a las necesidades de nuestros clientes.");
            }
        });

        this.vista.btnRecomendaciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Ten a la mano su carnet de vacunación"
                        + "\nReserve su tour con días de anticipación"
                        + "\nElija fechas célebres para una mejor experiencia");
            }
        });

        this.vista.btnConsultas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pida el libro de reclamaciones a consultas_Cusco_Tours@gmail.com"
                        + "\nComuníquese a +51 975 343 567 para más consultas"
                        + "\nLlamar a 679 579");
            }
        });

        this.vista.btnNotas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Puede pagar en efectivo o a través de su tarjeta de débito o crédito"
                        + "\nPuede escoger un guía y un vehículo para su traslado"
                        + "\nDebe estar sobrio para el tour");
            }
        });
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

    //Pantalla principal
    public void detalles() {
        //Contáctos Principales
        this.vista.direccion.setText("Miraflores, Calle Los Naranjos 1094");
        this.vista.telefono1.setText("+51 - 996644");
        this.vista.telefono2.setText("+51 - 662233");
        this.vista.correo.setText("cusco_tours@gmail.com");
        //

        //Redes sociales
        this.vista.whatsapp.setText("+51 987 654 321");
        this.vista.facebook.setText("Cusco Tours");
        this.vista.instagram.setText("@Cusco_Tours");
        this.vista.twitter.setText("@Cusco_Tours");
        //
    }
    //

    public void llenarLista() {
        DefaultListModel modelo = new DefaultListModel();
        modelo.removeAllElements();
        for (int i = 0; i < modeloTour.getTours().length; i++) {
            modelo.addElement(modeloTour.getTours()[i]);
        }
        vista.listaPaquete.setModel(modelo);
    }

    public void iniciar() {
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        detalles();
        llenarLista();
    }
}
