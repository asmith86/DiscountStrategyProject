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
    private double netTotal;
    private double finalTotal;

    public Receipt(String heading, ReceiptOutputStrategy output){
        this.setHeading(heading);
        this.setOutput(output);
        
        this.lineItems = new LineItem[0];
        
    }
    
    public ReceiptOutputStrategy getOutput() {
        return output;
    }

    public final void setOutput(ReceiptOutputStrategy output) {
        this.output = output;
    }
    
    

    public String getHeading() {
        return heading;
    }

    public final void setHeading(String heading) {
        this.heading = heading;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public double getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }

    public double getFinalTotal() {
        return finalTotal;
    }

    public void setFinalTotal(double finalTotal) {
        this.finalTotal = finalTotal;
    }
    
    public void createLineItem(String prodId, String custId, int qty, 
                DataStorageStrategy storage){
        
    }
    
    public void addLineItemToReceipt(LineItem line) {
        LineItem[] temp = new LineItem[this.lineItems.length + 1];
        for (int i = 0; i < lineItems.length; i++) {
            temp[i] = lineItems[i];
        }
        temp[temp.length - 1] = line;
        lineItems = temp;
        temp = null;
    }
   
}
