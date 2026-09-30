import java.util.Scanner;

public class OrderBill {

    public static void main(String[] args) {

        Scanner orderscanner = new Scanner(System.in);

        int bill = 0;
        String orderMore;

        do {

            System.out.println("\n1. Pizza  Rs. 450");
            System.out.println("2. Burger Rs. 200");
            System.out.println("3. Pasta  Rs. 300");
            System.out.println("4. Exit");

            System.out.println("Enter your choice:");
            int choice = orderscanner.nextInt();

            switch (choice) {

                case 1:
                    bill += 450;
                    System.out.println("Pizza added.");
                    break;

                case 2:
                    bill += 200;
                    System.out.println("Burger added.");
                    break;

                case 3:
                    bill += 300;
                    System.out.println("Pasta added.");
                    break;

                case 4:
                    System.out.println("Thank you!");
                    orderMore = "n";
                    continue;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            System.out.println("Current bill: Rs. " + bill);

            System.out.println("Do you want to order more (y/n)?");
            orderMore = orderscanner.next();

        } while (orderMore.equalsIgnoreCase("y"));

        System.out.println("\nThe total bill is: Rs. " + bill);

        orderscanner.close();
    }
}