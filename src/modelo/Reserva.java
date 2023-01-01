package modelo;

import java.io.Serializable;
import java.util.Date;

public class Reserva implements Serializable{

    private int codigoReserva;//6 digitos
    private Date fechaReserva;
    private Cliente cliente;
    private float precioReserva;
    private PersonaArreglo modeloCliente;
    private Date fechaIV;

    public Reserva(int codigoReserva, Date fechaReserva, Cliente cliente, float precioReserva, PersonaArreglo modeloCliente, Date fechaIV) {
        this.codigoReserva = codigoReserva;
        this.fechaReserva = fechaReserva;
        this.cliente = cliente;
        this.precioReserva = precioReserva;
        this.modeloCliente = modeloCliente;
        this.fechaIV = fechaIV;
    }
 
    public boolean reservar() {
        boolean flag = false;

        if (cliente.equals(modeloCliente.buscarPersona(cliente.getDni()))) {
            flag = true;
        }
        return flag;
    }

    public boolean eliminarReserva() {
        boolean flag = false;
        
        if (cliente.equals(modeloCliente.buscarPersona(cliente.getDni()))) {
            if (modeloCliente.eliminarPersona(cliente.getDni())) {
                flag = true;
            }
        }
        
        return flag;
    }

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getPrecioReserva() {
        return precioReserva;
    }

    public void setPrecioReserva(float precioReserva) {
        this.precioReserva = precioReserva;
    }

    public PersonaArreglo getModeloCliente() {
        return modeloCliente;
    }

    public void setModeloCliente(PersonaArreglo modeloCliente) {
        this.modeloCliente = modeloCliente;
    }

    public Date getFechaIV() {
        return fechaIV;
    }

    public void setFechaIV(Date fechaIV) {
        this.fechaIV = fechaIV;
    }

    @Override
    public String toString() {
        return "Reserva{" + "codigoReserva=" + codigoReserva + ", fechaReserva=" + fechaReserva + ", cliente=" + cliente + ", precioReserva=" + precioReserva + ", modeloCliente=" + modeloCliente + ", fechaIV=" + fechaIV + '}';
    }
    
}
