import java.util.Scanner;
public class four {
    public static void main(String[] args) {
        
        int costPrice = 129;
        int sellingPrice = 191;

        
        int profit = sellingPrice - costPrice;
        int profitPercentage = (profit / costPrice) * 100;

       
        System.out.println(
            "The Cost Price is INR %.2f and Selling Price is INR %.2f\n" +
            "The Profit is INR %.2f and the Profit Percentage is %.2f%%\n",
            costPrice, sellingPrice, profit, profitPercentage
        );
    }
}


