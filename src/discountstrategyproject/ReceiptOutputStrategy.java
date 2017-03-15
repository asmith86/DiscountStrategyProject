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
public interface ReceiptOutputStrategy {
    public abstract void generateReceipt(String heading, Customer customer, 
            LineItem[] lineItems);
    
    public abstract void outputReceipt();
}
