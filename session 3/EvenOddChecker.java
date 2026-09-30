// even odd checker program
import java.util.Scanner;   // util is package and scanner is library

public class EvenOddChecker {
    public static void main(String[] args){
        Scanner evenOddScanner = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int num = evenOddScanner.nextInt();
        if(num % 2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        evenOddScanner.close();
        }

    }
