import java.util.Scanner;

public class SeatArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();

        int[][] seats = new int[rows][col];

        System.out.println("The Seating arrangement is:");

        for (int i = 0; i < rows; i++) {
            char rowLabel = (char) ('A' + i);
            for (int j = 0; j < col; j++) {
                System.out.print(rowLabel + "" + j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}