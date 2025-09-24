class Order1 {
    int orderId;
    String orderDate;

    Order1(int orderId,String orderDate) {
        this.orderId=orderId;
        this.orderDate=orderDate;
    }
    String getOrderStatus(){
        return "Order Placed" ;
    }
    void displayStatus(){
        System.out.println("Order id:"+orderId);
        System.out.println("Order Date:"+orderDate);
        System.out.println("Status:"+getOrderStatus());
    }
}
class ShippedOrder extends Order1{
    int trackingNumber;

    ShippedOrder(int orderId,String orderDate,int trackingNumber) {
        super(orderId,orderDate);
        this.trackingNumber=trackingNumber;
    }
    @Override
    String getOrderStatus() {
        return "Shipped";
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Tracking Number: " + trackingNumber);
    }

    

}
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;

    DeliveredOrder(String deliveryDate, int orderId,String orderDate, int trackingNumber) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Delivered";
    }
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Delivery Date: " + deliveryDate);
    }


}
public class Order{
    public static void main(String[] args) {
        Order1 o = new Order1(101,"23 SEPTEMBER");
        ShippedOrder o2 = new ShippedOrder(101,"23 SEPTEMBER",100897);
        DeliveredOrder o3 = new DeliveredOrder("27 SEPTEMBER",101,"23 SEPTEMBER",100897);

        o.displayStatus();
        System.out.println();
        o2.displayStatus();
        System.out.println();
        o3.displayStatus();
        System.out.println();
    }
}
