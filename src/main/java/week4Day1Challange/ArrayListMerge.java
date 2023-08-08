package week4Day1Challange;

import java.util.ArrayList;

public class ArrayListMerge {
    public static void main(String[] args) {
//Exercise 2: Write a Java program that merges two ArrayLists of integers and prints the resulting merged ArrayList.
        ArrayList<Integer> list= new ArrayList<>();
        list.add(34);
        list.add(30);
        list.add(24);
        list.add(44);

        ArrayList<Integer> list2= new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(1);

        //merge
        ArrayList<Integer> mergeList = mergeLists(list, list2);
//print merge arraylist
        System.out.println("Merged arrarList : "  +mergeList);
        }
        private static ArrayList<Integer> mergeLists(ArrayList<Integer> list, ArrayList<Integer>list2){
        ArrayList<Integer> mergeList = new ArrayList<>(list);
        mergeList.addAll(list2);
        return mergeList;
        }
}
