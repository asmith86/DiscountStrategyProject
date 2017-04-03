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
public class BasicReceiptFormat implements ReceiptFormatStrategy {
    
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

    @Override
    public String getReceiptForOutput(String heading, Customer customer, 
            LineItem[] lineItems) {
        double netTotal = 0.0;
        double finalTotal = 0.0;
        String outputString = "";
        
        outputString += customer.getCustomerName() + "\n\n";
        outputString += heading + "\n\n";
        outputString += "ID Product Price Qty Subtotal Discount\n";
        outputString += "--------------------------------------\n";
       
        
        for(LineItem line : lineItems){
            
            netTotal += line.getSubtotal();
            finalTotal += line.getDiscountedSubtotal();
            outputString += line.getProduct().getProductId() +
                    " " + line.getProduct().getProductName() +
                    " $" + line.getProduct().getPrice() + 
                    " " + line.getQuantity() + 
                    " $" + line.getSubtotal() + 
                    " $" + line.getDiscountedSubtotal() + "\n";
            
        }
        
        outputString += "\n\n\n";
        outputString += "Net total: $" + netTotal + "\n";
        outputString += "Final total: $" + finalTotal;
        
        return outputString;
    }
    
}
