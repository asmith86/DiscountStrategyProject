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
    public static void main(String[] args) {
        POSSystem pos = new POSSystem(
                new Receipt("Thank you for shopping at Kohls", new ConsoleReceipt()),
                new MemoryStorage()
        );
        
        
               
    }
    
}
