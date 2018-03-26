/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author 726246
 */
public class Carrier {
   private String message;
    private boolean haveMessage = true;
    /**
     * 
     * @return message
     */
    public synchronized String receiveMessage(){
        while(haveMessage){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        haveMessage = true;
        notifyAll();
                
        return message;
    }
    
   /**
    * 
    * @param message contains the message to be sent
    */ 
    public synchronized void sendMessage(String message){
        while(!haveMessage){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Sending the message");
        haveMessage = false;
        this.message = message;
        notifyAll();
    }
    
}
