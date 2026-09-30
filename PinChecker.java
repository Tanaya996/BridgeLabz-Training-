import java.util.Scanner;

public class PinChecker {
    public static void main(String[] args){
        Scanner pinScanner = new Scanner(System.in);
        
        int attempts = 0;
        final int MAX = 3;

    for(int i = MAX; i > attempts; i--){
        System.out.println("Enter your pin:");
        int pin = pinScanner.nextInt();
        if(pin == 1234){
            System.out.print("Correct pin !");
        }
        else if(attempts < MAX - 1){
            System.out.println("Incorrect pin !");
        }
        else{
            System.out.println("The card is blocked !");
        }
        attempts++;
    }
    
    pinScanner.close();
    }
}