/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Guia;
import modelo.Persona;
import modelo.PersonaArreglo;
import modelo.Tour;
import vista.fmrBoleta;

/**
 *
 * @author User
 */
public class ControladorBoleta {

    fmrBoleta vistaBoleta;
    Persona clienteElegido;
    Tour tourElegido;
    String fecha;
    Guia guiaElegido;
    PersonaArreglo modeloPersona;
    Date fechaVenta;

    public ControladorBoleta(fmrBoleta vistaBoleta, Persona clienteElegido, Tour tourElegido,
            String fecha, Guia guiaElegido, PersonaArreglo modeloPersona, Date fechaVenta) {
        this.vistaBoleta = vistaBoleta;
        this.clienteElegido = clienteElegido;
        this.tourElegido = tourElegido;
        this.guiaElegido = guiaElegido;
        this.modeloPersona = modeloPersona;
        this.fechaVenta = fechaVenta;
        this.fecha = fecha;
        
        this.vistaBoleta.btnNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaBoleta.dispose();
            }
        });

        this.vistaBoleta.btnImprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrinterJob job = PrinterJob.getPrinterJob();
                if (job.printDialog()) {
                    try {
                        job.setPrintable(new Printable() {
                            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                                if (pageIndex > 0) {
                                    return NO_SUCH_PAGE;
                                }
                                Graphics2D g2d = (Graphics2D) graphics;
                                g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                                vistaBoleta.printAll(graphics);
                                return PAGE_EXISTS;
                            }
                        });
                        job.print();
                    } catch (PrinterException ex) {
                        // manejo del error
                        JOptionPane.showMessageDialog(null, "Error al imprimir: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }

    public void detalles() {
        vistaBoleta.labelCosto.setText(String.valueOf(tourElegido.getPrecioTour()) + " $");
        vistaBoleta.labelFechaTour.setText(fecha);
        vistaBoleta.labelGuiaNombre.setText(guiaElegido.getNombre());
        vistaBoleta.labelNombre.setText(clienteElegido.getNombre());
        vistaBoleta.labelDoc.setText(clienteElegido.getDni());
        vistaBoleta.labelValido.setText("1 persona");
        vistaBoleta.labelViaje.setText(tourElegido.getNombrePaquete());
        vistaBoleta.labelCodReserva.setText(modeloPersona.enviarCliente((Cliente) clienteElegido).getCodReserva());
    }

    public void iniciarBoleta() {
        this.vistaBoleta.setVisible(true);
        this.vistaBoleta.setLocationRelativeTo(null);
        detalles();
    }
}
