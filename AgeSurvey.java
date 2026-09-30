// age survey program

import java.util.Scanner;

public class AgeSurvey {
    public static void main(String[] args){
        Scanner ageScanner = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = ageScanner.nextInt();

        if (age <= 0){
            System.out.println("Invalid age !");
        }
        else if(age <= 12){
            System.out.println("Child");
        }
        else if( age >=13 && age <= 19){
            System.out.println("Teenager");
        }
        else if( age >= 20 && age <= 59){
            System.out.println("Adult");
        }
        else
            System.out.println("Senior Citizen");
        ageScanner.close();
    }   
    }
