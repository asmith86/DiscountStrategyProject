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
public class ConsoleOutput implements ReceiptOutputStrategy {
    /* 
    * Receipt shall print following this format:
    * Heading
    * Customer Name
    * ID Item name Price Quantity Subtotal Discounted price.
    * 
    * Net total
    * Total Saved
    * Total Due
    */
    
  
    
    public void generateReceipt(String heading, Customer customer, 
            LineItem[] lineItems){
        
        String outputString = "";
        
        outputString += heading + "\n\n";
        outputString += "ID Product Price Qty Subtotal Discount";
        outputString += "--------------------------------------";
        outputString += customer.getCustomerName() + "\n\n";
        
        for(LineItem line : lineItems){
            outputString += line.getProduct().getProductId() +
                    " " + line.getProduct().getProductName() +
                    " " + line.getProduct().getPrice() + 
                    " " + line.getQuantity() + 
                    " " + line.getSubtotal() + 
                    " " + line.getDiscountedSubtotal() + "\n";
        }
        
       
        this.outputReceipt(outputString);
    }
    
    public void outputReceipt(String output){
        System.out.println(output);
    }
}
