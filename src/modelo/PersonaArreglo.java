/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Sebastian
 */
public class PersonaArreglo implements Serializable {

    private Persona[] personas;
    private int indice;
    private final String[] cabeceraCliente = {"CÓDIGO DE RESERVA", "NOMBRE", "CORREO",
        "TELEFONO", "DNI", "EDAD"};
    private final String[] cabeceraTrabajador = {"CÓDIGO", "NOMBRE", "DNI",
        "EDAD", "SUELDO", "VENTAS REALIZADAS"};

    private final String[] cabeceraPlanilla = {"DNI", "NOMBRES", "CANT. VENTAS",
        "SUELDO", "COMISIÓN", "SUELDO TOTAL"};

    Cliente clienteElegido;

    public PersonaArreglo(int tamanho) {
        this.personas = new Persona[tamanho];
        this.indice = 0;
    }

    public boolean agregar(Persona persona) {
        boolean result = false;
        if (lleno()) {
            crecer();
        }
        this.personas[this.indice] = persona;
        this.indice++;
        result = true;

        return result;
    }

    public boolean eliminarPersona(String dniPersona) {
        boolean result = false;
        Persona[] nuevo = new Persona[personas.length - 1];
        int pos = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getDni().equals(dniPersona)) {
                pos = i;
                result = true;
                break;
            }
        }
        if (result) {
            for (int i = 0; i < pos; i++) {
                nuevo[i] = personas[i];
            }
            for (int i = pos + 1; i < personas.length; i++) {
                nuevo[i - 1] = personas[i];
            }
            this.personas = nuevo;
            this.indice--;
        }

        return result;
    }

    public Persona buscarPersona(String dniPersona) {
        Persona result = null;
        for (int i = 0; i < this.personas.length; i++) {
            if (this.personas[i].getDni().equals(dniPersona)) {
                result = this.personas[i];
                break;
            }
        }
        return result;
    }

    public boolean modificarPersona(String dniPersona, Persona persona) {
        boolean result = false;
        for (Persona objPersona : this.personas) {
            if (dniPersona.equals(objPersona.getDni())) {
                objPersona = persona;
                result = true;
            }
        }
        return result;
    }

    public void crecer() {
        Persona[] nuevo = new Persona[indice * 2];
        int i = 0;
        for (Persona obj : this.personas) {
            nuevo[i] = obj;
            i++;
        }
        this.personas = nuevo;
    }

    private boolean lleno() {
        boolean result = false;
        if (this.indice == this.personas.length) {
            result = true;
        }
        return result;
    }

    public String[] getCabecera() {
        return this.cabeceraCliente;
    }

    public String[][] getClientes() {
        String[][] resultado = new String[getTotal(1)][6];
        int i = 0;
        for (Persona obj : this.personas) {
            if (obj != null) {
                if (obj instanceof Cliente) {
                    resultado[i][0] = ((Cliente) obj).getCodReserva();
                    resultado[i][1] = obj.getNombre();
                    resultado[i][2] = ((Cliente) obj).getCorreo();
                    resultado[i][3] = ((Cliente) obj).getTelefono();
                    resultado[i][4] = obj.getDni();
                    resultado[i][5] = String.valueOf(obj.getEdad());
                    i++;

                }
            }

        }
        return resultado;
    }

    public String[][] getDatosTrabajador() {
        String[][] resultado = new String[getTotal(2)][6];
        int i = 0;
        for (Persona obj : this.personas) {
            if (obj != null) {
                if (obj instanceof Trabajador) {
                    resultado[i][0] = ((Trabajador) obj).getCodTrabajador();
                    resultado[i][1] = obj.getNombre();
                    resultado[i][2] = obj.getDni();
                    resultado[i][3] = String.valueOf(obj.getEdad());
                    resultado[i][4] = String.valueOf(((Trabajador) obj).getSueldo());
                    resultado[i][5] = String.valueOf(((Trabajador) obj).getVentasRealizadas());
                    i++;
                }
            }
        }
        return resultado;
    }

    public String[][] getPlanilla() {
        String[][] resultado = new String[getTotal(2)][6];
        int i = 0;
        for (Persona obj : this.personas) {
            if (obj != null) {
                if (obj instanceof Trabajador) {
                    resultado[i][0] = obj.getDni();
                    resultado[i][1] = obj.getNombre();
                    resultado[i][2] = String.valueOf(((Trabajador) obj).getVentasRealizadas());
                    resultado[i][3] = String.valueOf(((Trabajador) obj).getSueldo());
                    resultado[i][4] = String.valueOf(((Trabajador) obj).calcularComision());
                    resultado[i][5] = String.valueOf((((Trabajador) obj).getSueldo() + ((Trabajador) obj).calcularComision()));
                    i++;
                }
            }
        }
        return resultado;
    }

    public Trabajador[] getTrabajadores() {
        Trabajador[] resultado = new Trabajador[getTotal(2)];
        return resultado;
    }

    public String[] getCabeceraTrabajador() {
        return cabeceraTrabajador;
    }

    public Cliente enviarCliente(Cliente cliente) {
        Cliente result = null;
        for (Persona obj : this.personas) {
            if (obj instanceof Cliente) {
                if (cliente.equals(obj)) {
                    result = (Cliente) obj;
                    break;
                }
            }
        }
        return result;
    }

    public Trabajador enviarTrabajador(Trabajador trabajador) {
        Trabajador result = null;
        for (Persona obj : this.personas) {
            if (obj instanceof Trabajador) {
                if (trabajador.equals(obj)) {
                    result = (Trabajador) obj;
                    break;
                }
            }
        }
        return result;
    }

    public Trabajador enviarTrabajador(String user, String pass) {
        Trabajador result = null;
        for (Persona obj : this.personas) {
            if (obj instanceof Trabajador) {
                if (((Trabajador) obj).getCredenciales().verificar(user, pass)) {
                    result = (Trabajador) obj;
                    break;
                }
            }
        }
        return result;
    }

    public String[] getCabeceraPlanilla() {
        return cabeceraPlanilla;
    }

    private int getTotal(int i) {
        int resultado = 0;
        for (Persona obj : this.personas) {
            if (obj != null) {
                if (obj instanceof Cliente && i == 1) {
                    resultado++;
                }
                if (obj instanceof Trabajador && i == 2) {
                    resultado++;
                }
            }
        }
        return resultado;
    }

    public double obtenerTotalSueldos() {
        double totalSueldos = 0;
        for (Persona obj : this.personas) {
            if (obj != null) {
                if (obj instanceof Trabajador) {
                    totalSueldos = ((Trabajador) obj).getSueldo();
                }
            }
        }
        return totalSueldos;
    }

    public double obtenerTotalSueldosNeto() {
        double totalSueldosNeto = 0;
        for (Persona obj : this.personas) {
            if (obj != null) {
                if (obj instanceof Trabajador) {
                    totalSueldosNeto = ((Trabajador) obj).getSueldo() + ((Trabajador) obj).calcularComision();
                }
            }
        }
        return totalSueldosNeto;
    }

    public double obtenerTotalVentas() {
        int totalVentas = 0;
        for (Persona obj : this.personas) {
            if (obj != null) {
                if (obj instanceof Trabajador) {
                    totalVentas = ((Trabajador) obj).getVentasRealizadas();
                }
            }
        }
        return totalVentas;
    }

    public boolean verificarTrabajador(String nombreUsuario, String contraseña) {
        boolean result = false;
        for (Persona obj : this.personas) {
            if (obj != null) {
                if (obj instanceof Trabajador) {
                    result = ((Trabajador) obj).getCredenciales().verificar(nombreUsuario, contraseña);
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (Persona obj : this.personas) {
            if (obj != null) {
                if (obj instanceof Cliente) {
                    result += obj + "\n\n";
                }

                if (obj instanceof Trabajador) {
                    result += obj + "\n\n";
                }
            }
        }
        return result;
    }
}
