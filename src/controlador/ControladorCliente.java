/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Guia;
import modelo.GuiaArreglo;
import modelo.Persona;
import modelo.PersonaArreglo;
import modelo.Tour;
import modelo.TourArreglo;
import modelo.Vehiculo;
import modelo.VehiculoArreglo;
import vista.fmrCliente;
import vista.fmrVenta;

/**
 *
 * @author Sebastian
 */
public class ControladorCliente {

    fmrCliente vistaCliente = new fmrCliente();
    PersonaArreglo modeloPersona;
    Cliente clienteElegido;
    static int i = 0;
    String codigo;
    TourArreglo modeloTour;
    VehiculoArreglo modeloVehiculo;
    Vehiculo vehiculoElegido;
    Tour tourElegido;
    GuiaArreglo modeloGuia;
    Guia guiaElegido;

    public ControladorCliente(fmrCliente vistaCliente, PersonaArreglo modeloPersona,  TourArreglo modeloTour, 
            VehiculoArreglo modeloVehiculo, Vehiculo vehiculoElegido, Tour tourElegido, GuiaArreglo modeloGuia, Guia guiaElegido ) {
        
        this.vistaCliente = vistaCliente;
        this.modeloPersona = modeloPersona;
        this.modeloTour=modeloTour;
        this.modeloVehiculo=modeloVehiculo;
        this.vehiculoElegido=vehiculoElegido;
        this.tourElegido=tourElegido;
        this.modeloGuia=modeloGuia;
        this.guiaElegido=guiaElegido;

        this.vistaCliente.btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (i == 0) {
                    codigo = "100000";
                }
                Cliente cliente = new Cliente(codigo,
                        vistaCliente.txtFieldNombreTitular.getText(),
                        vistaCliente.txtFieldCorreoTitular.getText(),
                        vistaCliente.txtFieldTelefonoTitular.getText(),
                        vistaCliente.txtFieldDNItitular.getText(),
                        Integer.parseInt(vistaCliente.txtFieldEdadTitular.getText()));
                vistaCliente.txtFieldFecha.setText(" ");
                guiaElegido.setNombre(String.valueOf(vistaCliente.cbxGuia.getSelectedIndex()));
                modeloGuia.agregarGuia(guiaElegido);
                vehiculoElegido.setCodigoVehiculo(vistaCliente.txtFieldCodigoTransporte.getText());
                modeloVehiculo.agregar(vehiculoElegido);
                fmrVenta vistaVenta=new fmrVenta();
                ControladorVenta controladorVenta=new ControladorVenta(vistaVenta, tourElegido, vehiculoElegido, 
                guiaElegido, clienteElegido);
                controladorVenta.iniciarVenta();
                if (modeloPersona.agregar(cliente)) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido agregados exitosamente");
                    vistaCliente.txtFieldCodigoTransporte.setText("");
                    vistaCliente.txtFieldNombreTitular.setText("");
                    vistaCliente.txtFieldTelefonoTitular.setText("");
                    vistaCliente.txtFieldDNItitular.setText("");
                    vistaCliente.txtFieldEdadTitular.setText("");
                    codigo = generarCodigoReserva();
                    vistaCliente.labelCodReserva.setText(codigo);
                    //clienteElegido = modelo.buscarPersona(codigo);
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido agregados exitosamente");
                }
                i++;
                
                
            }
        });

        this.vistaCliente.btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaCliente.dispose();
            }
        });
        
    }
    
    public void rellenarGuias(){
        DefaultComboBoxModel model=new DefaultComboBoxModel();
        model.addElement(" ");
        for(Guia obj: this.modeloGuia.getGuias()){
            if(obj != null){
                model.addElement(obj);
            }
        }
        this.vistaCliente.cbxGuia.setModel(model);
        

    }
    
    public void detallesCliente() {
        vistaCliente.labelDestino.setText(tourElegido.getNombrePaquete());
        vistaCliente.labelPrecio.setText(String.valueOf(tourElegido.getPrecioTour()));

    }
    
    public void limpiarControles() {
        String[] cabecera = modeloVehiculo.getCabecera();
        String[][] datos = modeloVehiculo.getVehiculo();
        DefaultTableModel modeloTabla = new DefaultTableModel(datos, cabecera);
        vistaCliente.tblVehiculo.setModel(modeloTabla);
    }

    public String generarCodigoReserva() {
        int aleatorio = 0;
        aleatorio = (int) (Math.random() * (999999 - 100000 + 1) + 100000);
        codigo = String.valueOf(aleatorio);
        return codigo;
    }

    public Cliente devolverCliente() {
        return clienteElegido;
    }

    public void iniciarCliente() {
        vistaCliente.labelCodReserva.setText("100000");
        rellenarGuias();
        detallesCliente();
        this.vistaCliente.setVisible(true);
        this.vistaCliente.setLocationRelativeTo(null);
        limpiarControles();
        
    }

}
