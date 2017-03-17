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

    public final double getAmountOff() {
        return amountOff;
    }

    public final void setAmountOff(double amountOff) {
        if(amountOff < 0){
            throw new IllegalArgumentException("amount off product cannot be less than zero.");
        }
        this.amountOff = amountOff;
    }

    @Override
    public final double getCalculatedDiscount(double price) {
       return price - this.getAmountOff();
    }
    
    
}
