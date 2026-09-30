import java.util.Scanner; 

public class Bag{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int capacity = 12;
        int red =0 ;
        int green =0;
        int yellow =0;
       
        System.out.println("Enter the number of red balls:");
        red = scanner.nextInt();  
        System.out.println("Enter the number of green balls:");
        green = scanner.nextInt();    
        System.out.println("Enter the number of yellow balls:");
        yellow = scanner.nextInt();  

        int total = red + green + yellow;

        if( total > capacity){
            System.out.println("The total number of balls exceeds the capacity of the bag");
        }
        else if(red < green && yellow < total*0.4)
            System.out.println("All the conditions are satisfied");
        else
            System.out.println("All the conditions are not satisfied");

        scanner.close();

    }
}