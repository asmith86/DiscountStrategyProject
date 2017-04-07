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
public class PercentDiscount implements DiscountStrategy {
    private double discountPercentage;
    
    public PercentDiscount(){
        
    }
    
    public PercentDiscount(double discountPercentage){
        this.setDiscountPercentage(discountPercentage);
    }

    public final double getDiscountPercentage() {
        return discountPercentage;
    }

    public final void setDiscountPercentage(double discountPercentage) {
        if(discountPercentage > 1.0 || discountPercentage < 0){
            throw new IllegalArgumentException("Percent discount cannot be " + 
                    "greater than 1 or less than zero.");
        }
        this.discountPercentage = discountPercentage;
    }

    @Override
    public final double getCalculatedDiscount(double price) {
        return price - (this.getDiscountPercentage() * price);
    }
    
    
}
