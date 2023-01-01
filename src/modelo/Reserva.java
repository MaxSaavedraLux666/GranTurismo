package modelo;

import java.io.Serializable;
import java.util.Date;

public class Reserva implements Serializable{

    private int codigoReserva;//6 digitos
    private Date fechaReserva;
    private Cliente cliente;
    private float precioReserva;

    public Reserva(Cliente cliente, float precioReserva) {
        this.cliente = cliente;
        this.precioReserva = precioReserva;
        this.codigoReserva = codigoReserva;
        this.fechaReserva = new Date();
    }

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }
    
    

    public boolean reservar() {
        boolean flag = false;

        return flag;
    }

    public boolean eliminarReserva() {
        boolean flag = false;

        return flag;
    }

    public boolean cancelarReserva() {
        boolean flag = false;

        return flag;
    }

    public boolean venderReserva() {
        boolean flag = false;

        return flag;
    }
}
