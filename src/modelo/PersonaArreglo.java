/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Sebastian
 */
public class PersonaArreglo {
    
    private Persona[] personas;
    private int indice;
    private final String[] cabeceraCliente = {"CODIGO DE RESERVA", "NOMBRE", "CORREO",
                            "TELEFONO","DNI","EDAD"};
    
    public PersonaArreglo(int tamanho) {
        this.personas = new Persona[tamanho];
        this.indice = 0;
    }
    
    public boolean agregar(Persona persona){
        boolean result = false;
        if(lleno()){
            crecer();
        }
        this.personas[this.indice] = persona;
        this.indice++;
        result = true;
        
        return result;
    }
    
    /*public boolean eliminarCliente(String codigo, Cliente clientes[]) {
        boolean result = false;
        int tamanio=contarClientes();
        Cliente[] nuevo = new Cliente[tamanio - 1];
        int pos = 0;
        for (int i = 0; i < tamanio; i++) {
            if (clientes[i].getCodReserva().equals(codigo)) {
                pos = i;
                result = true;
                break;
            }
        }
        if (result) {
            for (int i = 0; i < pos; i++) {
                nuevo[i] = clientes[i];
            }
            for (int i = pos + 1; i < tamanio; i++) {
                nuevo[i - 1] = clientes[i];
            }
            clientes = nuevo;
            this.indice--;
        }

        return result;
    }*/
    
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
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getDni().equals(dniPersona)) {
                result = personas[i];
                break;
            }
        }
        return result;
    }
    
    public boolean modificarPersona(String dniPersona, Persona persona) {
        boolean result = false;
        for (Persona objPersona : personas) {
            if (dniPersona.equals(objPersona.getDni())) {
                objPersona = persona;
                result = true;
            }
        }
        return result;
    }
    
    
    public void crecer(){
        Persona[] nuevo = new Persona[indice*2];
        int i=0;
        for(Persona obj: this.personas ){
            nuevo[i]= obj;
            i++;
        }
        this.personas = nuevo;
    }
    
    private  boolean vacio(){
        boolean result = false;
        
        return result;
    }
    
    private  boolean lleno(){
        boolean result = false;
        if(this.indice == this.personas.length){
            result = true;
        }
        return result;
    }
    private int contarClientes(){
        int i=0;
        for(Persona obj: this.personas ){
            if( obj != null ) {
                if(obj instanceof Cliente) {
                    i++;              
                }
            } 
        }
        return i;
    }
    public String[] getCabecera(){
        return this.cabeceraCliente;
    }
    public String[][] getClientes(){
        String[][] resultado = new String[getTotal(1)][6];
        int i = 0;
        for(Persona obj: this.personas ){
            if( obj != null ) {
                if(obj instanceof Cliente) {
                    resultado[i][0]= ((Cliente) obj).getCodReserva();
                    resultado[i][1]= obj.getNombre();
                    resultado[i][2]= ((Cliente) obj).getCorreo();
                    resultado[i][3]= ((Cliente) obj).getTelefono();
                    //resultado[i][3]= String.valueOf(((Cliente) obj).getPuntos());
                    resultado[i][4]= obj.getDni();
                    resultado[i][5]=String.valueOf(obj.getEdad());
                    i++;
                    
                }
            }
            
        }
        
        return resultado;
    } 
    
    public Trabajador[] getTrabajadores(){
        Trabajador[] resultado = new Trabajador[getTotal(2)];
        
        return resultado;
    } 
    
    @Override
    public String toString() {
         String result = "";
        for(Persona obj: this.personas ){
            if( obj != null ) {
                if(obj instanceof Cliente) {
                    result += obj + "\n\n";
                }
            }
            
        }
        return result;
    }

    private int getTotal(int i) {
        int resultado = 0;
        for(Persona obj: this.personas ){
            if( obj != null ) {
                if(obj instanceof Cliente && i == 1) {
                    resultado++;
                }
                if(obj instanceof Trabajador && i == 2) {
                    resultado++;
                }
            }
            
        }
        return resultado;
    }
    
}
