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
    
    private String output;

    public final String getOutput() {
        return output;
    }

    public final void setOutput(String output) {
        if(null == output || output.isEmpty()){
            throw new IllegalArgumentException("Output cannot be null or empty.");
        }
        this.output = output;
    }
    
    
  
    
    @Override
    public final void generateReceipt(String heading, Customer customer, 
            LineItem[] lineItems){
        
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
        this.setOutput(outputString);
        
    }
    
    

    @Override
    public final void outputReceipt() {
        
        System.out.println(this.output);
        System.out.println("");
    }
}
