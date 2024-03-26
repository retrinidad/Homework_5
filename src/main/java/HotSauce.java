public class HotSauce extends ToppingDecorator{
    double price = 0.5;

    public HotSauce(FoodItem foodItem){super(foodItem);}

    public double cook(){return foodItem.cook() + this.price;}

    public String addHotSauce() {return "hot sauce";}
}