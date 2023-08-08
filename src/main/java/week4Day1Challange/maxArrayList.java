package week4Day1Challange;

import java.util.ArrayList;

public class maxArrayList {
    public static void main(String[] args) {


// Exercise 1: Write a Java program that finds the
// maximum element in an ArrayList of integers.
        ArrayList<Integer> num = new ArrayList<>();
        num.add(23);
        num.add(90);
        num.add(18);
        num.add(29);
        num.add(76);
//        finding max
        int max = findMaxNum(num);

        //result
        System.out.println("Maximum number : " + max);
    }
    public static int findMaxNum(ArrayList<Integer>list){
//      if(list== null || list.isEmpty()){
//          try {
//              throw new IllegalAccessException("No empty or null list");
//          } catch (IllegalAccessException e) {
//              throw new RuntimeException(e);
//          }
//      }

      int max= list.get(0); //Assume first element is max

        for(int num: list){
            if(num>max){
                max= num;
            }
        }
return max;
    }
}
