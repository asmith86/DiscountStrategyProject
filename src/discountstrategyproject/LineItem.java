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
    
    
    public LineItem(Product product, int quantity){
        this.setProduct(product);
        this.setQuantity(quantity);
        
    }
    

    public Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        if(null == product){
            throw new IllegalArgumentException("Product has not been provided.");
        }
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) {
        if(quantity <= 0){
            throw new IllegalArgumentException("quantity cannot be zero or less.");
        }
        this.quantity = quantity;
    }
    
    public double getSubtotal(){
        return this.product.getPrice() * this.getQuantity();
    }
    
    public double getDiscountedSubtotal(){
        return this.product.getDiscountedPrice() * this.getQuantity();
    }

  
    
    
    
}
