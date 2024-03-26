import java.util.ArrayList;

public class FoodOrder {
    ArrayList<FoodItem> FoodItemList = new ArrayList<FoodItem>();
    double TotalPrice;
    double DiscountTotal;

    FoodOrder(){
        TotalPrice = 0.0;
        DiscountTotal = 0.0;
    }
    public void addItem(FoodItem addedItem){
        this.FoodItemList.add(addedItem);
        TotalPrice = TotalPrice + addedItem.cook();
    }

}
