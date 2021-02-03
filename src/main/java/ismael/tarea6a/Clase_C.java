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

     

import java.util.ArrayList;

public class Clase_C extends Clase_B{
    
    private ArrayList<String> asignaturasImpartidas;
    @Override
    public void metodoA(){//metodo A comun en todas las clases pero sobreescrito
        System.out.println("este es el metodo A de la clase C");
    }
    
        public void metodoC(){
        System.out.println("Este es el metodo C (que no está sobreescrito)");
    }

    @Override
    public String toString() {
        return "Clase_C{" + "asignaturasImpartidas=" + asignaturasImpartidas + '}';
    }
        

}
