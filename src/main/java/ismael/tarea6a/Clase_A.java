/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ismael.tarea6a;

/**
 *
 * @author ismael
 */
public class Clase_A {
    
    int edad;
    String nombre;
    
    public void metodoA(){//metodo A comun en todas las clases pero sobreescrito
        System.out.println("este es el metodo A de la clase A");
    }

    @Override
    public String toString() {
        return "Clase_A{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }



}

