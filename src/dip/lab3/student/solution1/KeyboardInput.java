/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author joshuabrown
 */
public class KeyboardInput implements MessageInput {

    @Override
    public Message getMessage() {
        
        Scanner keyboard = new Scanner(System.in);
        String message = keyboard.nextLine();
        Message msg = new Message(message);
        return msg;
        
    }
    
    
    
}
