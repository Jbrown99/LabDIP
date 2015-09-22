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
public class FoodTipCalculator implements TipCalculatorService {
    
    private double minBill = 0.00;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    private double bill;
    private final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + minBill;
    
    private ServiceQuality serviceQuality;

   
            
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    
    public FoodTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }
    
    

    @Override
    public double getTip() {
        double tip = 0.00;
        
        switch(serviceQuality) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }

        
        
        
        
        return tip;
        
    }
    
    public final void setBill(double billAmt) {
        if(billAmt < minBill) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public double getGoodRate() {
        return goodRate;
    }

    public void setGoodRate(double goodRate) {
        this.goodRate = goodRate;
    }

    public double getFairRate() {
        return fairRate;
    }

    public void setFairRate(double fairRate) {
        this.fairRate = fairRate;
    }

    public double getPoorRate() {
        return poorRate;
    }

    public void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }

    public double getMinBill() {
        return minBill;
    }

    public void setMinBill(double minBill) {
        this.minBill = minBill;
    }
    
     private void setServiceRating(ServiceQuality q) {
        
    }
    
      public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
    
    
    
    
}
