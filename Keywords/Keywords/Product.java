public class Product {
    static int discount = 10;
    String productname;
    int price;
    final int id;
    int quantity;
    Product(String productname , int price ,int id , int quantity){
        this.productname=productname;
        this.id=id;
        this.quantity=quantity;
    }
    public void display(){
        if(this instanceof Product){
        System.out.println("Product Name : "+productname);
        System.out.println("Product Price : "+price);
        System.out.println("Product ID : "+id);
        System.out.println("Product Quantity : "+quantity);
        System.out.println("Disocunt on Product : "+discount+"%");
        }
    }
    public static void updateDiscount(int newdiscount){
       discount=newdiscount;
       System.out.println("Discount after updation :"+newdiscount+"%");
    }
}
class ShoppingCartSystem{
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 80000, 0101, 5);
        Product p2 = new Product("Mobile", 50000, 0202, 4);

        p1.display();
        p2.display();

        Product.updateDiscount(20);
    }
}
