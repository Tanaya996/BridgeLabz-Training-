import java.util.Scanner; 

public class MarketBill{
    public static  void main(String[] args){
        Scanner BillScanner = new Scanner(System.in);
        System.out.println("Enter the number of items purchased");
        int items = BillScanner.nextInt();  
        double total = 0;
        for(int i=0; i<items; i++){  // for(initialize, condition, increment)
            System.out.println("Enter the price of item " + (i+1));
            double price = BillScanner.nextDouble();
            total += price;
        }
        System.out.println("Number of items purchased: " + items);
        System.out.println("Total amount: " + total);
        BillScanner.close();
    }
}