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
public class ConsoleOutput implements MessageOutput {

    @Override
    public void outputMessage(MessageInput message) {
        
        Message msg = message.getMessage();
        System.out.println(msg.getStringMessage());
    }

    
    
    
    
}
