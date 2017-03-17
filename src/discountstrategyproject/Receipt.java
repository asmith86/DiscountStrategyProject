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
public class Receipt {
    private ReceiptOutputStrategy output;
    private String heading;
    private LineItem[] lineItems;
    private Customer customer;
     

    public Receipt(String heading, ReceiptOutputStrategy output,DataStorageStrategy dataStorage,String custId){
        this.setHeading(heading);
        this.setOutput(output);
        customer = dataStorage.findCustomer(custId);
        this.lineItems = new LineItem[0];
        
    }
    
    public final ReceiptOutputStrategy getOutput() {
        return output;
    }

    public final void setOutput(ReceiptOutputStrategy output) {
        if(null == output){
            throw new IllegalArgumentException("Did not provide an output strategy object");
        }
        this.output = output;
    }
    
    

    public final String getHeading() {
        return heading;
    }

    public final void setHeading(String heading) {
        if(null == heading || heading.isEmpty()){
            throw new IllegalArgumentException("Heading is null or empty");
        }
        this.heading = heading;
    }

    public final LineItem[] getLineItems() {
        return lineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        if(null == lineItems){
            throw new IllegalArgumentException("LineItems is null");
        }
            
        this.lineItems = lineItems;
    }

  
    public final Customer getCustomer() {
        return customer;
    }

 
    
    public final void createLineItem(String prodId, int qty, 
                DataStorageStrategy storage){
        Product p = storage.findProduct(prodId);
        LineItem line = new LineItem(p, qty);
        this.addLineItemToReceipt(line);
    }
    
    private final void addLineItemToReceipt(LineItem line) {
        LineItem[] temp = new LineItem[this.lineItems.length + 1];
        for (int i = 0; i < this.lineItems.length; i++) {
            temp[i] = this.lineItems[i];
        }
        temp[temp.length - 1] = line;
        this.lineItems = temp;
        temp = null;
    }
    
    public final void generateReceipt(){
        this.output.generateReceipt(heading, customer, lineItems);
    }
   
}
