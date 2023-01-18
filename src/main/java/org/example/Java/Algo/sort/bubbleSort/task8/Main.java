package org.example.Java.Algo.sort.bubbleSort.task8;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 30;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random()*100));
        }

        printList(list);
        bubbleSort(list);
        printList(list);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size();i++) {
            System.out.print("--> " + list.get(i) + "; ");
        }
        System.out.println("");
    }

    public static void bubbleSort(ArrayList<Integer> list) {
        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
