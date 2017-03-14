/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

/**
 *
 * @author Alex
 */
public class FlatDiscount implements DiscountStrategy {
    private double amountOff;
    
    public FlatDiscount(double amountOff){
        this.setAmountOff(amountOff);
    }

    public double getAmountOff() {
        return amountOff;
    }

    public final void setAmountOff(double amountOff) {
        this.amountOff = amountOff;
    }

    @Override
    public double getCalculatedDiscount(double price) {
       return price - this.getAmountOff();
    }
    
    
}
