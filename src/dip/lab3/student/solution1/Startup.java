/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author joshuabrown
 */
public class Startup {
    
    public static void main(String[] args) {
        
    
    
    
    MessageInput input = new KeyboardInput();
    MessageOutput output = new GUIOutput();
    
    MessageManager manage = new MessageManager(input,output);
    manage.createMessage();
    
    
    
    
}
}