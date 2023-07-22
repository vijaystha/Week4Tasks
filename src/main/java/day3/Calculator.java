package day3;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        double n1 = scan.nextDouble();

        System.out.println("Enter the second number");
        double n2 = scan.nextDouble();

        System.out.println("The addition of two number is " + (n1+ n2));
        System.out.println("The subtraction of two number is " + (n1 - n2));
        System.out.println("The division of two number is " + (n1/n2));
    }
}
