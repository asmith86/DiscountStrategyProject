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
public class PercentDiscountTest {
    private PercentDiscount instance;
    
    public PercentDiscountTest() {
    }
    
    @Before
    public void setUp() {
        instance = new PercentDiscount();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of getDiscountPercentage method, of class PercentDiscount.
     */
    

    /**
     * Test of setDiscountPercentage method, of class PercentDiscount.
     */
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetDiscountPercentageForDisallowedHighValue() {
        double badHighValue = 2.0;
        instance.setDiscountPercentage(badHighValue);
       
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetDiscountPercentageForDisallowedLowValue(){
        double badLowValue = -1.0;
        instance.setDiscountPercentage(badLowValue);
    }
    
    
    @Test
    public void testGetCalculatedDiscountForGoodValues(){
        
        double[] testDiscountValues = {
            0.5, 0.2, 0.3, 0.1
        };
        
        double[] testPriceValues = {
            5.0, 15.5, 3.0, 2.5
        };
        
        for(double d : testDiscountValues){
            instance.setDiscountPercentage(d);
            for(double p : testPriceValues){
               double expected = p - (d * p);
               double result = instance.getCalculatedDiscount(p);
               assertEquals(expected, result, 0.001);
            }
        }
    }

   
    
}
