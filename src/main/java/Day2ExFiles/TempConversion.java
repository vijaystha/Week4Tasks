package Day2ExFiles;

import java.util.Scanner;

//Exercise 1: Temperature Conversion
//        Scenario: You are building a weather application, and you need to implement a feature that converts temperature values from Celsius to Fahrenheit.
//        Given : You can take temperature of your city in Celsisus.
//        Task: Write a program that converts Celsisus to Fahrenheit using the formula (Celsius * 9/5) + 32, and prints the converted temperature.
//// use proper data type for this as we can have decimal value there.
public class TempConversion {
    public static void main(String[] args) {
        System.out.println("Converting degree Celsisus to Farenheit :");
        double Celsius= 10 ;
        System.out.println("Celsius to Farenheit for " + Celsius + "C"+ " would be "+ ((Celsius * 9/5) + 32) + "F");
    }
}
