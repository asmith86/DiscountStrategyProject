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
    
    public POSSystem(Receipt receipt, DataStorageStrategy dataStorage){
        this.setDataStorage(dataStorage);
        this.setReceipt(receipt);
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
    
    public void processTransaction(String prodId, int qty, String custId){
        
    }
    
}
