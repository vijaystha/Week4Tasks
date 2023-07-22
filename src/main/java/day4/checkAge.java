package day4;

import java.util.Scanner;

public class checkAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the currentYear : ");
        int currentYear = scan.nextInt();

        System.out.println("Enter the birthYear : ");
        int birthYear = scan.nextInt();

        int currentAge = currentYear - birthYear;
        System.out.println("Your current age is : " + currentAge);

        if (currentAge > 0 && currentAge <= 13) {
            System.out.println("You are a child");
        } else if
        (currentAge > 13 && currentAge <= 30) {
            System.out.println("You are young");
        } else if (currentAge > 30 && currentAge <= 50) {
            System.out.println("You are mid-age");
        } else if (currentAge > 50 && currentAge <= 100) {
            System.out.println("You are old");
            {
                System.out.println("Age Range is not valid");
            }
        }
    }
}

