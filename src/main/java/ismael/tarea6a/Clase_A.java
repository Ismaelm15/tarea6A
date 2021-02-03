/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ismael.tarea6a;

import java.util.Objects;

/**
 *
 * @author ismael
 */
public class Clase_A {

    int edad;
    String nombre;

    public void metodoA() {//metodo A comun en todas las clases pero sobreescrito
        System.out.println("este es el metodo A de la clase A");
    }

    @Override
    public String toString() {
        return "Clase_A{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.edad;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clase_A other = (Clase_A) obj;
        return true;
    }

}
