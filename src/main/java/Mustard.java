public class Mustard extends ToppingDecorator{
    double price = 0.5;

    public Mustard(FoodItem foodItem){super(foodItem);}

    public double cook(){return foodItem.cook() + this.price;}

    public String addMustard() {return "mustard";}
}
