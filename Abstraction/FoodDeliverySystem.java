abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { 
        return itemName; 
    }
    public double getPrice() {
         return price;
         }
    public int getQuantity() {
         return quantity;
         }
    public void setQuantity(int quantity) { 
        this.quantity = quantity;
     }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

interface Discountable {
    void applyDiscount(double discountPercent);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discount = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        total -= total * discount / 100;
        return total;
    }

    public void applyDiscount(double discountPercent) { 
        discount = discountPercent;
     }
    public String getDiscountDetails() {
         return discount + "% discount applied";
         }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;
    private double extraCharge = 50;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        double total = (getPrice() + extraCharge) * getQuantity();
        total -= total * discount / 100;
        return total;
    }

    public void applyDiscount(double discountPercent) { 
        discount = discountPercent;
     }
    public String getDiscountDetails() { 
        return discount + "% discount applied"; 
    }
}

public class FoodDeliverySystem {
    public static void processOrder(FoodItem[] items) {
        for (FoodItem item : items) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            if (item instanceof Discountable d) {
                d.applyDiscount(10);
                System.out.println(d.getDiscountDetails());
                System.out.println("Price after discount: " + item.calculateTotalPrice());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Butter Masala", 200, 2),
            new NonVegItem("Chicken Biryani", 250, 1)
        };
        processOrder(order);
    }
}
