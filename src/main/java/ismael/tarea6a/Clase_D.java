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
public class Clase_D extends Clase_B{
    @Override
    public void metodoA(){//metodo A comun en todas las clases pero sobreescrito
        System.out.println("este es el metodo A de la clase D");
    }
    
        public void metodoD(){
        System.out.println("Este es el metodo D (que no está sobreescrito)");
    }
}
