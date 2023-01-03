/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import libreria.SerializadoraGen;
import modelo.Credencial;
import modelo.PersonaArreglo;
import modelo.Trabajador;
import vista.fmrRegistroTrabajador;

/**
 *
 * @author User
 */
public class ControladorRegistroTrabajador {

    fmrRegistroTrabajador vistaRegistroTrabajador;
    PersonaArreglo modeloPersona;
    Credencial credencial;
    Trabajador trabajador;

    public ControladorRegistroTrabajador(fmrRegistroTrabajador vistaRegistroTrabajador, PersonaArreglo modeloPersona) {
        this.vistaRegistroTrabajador = vistaRegistroTrabajador;
        this.modeloPersona = modeloPersona;

        this.vistaRegistroTrabajador.btnAgrgar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                credencial = new Credencial(vistaRegistroTrabajador.txtNombreUsuario.getText(),
                        vistaRegistroTrabajador.txtContrase.getText());
                trabajador = new Trabajador(vistaRegistroTrabajador.txtCodTra.getText(),
                        Double.parseDouble(vistaRegistroTrabajador.txtSueldo.getText()), credencial,
                        0, vistaRegistroTrabajador.txtNombreTra.getText(), vistaRegistroTrabajador.txtDni.getText(),
                        Integer.parseInt(vistaRegistroTrabajador.txtEdad.getText()));
                if (modeloPersona.agregar(trabajador)) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido agregados exitosamente");
                    limpiarControles();
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido agregados exitosamente");
                }
            }
        });
        this.vistaRegistroTrabajador.btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String dni = JOptionPane.showInputDialog(null, "Ingrese el DNI de la persona \n");

                if (modeloPersona.eliminarPersona(dni)) {
                    JOptionPane.showMessageDialog(null, "Los datos han sido eliminado exitosamente");
                    limpiarControles();
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "Los datos no han sido eliminado exitosamente");
                }
            }
        });
        this.vistaRegistroTrabajador.btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String dni = JOptionPane.showInputDialog(null, "Ingrese el DNI de la persona \n");
                
                if (modeloPersona.buscarPersona(dni) != null) {
                    vistaRegistroTrabajador.txtNombreUsuario.setText(modeloPersona.enviarTrabajador((Trabajador) modeloPersona.buscarPersona(dni)).getCredenciales().getNombreDeUsuario());
                    vistaRegistroTrabajador.txtContrase.setText(modeloPersona.enviarTrabajador((Trabajador) modeloPersona.buscarPersona(dni)).getCredenciales().getContraseña());
                    vistaRegistroTrabajador.txtCodTra.setText(modeloPersona.enviarTrabajador((Trabajador) modeloPersona.buscarPersona(dni)).getCodTrabajador());
                    vistaRegistroTrabajador.txtSueldo.setText(String.valueOf(modeloPersona.enviarTrabajador((Trabajador) modeloPersona.buscarPersona(dni)).getSueldo()));
                    vistaRegistroTrabajador.txtNombreTra.setText(modeloPersona.buscarPersona(dni).getNombre());
                    vistaRegistroTrabajador.txtDni.setText(modeloPersona.buscarPersona(dni).getDni());
                    vistaRegistroTrabajador.txtEdad.setText(String.valueOf(modeloPersona.buscarPersona(dni).getEdad()));
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                                + "El DNI que ingresó no corresponde a ninguna persona");
                }
            }
        });
        this.vistaRegistroTrabajador.btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                credencial = new Credencial(vistaRegistroTrabajador.txtNombreUsuario.getText(),
                        vistaRegistroTrabajador.txtContrase.getText());
                trabajador = new Trabajador(vistaRegistroTrabajador.txtCodTra.getText(),
                        Double.parseDouble(vistaRegistroTrabajador.txtSueldo.getText()), credencial,
                        0, vistaRegistroTrabajador.txtNombreTra.getText(), vistaRegistroTrabajador.txtDni.getText(),
                        Integer.parseInt(vistaRegistroTrabajador.txtEdad.getText()));

                if (modeloPersona.buscarPersona(vistaRegistroTrabajador.txtDni.getText()) != null) {
                    if (modeloPersona.modificarPersona(vistaRegistroTrabajador.txtDni.getText(), trabajador)) {

                        JOptionPane.showMessageDialog(null, "Los datos no han sido modificados exitosamente");
                        limpiarControles();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error\n"
                                + "Los datos no han sido modificados exitosamente");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error\n"
                            + "No puedes modificar el documento de identidad");
                }

            }
        });
        this.vistaRegistroTrabajador.btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vistaRegistroTrabajador.dispose();
                SerializadoraGen.serializar("personas.txt", modeloPersona);
            }
        });
    }

    public void limpiarControles() {
        String[] cabecera = modeloPersona.getCabeceraTrabajador();
        String[][] datos = modeloPersona.getDatosTrabajador();
        DefaultTableModel modeloTabla = new DefaultTableModel(datos, cabecera);
        vistaRegistroTrabajador.tablaTrabajadores.setModel(modeloTabla);
    }

    public void iniciarRegistroTrabajador() {
        this.vistaRegistroTrabajador.setVisible(true);
        this.vistaRegistroTrabajador.setLocationRelativeTo(null);
        limpiarControles();
    }
}
