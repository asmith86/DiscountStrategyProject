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

public class POSSystem {
    private Receipt receipt;
    private DataStorageStrategy data;
    
    
    

    
    public final void startNewSale(String custId,String receiptHeading, 
            ReceiptOutputStrategy output, DataStorageStrategy dataStorage,
            ReceiptFormatStrategy receiptFormat) {
        
        this.receipt = new Receipt(receiptHeading,output,dataStorage,custId, receiptFormat);
        this.data = dataStorage;
    }

    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        if(null == receipt){
            throw new IllegalArgumentException("Did not pass a Receipt");
        }
        this.receipt = receipt;
    }

    public DataStorageStrategy getData() {
        return data;
    }

    public final void setData(DataStorageStrategy data) {
        if(null == data){
            throw new IllegalArgumentException("Data object is null");
        }
        this.data = data;
    }

   
    
    
    public final void processItem(String prodId, int qty){
        this.receipt.createLineItem(prodId, qty, data);
        
    }
    
    public final void finishSale(){
        this.receipt.generateReceipt();
        
    }
    
}
