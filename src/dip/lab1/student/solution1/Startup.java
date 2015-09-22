/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author jbrown99
 */
public class Startup {
    public static void main(String[] args) {
        Employee e = new SalariedEmployee(50000,1000);
        HRService hr = new HRService();
        double wages = hr.getAnnualWages(e);
        System.out.println(wages);
    }
}
