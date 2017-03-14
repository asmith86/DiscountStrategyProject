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
public class LineItem {
    private Product product;
    private int quantity;
    

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double getSubtotal(){
        return this.product.getPrice() * this.getQuantity();
    }
    
    public double getDiscountedSubtotal(){
        return this.product.getDiscountedPrice() * this.getQuantity();
    }

  
    
    
    
}
