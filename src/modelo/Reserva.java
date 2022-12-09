package modelo;

import java.util.Date;

public class Reserva {

    private int codigoReserva;//6 digitos
    private Date fechaReserva;
    private Cliente cliente;
    private float precioReserva;

    public Reserva(Cliente cliente, float precioReserva) {
        this.cliente = cliente;
        this.precioReserva = precioReserva;
        this.codigoReserva = (int) (Math.random() * (999999 - 100000 + 1) + 100000);
        this.fechaReserva = new Date();
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
