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

    public final String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) {
        if(productId == null || productId.isEmpty()){
            throw new IllegalArgumentException("Invalid product ID");
        }
        this.productId = productId;
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        if(productName == null || productName.isEmpty()){
            throw new IllegalArgumentException("Invalid product name");
        }
        this.productName = productName;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
        if(discount == null){
            throw new IllegalArgumentException("Did not provide a discount strategy object");
        }
        this.discount = discount;
    }
    
    public final double getDiscountedPrice(){
        return this.discount.getCalculatedDiscount(price);
    }
    
}
