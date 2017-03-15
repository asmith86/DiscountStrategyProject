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
    

    
    public void startNewSale(String custId,String receiptHeading, 
            ReceiptOutputStrategy output, DataStorageStrategy dataStorage) {
        this.setDataStorage(dataStorage); 
        receipt = new Receipt(receiptHeading,output,dataStorage,custId);
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public DataStorageStrategy getDataStorage() {
        return dataStorage;
    }

    public void setDataStorage(DataStorageStrategy dataStorage) {
        this.dataStorage = dataStorage;
    }
    
    
    public void processItem(String prodId, int qty){
        this.receipt.createLineItem(prodId, qty, dataStorage);
    }
    
    public void finishSale(){
        this.receipt.getOutput().outputReceipt();
    }
    
}
