/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ismael.tarea6a;

import java.util.ArrayList;

/**
 *
 * @author ismael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Clase_A> clases = new ArrayList<>();

        Clase_A a1 = new Clase_A();
        Clase_A a2 = new Clase_A();
        Clase_A a3 = new Clase_B();
        Clase_A a4 = new Clase_B();
        Clase_A a5 = new Clase_C();
        Clase_A a6 = new Clase_C();
        Clase_A a7 = new Clase_D();
        Clase_A a8 = new Clase_D();

        clases.add(a1);
        clases.add(a2);
        clases.add(a3);
        clases.add(a4);
        clases.add(a5);
        clases.add(a6);
        clases.add(a7);
        clases.add(a8);

        for (Clase_A aux : clases) {
            // Conversiones explícitas
                           

            if (aux instanceof Clase_B) {
                ((Clase_B) aux).metodoA();
                ((Clase_B) aux).metodoB();

            }
            if (aux instanceof Clase_C) {
                Clase_C tmp = (Clase_C) aux;
                ((Clase_C) aux).metodoA();

                ((Clase_C) ((Clase_C) aux)).metodoC();
            }
            if (aux instanceof Clase_D) {
                Clase_D tmp = (Clase_D) aux;
                ((Clase_D) aux).metodoA();
                ((Clase_D) aux).metodoD();

            }
        }
        System.out.println(clases.indexOf(a8));
        System.out.println(clases.contains(a5));
        System.out.println(clases.remove(a4));
    }

}
