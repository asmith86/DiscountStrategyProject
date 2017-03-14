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
    
    public PercentDiscount(double discountPercentage){
        this.setDiscountPercentage(discountPercentage);
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public final void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getCalculatedDiscount(double price) {
        return price - (this.getDiscountPercentage() * price);
    }
    
    
}
