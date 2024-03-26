
public class DecoratorPatternDriver {
    public static void main(String[] args){
        CustomerLoyalty currentAccount = new CustomerLoyalty();
        FoodOrder firstOrder = new FoodOrder();
        FoodItem firstItem = new Ketchup(new ChickenNuggets());
        FoodItem secondItem = new Mustard(new Ketchup(new Hamburger()));

        firstOrder.addItem(firstItem);
        firstOrder.addItem(secondItem);

        double firstOrderDiscount = currentAccount.UseDiscount(firstOrder);

        System.out.println("Your order total will come to $" + (firstItem.cook() + secondItem.cook() - firstOrderDiscount));

        currentAccount.addOrderToLoyaltyAccount(firstOrder);

        FoodOrder secondOrder = new FoodOrder();
        FoodItem thirdItem = new HotSauce(new Ketchup(new Mustard(new ChickenNuggets())));
        FoodItem fourthItem = new Ketchup(new Fries());

        secondOrder.addItem(thirdItem);
        secondOrder.addItem(fourthItem);

        double secondOrderDiscount = currentAccount.UseDiscount(secondOrder);

        System.out.println("Your order total will come to $" + (thirdItem.cook() + fourthItem.cook() - secondOrderDiscount));

        currentAccount.addOrderToLoyaltyAccount(secondOrder);

    }
}
