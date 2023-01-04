package org.example.Java.Algo.sort.bubbleSort.task4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 30;
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            numbers.add((int)(Math.random()*100));
            num[i] = (int) (Math.random()*100);
        }
        printArray(num);
        bubbleSortArray(num);
        printArray(num);

        System.out.println();

        printList(numbers);
        bubbleSortList(numbers);
        printList(numbers);


    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("--> " + array[i] + " " );
        }
        System.out.println(" ");
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print("--> " + list.get(i) + " ");
        }
        System.out.println(" ");
    }

    public static void bubbleSortArray(int[] numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public static void bubbleSortList(ArrayList<Integer> list) {
        int temp;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if(list.get(i) > list.get(j)) {
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }


}
