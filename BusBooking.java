import java.util.Scanner;

public class BusBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int capacity = 40;
        boolean booked = false;
        int filled = 0 ;

        for(int i=0; i<capacity; i++){
        System.out.print("Enter the number of seats to book:");
        int bookSeat = sc.nextInt();
        filled += bookSeat;
        
        if(filled > capacity ){

            System.out.println("Seats are full. No more booking accepted !");
            System.out.println("extra "+(filled -capacity)+" bookings !");
            break;
            
        }
        }
             sc.close();
        }
    }
