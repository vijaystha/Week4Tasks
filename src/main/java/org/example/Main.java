package org.example;

public class Main {
   public static void main(String[] args) {
      int result = addTwoProduct(4, 4, true);
      System.out.println(result);
   }

   static int addTwoProduct(int a, int b, boolean tip) {
      int beforeTip = a + b;
      final int tipAmount = 10;
      int sum = 0;
      if (tip) {
         sum = beforeTip + tipAmount;
      } else {
         sum = beforeTip;  //+5 if tip not given
      }

      return sum;
   }
}