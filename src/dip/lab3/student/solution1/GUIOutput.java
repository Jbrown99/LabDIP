/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;



/**
 *
 * @author joshuabrown
 */
public class GUIOutput implements MessageOutput {

    @Override
    public void outputMessage(MessageInput message) {
        
        Message msg = message.getMessage();
        JOptionPane.showMessageDialog(null,msg);
        
    }
    
    
    
}
