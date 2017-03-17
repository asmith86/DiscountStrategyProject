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
public class MemoryStorage implements DataStorageStrategy {

    private Customer[] customers = {
        new Customer("101", "Brody Stevens"),
        new Customer("304", "Gilbert Godfrey"),
        new Customer("201", "Richard Pryor")
    };

    private Product[] products = {
        new Product("A100", "Large Socks", 9.99, new NoDiscount()),
        new Product("B100", "Flannel Shirt", 14.99, new PercentDiscount(0.1)),
        new Product("C100", "Crock Pot", 29.99, new FlatDiscount(5.0))

    };

    @Override
    public final Customer findCustomer(String custId) {

      
        Customer customer = null;
        for (Customer c : customers) {
            if (custId.equals(c.getCustomerId())) {
                customer = c;
                break;
            }
        }

        return customer;
    }

    @Override
    public final Product findProduct(String prodId) {

        

        Product product = null;
        for (Product p : products) {
            if (prodId.equals(p.getProductId())) {
                product = p;
                break;
            }
        }

        return product;
    }
}


