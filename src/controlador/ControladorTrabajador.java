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
import vista.fmrMantenimientoCliente;
import vista.fmrRegistrarTour;
import vista.fmrRegistroTransporte;
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

    public ControladorTrabajador(fmrTrabajador vistaTrabajador, TourArreglo modeloTour,
            PersonaArreglo modeloPersona, VehiculoArreglo modeloVehiculo, GuiaArreglo modeloGuia) {
        this.vistaTrabajador = vistaTrabajador;
        this.modeloTour = modeloTour;
        this.modeloPersona = modeloPersona;
        this.modeloGuia = modeloGuia;

        this.vistaTrabajador.btnRegistrarTour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrRegistrarTour vistaRegistro = new fmrRegistrarTour();
                ControladorFormularioTour controlador = new ControladorFormularioTour(vistaRegistro, modeloTour);
                controlador.iniciarRegistroTour();
            }
        });

        this.vistaTrabajador.btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaTrabajador.dispose();
            }
        });
        
        this.vistaTrabajador.btnModificarCliente.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrMantenimientoCliente vistaMC= new fmrMantenimientoCliente();
                ControladorMC controladorMC= new ControladorMC(vistaMC, modeloPersona);
                controladorMC.iniciarControladorMC();
                
            }     
            
        });

        
        this.vistaTrabajador.btnTransporte.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrRegistroTransporte vistaTransporte = new fmrRegistroTransporte();
                ControladorFormularioTransporte controlador = new ControladorFormularioTransporte(vistaTransporte, modeloVehiculo);
                
            }
        });

    }

    public void iniciarTrabajador() {
        this.vistaTrabajador.setVisible(true);
        this.vistaTrabajador.setLocationRelativeTo(null);
    }
}
