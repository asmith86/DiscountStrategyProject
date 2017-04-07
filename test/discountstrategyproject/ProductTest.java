/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asmith86
 */
public class ProductTest {
    private Product instance;
   
    public ProductTest() {
    }
    
    @Before
    public void setUp() {
        instance = new Product();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

   
   

    /**
     * Test of setProductId method, of class Product.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetProductIdForDisallowedNull() {
     
           instance.setProductId(null);

       
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetProductIdForDisallowedEmptyValue(){
        instance.setProductId("");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetProductIdForDisallowedHighLength(){
        instance.setProductId("a12634903938304");
    }
    
    
    
    @Test
    public void testSetProductIdForAllowedValues(){
        String testIds[] = {
            "a104", "b206", "c107", "c309", "d120"
        };
        for(String t : testIds){
            instance.setProductId(t);
        }
        
    }
    
    
     /**
     * Test of setProductName method, of class Product.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetProductNameForDisallowedNull() {
      
           instance.setProductName(null);
       
       
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetProductNameForDisallowedEmptyValue(){
        instance.setProductName("");
    }

    @Test
    public void testSetProductNameForAllowedNames(){
        String testNames[] = {
            "socks", "shoe", "boat", "door", "sandbox"
        };
        for(String t : testNames){
            instance.setProductName(t);
        }
        
    }


   
    /**
     * Test of setPrice method, of class Product.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetPriceForNegativeValue() {
        instance.setPrice(-1.0);
    }

   
    /**
     * Test of setDiscount method, of class Product.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDiscountForDisallowedNull() {
        
          instance.setDiscount(null);
        
       
    }
    
    
    

    
    
    
}
