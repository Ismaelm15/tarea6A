/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ismael.tarea6a;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author ismael
 */
public class Clase_D extends Clase_B {

    private ArrayList<String> asignaturasRecibidas;

    @Override
    public void metodoA() {//metodo A comun en todas las clases pero sobreescrito
        System.out.println("este es el metodo A de la clase D");
    }

    public void metodoD() {
        System.out.println("Este es el metodo D (que no está sobreescrito)");
    }

    @Override
    public String toString() {
        return "Clase_D{" + "asignaturasRecibidas=" + asignaturasRecibidas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.asignaturasRecibidas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;

        }
        final Clase_D other = (Clase_D) obj;
        if (!Objects.equals(this.asignaturasRecibidas, other.asignaturasRecibidas)) {
            return false;
        }
        return true;
    }

}
