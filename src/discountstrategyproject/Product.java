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
public class Product {
    private String productId;
    private String productName;
    private double price;
    private DiscountStrategy discount;
    
    public Product(String productId, String productName, double price, 
            DiscountStrategy discount){
        this.setProductId(productId);
        this.setProductName(productName);
        this.setPrice(price);
        this.setDiscount(discount);
    }

    public String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    public final double getDiscountedPrice(){
        return this.discount.getCalculatedDiscount(price);
    }
    
}
