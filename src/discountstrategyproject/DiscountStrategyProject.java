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
public class DiscountStrategyProject {

    /**
     * @param args the command line arguments
     */
    
    //ONLY PASS IN OBJECTS WHERE THEY'RE NEEDED. OTHERWISE PASS DATA THAT 
    //ANOTHER OBJECT MAY NEED TO USE THE OBJECT WHERE IT NEEDS IT.
    
    //DO NOT CREATE OBJECTS WHERE THEY ARE NOT USED!!!
    
    //USE CUSTOMER, PRODUCT IN THE LINEITEM ONLY. PRODUCT ID/CUSTOMER ID CAN BE
    //PASSED AROUND IF NEEDED.
    
    public static void main(String[] args) {
        POSSystem pos = new POSSystem();
        
        pos.startNewSale("101",
                "Thank you for shopping at Kohls", new ConsoleOutput(),
                new MemoryStorage()
        );
       
        pos.processItem("A100", 3);
        pos.processItem("B100", 2);
        pos.processItem("C100", 1);
        
        pos.finishSale();
               
    }
    
}
