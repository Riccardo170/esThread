/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maint;

/**
 *
 * @author Utente
 */
public class MainT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("il main è stato avviato");
        
        Thread t1 = new Nani("Brontolo");
        Thread t2 = new Nani("Cucciolo");
        Thread t3 = new Nani("dotto");
        Thread t4 = new Nani("Eolo");
        Thread t5 = new Nani("Gongolo");
        Thread t6 = new Nani("Mammolo");
        Thread t7 = new Nani("Pisolo");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        
        
        
    }
    
}
