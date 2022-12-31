/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.Guia;
import modelo.Persona;
import modelo.Tour;
import modelo.Vehiculo;
import vista.fmrBoleta;
import vista.fmrVenta;

/**
 *
 * @author User
 */
public class ControladorVenta {
    
    fmrVenta vistVenta;
    Tour tourElegido;
    Vehiculo vehiculoElegido;
    Guia guiaElegido;
    Persona clienteElegido;

    public ControladorVenta(fmrVenta vistVenta, Tour tourElegido, Vehiculo vehiculoElegido, 
            Guia guiaElegido, Persona clienteElegido) {
        this.vistVenta = vistVenta;
        this.guiaElegido = guiaElegido;
        this.tourElegido = tourElegido;
        this.vehiculoElegido = vehiculoElegido;
        this.clienteElegido = clienteElegido;
        
        this.vistVenta.btnAceptar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fmrBoleta boleta = new fmrBoleta();
                boleta.labelNombre.setText("Max");
                boleta.labelValido.setText("4 personas");
                boleta.labelCosto.setText("16.9");
                boleta.setVisible(true);
            }
        });
        
        this.vistVenta.btnCancelar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                vistVenta.dispose();   
            }
        });
    }
    
    
    public void detallesVenta(){
        this.vistVenta.labdelDestino.setText(tourElegido.getNombrePaquete());
        this.vistVenta.labelNCliente.setText(clienteElegido.getNombre());
        this.vistVenta.labelDocumento.setText(clienteElegido.getDni());
        this.vistVenta.labelCorreo.setText("");
        this.vistVenta.labelTelefono.setText(clienteElegido.getDni());
        this.vistVenta.labelFechaI.setText("19 - 03 - 23");
        this.vistVenta.labelFechaV.setText("19 - 03 - 23");
        this.vistVenta.labelFechaCompra.setText(fechaActual());
        this.vistVenta.labelCodReserva.setText("");
        this.vistVenta.labelNomAgencia.setText("");
        this.vistVenta.labelGuia.setText("");
        this.vistVenta.labCodVehiculo.setText("");
        this.vistVenta.labelCosto.setText("");
    }
    
    public String fechaActual(){
        Date fecha=new Date();
        SimpleDateFormat formatoFecha= new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
    
    public void iniciarVenta(){
        this.vistVenta.setVisible(true);
        this.vistVenta.setLocationRelativeTo(null);
        detallesVenta();
    }
}
