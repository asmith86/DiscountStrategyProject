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
    private DataStorageStrategy dataStorage;
    
    

    
    public final void startNewSale(String custId,String receiptHeading, 
            ReceiptOutputStrategy output, DataStorageStrategy dataStorage) {
        this.setDataStorage(dataStorage); 
        receipt = new Receipt(receiptHeading,output,dataStorage,custId);
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

    public final DataStorageStrategy getDataStorage() {
        return dataStorage;
    }

    public final void setDataStorage(DataStorageStrategy dataStorage) {
         if(null == dataStorage){
            throw new IllegalArgumentException("Did not pass a data storage object");
        }
        this.dataStorage = dataStorage;
    }
    
    
    public final void processItem(String prodId, int qty){
        this.receipt.createLineItem(prodId, qty, dataStorage);
    }
    
    public final void finishSale(){
        this.receipt.getOutput().outputReceipt();
    }
    
}
