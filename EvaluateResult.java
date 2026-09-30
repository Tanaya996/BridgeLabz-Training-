import java.util.Scanner;

public class EvaluateResult {
    public static void main(String[] args){
        Scanner ResultScanner = new Scanner(System.in);
        System.out.println("Enter your marks of AI :");
        int subj1 = ResultScanner.nextInt();
        System.out.println("Enter your makrs of ML:");
        int subj2 = ResultScanner.nextInt();

        if (subj1 >= 40 && subj2 >= 40){
            System.out.println("You are Passed !");
        }
        else{
            System.out.println("You are Failed !");
        }
        ResultScanner.close();
        }
    }
