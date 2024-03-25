public class Ketchup extends ToppingDecorator{
    double price = 0.5;

    public Ketchup(FoodItem foodItem){super(foodItem);}

    public double cook(){return foodItem.cook() + this.price;}

    public String addKetchup() {return "ketchup";}

}
