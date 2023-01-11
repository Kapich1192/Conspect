package org.example.Java.Algo.sort.bubbleSort.task6;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 30;
        int[] nums = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums[i] = (int) (Math.random()*100);
            list.add((int)(Math.random()*100));
        }
        print_array(nums);
        bubble_sort(nums);
        print_array(nums);
        System.out.println();
        print_list(list);
        bubble_sort(list);
        print_list(list);
    }

    public static void print_array(int[] array) {
        for(int el: array) {
            System.out.print("--> " + el +" " );
        }
        System.out.println(" ");
    }

    public static void print_list(ArrayList<Integer> list) {
        for (Integer el : list) {
            System.out.print("--> " + el + " ");
        }
        System.out.println(" ");
    }

    public static void bubble_sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j]=temp;
                }
            }
        }
    }

    public static void bubble_sort(ArrayList<Integer> list) {
        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
}
