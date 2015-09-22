/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author jbrown99
 */
public class Startup {
    
    
    
    public static void main(String[] args) {
        TipCalculatorService tcs = new FoodTipCalculator(setServiceRating.GOOD,50.00);
        TipCalculator tc = new TipCalculator();
        double tip = tc.getTip(tcs);
        System.out.println(tip);
        
    }
    
}
