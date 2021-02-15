/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esrunnable;

/**
 *
 * @author Utente
 */
public class Esrunnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Runnable n1= new Miorunnable("brontolo");
        
        Thread t1 = new Thread(n1);
        t1.start();

        Thread t2= new Thread(new Miorunnable("cucciolo"));
        t2.start();
        
        Thread t3= new Thread(new Miorunnable("eolo"));
        t3.start();
        
        Thread t4= new Thread(new Miorunnable("mammolo"));
        t4.start();
        
        Thread t5= new Thread(new Miorunnable("dotto"));
        t5.start();
        
        Thread t6= new Thread(new Miorunnable("pisolo"));
        t6.start();
        
        Thread t7= new Thread(new Miorunnable("gongolo"));
        t7.start();
    }
    
}
