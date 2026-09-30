//Simple calculator program
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner CalcScanner = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int num1 = CalcScanner.nextInt();
        System.out.print("Enter 2nd number:");
        int num2 = CalcScanner.nextInt();
        System.out.println("Enter your choice: 1. Addition 2. Substraction 3.Multiplication 4.Division");
        int choice = CalcScanner.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Addition of two number is: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Substraction of two numbers is :" + (num1 - num2));
                break;  
            case 3:
                System.out.println("Multiplication of two numbers is :" + (num1 * num2));
                break; 
            case 4:
                System.out.println("Division of two numbers is :" + (num1 / num2));
                break; 
            default:
                System.out.println("Invalid choice !");
        }

        CalcScanner.close();
    }
}