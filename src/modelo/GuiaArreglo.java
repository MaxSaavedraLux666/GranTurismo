
package modelo;


public class GuiaArreglo {
    private Guia[] guias;
    int indice;
    
    public GuiaArreglo(int tamaño) {
        this.guias = new Guia[tamaño];
        this.indice = 0;
    }
    
    public boolean agregar(Guia guia) {
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
    
}
