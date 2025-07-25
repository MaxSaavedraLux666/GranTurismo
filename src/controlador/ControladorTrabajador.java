/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.GuiaArreglo;
import modelo.PersonaArreglo;
import modelo.TourArreglo;
import modelo.VehiculoArreglo;
import modelo.VentaArreglo;
import vista.fmrMantenimientoCliente;
import vista.fmrRegistrarTour;
import vista.fmrRegistroGuia;
import vista.fmrRegistroTrabajador;
import vista.fmrRegistroTransporte;
import vista.fmrReportePlanilla;
import vista.fmrReporteVenta;
import vista.fmrTrabajador;

/**
 *
 * @author User
 */
public class ControladorTrabajador {

    fmrTrabajador vistaTrabajador;
    TourArreglo modeloTour;
    PersonaArreglo modeloPersona;
    VehiculoArreglo modeloVehiculo;
    GuiaArreglo modeloGuia;
    VentaArreglo modeloVenta;

    public ControladorTrabajador(fmrTrabajador vistaTrabajador, TourArreglo modeloTour,
            PersonaArreglo modeloPersona, VehiculoArreglo modeloVehiculo, GuiaArreglo modeloGuia, VentaArreglo modeloVenta) {
        this.vistaTrabajador = vistaTrabajador;
        this.modeloTour = modeloTour;
        this.modeloPersona = modeloPersona;
        this.modeloGuia = modeloGuia;
        this.modeloVenta = modeloVenta;

        this.vistaTrabajador.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaTrabajador.dispose();
            }
        });

        this.vistaTrabajador.btnModificarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrMantenimientoCliente vistaMC = new fmrMantenimientoCliente();
                ControladorMC controladorMC = new ControladorMC(vistaMC, modeloPersona);
                controladorMC.iniciarControladorMC();
            }

        });

        this.vistaTrabajador.btnRegistrarTour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrRegistrarTour vistaTour = new fmrRegistrarTour();
                ControladorFormularioTour controlador = new ControladorFormularioTour(vistaTour, modeloTour);
                controlador.iniciarRegistroTour();
            }
        });

        this.vistaTrabajador.btnTransporte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrRegistroTransporte vistaTransporte = new fmrRegistroTransporte();
                ControladorFormularioTransporte controlador = new ControladorFormularioTransporte(vistaTransporte, modeloVehiculo);
                controlador.iniciarRegistroTransporte();
            }
        });

        this.vistaTrabajador.btnGuia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrRegistroGuia vistaGuia = new fmrRegistroGuia();
                ControladorFormularioGuia controladorGuia = new ControladorFormularioGuia(vistaGuia, modeloGuia);
                controladorGuia.iniciarGuia();
            }
        });

        this.vistaTrabajador.btnReporte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrReporteVenta vistaReporte = new fmrReporteVenta();
                ControladorReporteVenta controlador = new ControladorReporteVenta(vistaReporte, modeloVenta);
                controlador.iniciarReporte();
            }
        });

        this.vistaTrabajador.btnReporteTrabajadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrReportePlanilla vistaPlanilla = new fmrReportePlanilla();
                ControladorReportePlanilla controlador = new ControladorReportePlanilla(vistaPlanilla, modeloPersona);
                controlador.iniciarReportePlanilla();
            }
        });

        this.vistaTrabajador.btnRegistroTrabajadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrRegistroTrabajador vistaRegTrab = new fmrRegistroTrabajador();
                ControladorRegistroTrabajador controlador = new ControladorRegistroTrabajador(vistaRegTrab, modeloPersona);
                controlador.iniciarRegistroTrabajador();
            }
        });
    }

    public void iniciarTrabajador() {
        this.vistaTrabajador.setVisible(true);
        this.vistaTrabajador.setLocationRelativeTo(null);
    }
}
