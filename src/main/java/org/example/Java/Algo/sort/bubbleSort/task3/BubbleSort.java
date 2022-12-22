package org.example.Java.Algo.sort.bubbleSort.task3;
import java.util.ArrayList;
public class BubbleSort {
    public static void main(String[] args) {
        int n = 30;
        int[] num = new int[n];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(i,(int)(Math.random()*100 + 1));
        }

        for(int i = 0; i < n; i++) {
            num[i] = (int)(Math.random() * 100 + 1);
        }
        System.out.println("Array sort");
        printArray(num);
        System.out.println();
        bubbleSort(num);
        printArray(num);

        System.out.println();
        System.out.println("ArrayList sort");
        printList(list);
        System.out.println();
        bubbleSort(list);
        printList(list);
    }

    public static void bubbleSort(int[] array) {
        int temp;
        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort(ArrayList<Integer> list) {
        Integer temp;
        for(int i = 0; i < list.size(); i++) {
            for(int j = i; j < list.size(); j++) {
                if(list.get(i) > list.get(j)) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void printArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print("--> " + num[i] + " ");
        }
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print("--> " + list.get(i) + " ");
        }
    }

}
