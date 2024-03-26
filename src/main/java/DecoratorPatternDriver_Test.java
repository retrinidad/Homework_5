import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class DecoratorPatternDriver_Test {

    @Test
    public void first_test(){
        FoodItem Item = new Fries();
        double expected = 3.0;
        assertEquals(Item.cook(), expected);
    }

    @Test
    public void second_test(){
        FoodItem Item = new Ketchup(new Fries());
        double expected = 3.5;
        assertEquals(Item.cook(), expected);
    }

    @Test
    public void third_test(){
        CustomerLoyalty currentAccount = new CustomerLoyalty();
        FoodOrder Order = new FoodOrder();
        FoodItem Item = new Mustard(new Ketchup(new Hamburger()));
        Order.addItem(Item);
        currentAccount.addOrderToLoyaltyAccount(Order);
        int expected = 1;

        assertEquals(expected, currentAccount.getTotalPoints());
    }

    @Test
    public void fourth_test(){
        CustomerLoyalty currentAccount = new CustomerLoyalty();
        currentAccount.points_amount = 2;
        currentAccount.dollars_spent = 10.0;
        FoodOrder Order = new FoodOrder();
        FoodItem Item = new Fries();
        Order.addItem(Item);
        Order.DiscountTotal = currentAccount.expendPoints();
        double expected = 1.0;

        assertEquals(expected,Item.cook() - Order.DiscountTotal);

    }

}
