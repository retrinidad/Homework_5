import java.util.ArrayList;
import java.util.Scanner;

public class CustomerLoyalty {
    ArrayList<FoodOrder> OrderList = new ArrayList<FoodOrder>();
    int points_amount; //for every five dollars spent, one membership point will be granted
                       //every point accumulated converts to one dollar that can be used to discount any new future orders
                       //when choosing to use loyalty points for discount, all points will be expended at once, i.e. no choosing to use some points at a current order and then using the rest later
    double dollars_spent = 0.0;

    void addOrderToLoyaltyAccount(FoodOrder newOrder){
        OrderList.add(newOrder);
        dollars_spent = dollars_spent + newOrder.TotalPrice - newOrder.DiscountTotal;
        points_amount = (int) Math.floor(dollars_spent / 5);
    }

    public int getTotalPoints(){
        return this.points_amount;
    }

    public double askToUseDiscount(FoodOrder order){
        if(points_amount > 0) {
            System.out.println("Would you like to use your membership loyalty point discount? ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("yes")){
                order.DiscountTotal = expendPoints();
                return order.DiscountTotal;
            }
        }
        return order.DiscountTotal;
    }

    double expendPoints() {
        if(points_amount == 0){
            System.out.println("Not enough points to use discount ");
            return 0.0;
        }
        double discount = points_amount;

        points_amount = 0;
        dollars_spent = 0.0;
        OrderList.clear();
        System.out.println("Discount used. All points are expended ");
        return discount;
    }
}
