/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class SerializadoraGen implements Serializable{

    public static void serializar(String sNombreArchivo,
            ArrayList arreglo) {
        try {
            ObjectOutputStream escritor
                    = new ObjectOutputStream(
                            new FileOutputStream(sNombreArchivo));
            escritor.writeObject(arreglo);
            escritor.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void serializar(String sNombreArchivo,
            Object arreglo) {
        try {
            ObjectOutputStream escritor
                    = new ObjectOutputStream(
                            new FileOutputStream(sNombreArchivo));
            escritor.writeObject(arreglo);
            escritor.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Object deserializar(String sNombreArchivo) {
        Object arreglo;// = new ArrayList ();
        try {
            ObjectInputStream lector
                    = new ObjectInputStream(
                            new FileInputStream(sNombreArchivo));
            arreglo = (Object) lector.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return arreglo;

    }
}
