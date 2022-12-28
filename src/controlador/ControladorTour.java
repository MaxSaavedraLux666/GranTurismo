/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.PersonaArreglo;
import modelo.Tour;
import modelo.TourArreglo;
import modelo.VehiculoArreglo;
import vista.fmrBoleta;
import vista.fmrPrincipal;
import vista.fmrReserva;
import vista.fmrTour;

/**
 *
 * @author User
 */
public class ControladorTour {

    fmrTour vistaTour;
    ControladorPrincipal controlPricipal;
    TourArreglo modeloTour;
    VehiculoArreglo modeloVehiculo;
    PersonaArreglo modeloPersona;

    public ControladorTour(TourArreglo modeloTour, fmrTour vistaTour, VehiculoArreglo modeloVehiculo, PersonaArreglo modeloPersona) {
        this.vistaTour = vistaTour;
        this.modeloTour = modeloTour;
        this.modeloVehiculo = modeloVehiculo;
        this.modeloPersona = modeloPersona;

        this.vistaTour.btn_BuscarTour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        this.vistaTour.btn_Informacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                fmrBoleta boleta = new fmrBoleta();
                boleta.labelNombre.setText("Max");
                boleta.labelValido.setText("4 personas");
                boleta.labelCosto.setText("16.9");
                boleta.setVisible(true);
            }
        });

        this.vistaTour.btn_Reservar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                fmrReserva vistaReserva = new fmrReserva();
                ControladorReserva controlador = new ControladorReserva(vistaReserva, modeloTour, modeloVehiculo, modeloPersona);
                controlador.iniciarReserva();

            }
        });

        this.vistaTour.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaTour.dispose();
            }

        });
    }

    public void limpiarControles() {
        String[] cabecera = modeloTour.getCabecera();
        String[][] datos = modeloTour.getTour();
        DefaultTableModel modeloTabla = new DefaultTableModel(datos, cabecera);
        vistaTour.tablaTours.setModel(modeloTabla);
    }

    public void iniciarTour() {
        this.vistaTour.setVisible(true);
        this.vistaTour.setResizable(false);
        this.vistaTour.setLocationRelativeTo(null);
        limpiarControles();
    }
}
