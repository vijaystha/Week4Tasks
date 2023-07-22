package Day2ExFiles;
//    Exercise 2: Currency Converter
//    Scenario: You are developing a currency converter application, and you need to implement a feature that converts a given amount in one currency to another currency.
//    Given : USD value = 10
//    Task: Write a program that converts currency to another currency based on the exchange rate. The exchange rate should be stored as a constant variable.
//    Print the converted amount.
////you can convert USD-Rupees and use proper data type
public class Currency {
public static void main(String[] args) {
final double exchangeRate= 132;
double USD =10;

    System.out.println("Exchange rate of " + USD +"$" + " to Nrs. is " + exchangeRate * USD + "Nrs");
}
}
