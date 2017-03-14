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
public class Customer {
    private String customerId;
    private String customerName;
    
    
    public Customer(String customerId, String customerName){
        this.setCustomerId(customerId);
        this.setCustomerName(customerName);
    }

    public String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    
}
