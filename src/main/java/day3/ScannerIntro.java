package day3;


import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("limit for count");
        int limit = scanner.nextInt();
        
        for (int i = 0; i <=limit; i++) {
            System.out.print(i + " ");
            
        }
        System.out.print(" ");
        System.out.println("What is your name?");
        String a= scanner.next();

        System.out.println("What is you age?");
        int age= scanner.nextInt();

        System.out.println("Where are you name?");
        String name= scanner.next();


        if(name.contains("![0-9]")) {
            System.out.println("Please provide name in strig ");
        }else{
            System.out.println("Hey Tz");
        }

        System.out.println("My name is " + a + " and my age is " + age + " and I am in " + name +".");
}
}