import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingCartTest {
    private ShoppingCart testCart = new ShoppingCart();
    private Product soda = new Product("Coca Cola", 2.50);
   
    //Test 1
    //Tests to see if the initial cart has 0 items
    @Test
    public void testInitialCart() throws Exception {
        assertEquals(0, testCart.getItemCount());
    }

    //Test 2
    //Tests to see if the empty method empties the shopping cart properly.
    //This is done by adding an item to the cart, invoke the empty method, then testing.
    @Test
    public void testEmptyCart() throws Exception {
        testCart.addItem(soda);
        testCart.empty();
        assertEquals(0, testCart.getItemCount());
    }

    //Test 3
    //Tests to see if the number of items increments when a new product is added.
    //This is done by adding an item to the cart, and checking that the return value from getItemCount has increased by one.
    @Test
    public void testItemIncrease() throws Exception {
        testCart.addItem(soda);
        assertEquals(1, testCart.getItemCount());
        testCart.addItem(banana);
        assertEquals(2, testCart.getItemCount());
    }

    //Test 4
    //Tests to see if the balance is totaled correctly.
    //This is done by adding an item to the cart (which is known to be of 0 balance)
    //and checking the balance against the price of the item.
    @Test
    public void testBalance() throws Exception {
        testCart.addItem(soda);
        assertEquals(2.5, testCart.getBalance(), 0);
    }

    //Test5
    //This test is to check that the cart is correctly updated once an item is removed
    @Test
    public void testRemove() throws Exception {
        testCart.addItem(soda);
        testCart.addItem(pepsi);
        testCart.removeItem(soda);
        assertEquals(1, testCart.getItemCount());

    }

}