package Day2ExFiles;

//Exercise 3: Total Bill Calculation
//        Scenario: You are developing a restaurant bill calculation application. You need to implement a feature that calculates the total bill amount,
//        including tax and tip.
//        Given : Bill amount = 30, Taxes = 15, Tip  = 10
//        Task: Write a program that calculates the total bill amount by adding the bill amount, tax and tip.
public class RestaurantBill {
    public static void main(String[] args) {
        int result = afterTaxTips(10, 15, true);
        System.out.println(result);
    }
    static int afterTaxTips(int a, int b, boolean Tips) {
        int beforeTips = a + b;
        final int afterTips = 8;
        int sum = 0;
        if (Tips) {
            sum = beforeTips + afterTips;
        } else {
            sum = beforeTips;
        }
        return sum;
    }
}
//        int result = addTaxTip(15 , 10, false);
//        System.out.println("The total restaurant bill after tip and taxes is  " + "$"+result);
//    }
//    static int addTaxTip(int a, int b, boolean tip) {
//        int beforeTip = a + b;
//        final int afterTip = 10;
//        int sum =0;
//        if (tip){
//            sum = beforeTip +afterTip;
//        } else {
//            sum =beforeTip;
//        }
//        return sum;
//    }
//
//}

