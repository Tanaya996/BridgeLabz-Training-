// positive negative checker 
import java.util.Scanner;

public class NumChecker {
    public static void main( String[] args )
    {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int num = scanner.nextInt();

       if(num==0){
        System.out.println("The number is zero");
       }
       else if(  num > 0){
        System.out.println("The number is positive");
       }
        else
            System.out.println("The number is negative");
        scanner.close() ;
       } 
   
    }

