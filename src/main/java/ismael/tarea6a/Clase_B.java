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
public class Clase_B extends Clase_A{
    
    int años_instituto;
    @Override
    public void metodoA(){//metodo A comun en todas las clases pero sobreescrito
        System.out.println("este es el metodo A de la clase B");
    }
    
    public void metodoB(){
        System.out.println("Este es el metodo B (que no está sobreescrito)");
    }

    @Override
    public String toString() {
        return "Clase_B{" + "a\u00f1os_instituto=" + años_instituto + '}';
    }


    
    
}
