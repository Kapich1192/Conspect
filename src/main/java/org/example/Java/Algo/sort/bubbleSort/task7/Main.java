package org.example.Java.Algo.sort.bubbleSort.task7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add((int)(Math.random() * 100));
        }
        printList(list);
        bubbleSort(list);
        System.out.println();
        printList(list);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print("--> " + list.get(i) + "; ");
        }
    }

    public static void bubbleSort(ArrayList<Integer> list) {
        Integer temp = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if(list.get(i) > list.get(j)) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
