package modelo;

public class GuiaArreglo {

    private Guia[] guias;
    int indice;
    private final String[] cabeceraTours = {"NOMBRE", "DNI", "SALARIO/H",
        "IDIOMA"};

    public GuiaArreglo(int tamaño) {
        this.guias = new Guia[tamaño];
        this.indice = 0;
    }

    public boolean agregarGuia(Guia guia) {
        boolean result = false;
        if (lleno()) {
            crecer();
        }
        this.guias[this.indice] = guia;
        this.indice++;
        result = true;

        return result;
    }

    private boolean lleno() {
        boolean result = false;
        if (this.indice == this.guias.length) {
            result = true;
        }
        return result;
    }

    public void crecer() {
        Guia[] nuevo = new Guia[indice * 2];
        int i = 0;
        for (Guia obj : this.guias) {
            nuevo[i] = obj;
            i++;
        }
        this.guias = nuevo;
    }

    public boolean eliminarGuia(String nombre) {
        boolean result = false;
        for (int i = 0; i < this.guias.length; i++) {
            if (guias[i] != buscarGuia(nombre)) {
                for (int k = i; k < guias.length; k++) {
                    this.guias[k] = guias[k + 1];
                }
                this.indice--;
                result = true;
            }
        }
        return result;
    }

    public Guia buscarGuia(String nombre) {
        Guia result = null;
        for (int i = 0; i < guias.length; i++) {
            if (guias[i].getNombre().equals(nombre)) {
                result = guias[i];
                break;
            }
        }
        return result;
    }

    public boolean modificarGuia(String nombre, Guia guia) {
        boolean result = false;
        for (Guia obj : guias) {
            if (nombre.equals(obj.getNombre())) {
                obj = guia;
                result = true;
            }
        }
        return result;
    }

    public String[][] getGuia() {
        String[][] resultado = new String[getTotal()][5];

        int i = 0;

        for (Guia obj : this.guias) {
            if (obj != null) {
                if (obj instanceof Guia) {
                    resultado[i][0] = obj.getNombre();
                    resultado[i][1] = obj.getDNI();
                    resultado[i][2] = String.valueOf(obj.getSalarioPorHora());
                    resultado[i][3] = obj.getIdioma();
                    i++;
                }
            }
        }
        return resultado;
    }

    public String[] getCabecera() {
        return this.cabeceraTours;
    }

    private int getTotal() {
        int resultado = 0;
        for (Guia obj : this.guias) {
            if (obj != null) {
                resultado++;
            }
        }
        return resultado;
    }

    public Guia[] getGuias() {
        return guias;
    }

    public void setGuias(Guia[] guias) {
        this.guias = guias;
    }

    @Override
    public String toString() {
        String result = "";
        for (Guia obj : this.guias) {
            result += obj + "\n";
        }
        return result;
    }
}
