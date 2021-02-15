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
public class Nani extends Thread {
    
    public Nani(String nome){
    super();
    setName(nome);
    }
    
    @Override
      public void run(){
         for(int i=0;i<7;i++){
             System.out.println((i+1)+""+getName());
         }
        
         
     }
    
}
    

