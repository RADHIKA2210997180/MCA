abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { 
        return productId;
     }
    public String getName() {
         return name;
         }
    public double getPrice() { 
        return price; 
    }
    public void setPrice(double price) {
         this.price = price; 
        }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("ID: " + productId + ", Name: " + name + ", Price: " + price);
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { 
        super(id, name, price); 
    }
    public double calculateDiscount() { 
        return getPrice() * 0.1; 
    }
    public double calculateTax() { 
        return getPrice() * 0.18; 
    }
    public String getTaxDetails() {
         return "GST 18%";
         }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
         super(id, name, price); 
        }
    public double calculateDiscount() {
         return getPrice() * 0.2; 
        }
    public double calculateTax() { 
        return getPrice() * 0.05; 
    }
    public String getTaxDetails() { 
        return "GST 5%"; 
    }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { 
        return getPrice() * 0.05; 
    }
}

public class ECommercePlatform {
    public static void printFinalPrice(Product[] products) {
        for (Product p : products) {
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;

            p.displayDetails();
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            if (p instanceof Taxable) {
                System.out.println("Tax Details: " + ((Taxable)p).getTaxDetails());
            }
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Electronics(1, "Laptop", 60000);
        products[1] = new Clothing(2, "Shirt", 2000);
        products[2] = new Groceries(3, "Rice", 1000);

        printFinalPrice(products);
    }
}

