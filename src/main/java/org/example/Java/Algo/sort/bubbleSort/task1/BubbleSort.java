package org.example.Algo.sort.bubbleSort.task1;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = new int[30];
        for (int i = 0; i < 30; i++) {
            numbers[i] = (int)((Math.random() * 9));
        }
        for(int i : numbers) {
            System.out.print("-->" + i);
        }
        bubbleSort(numbers);
        System.out.println("\nBubble Sort");
        for (int i:numbers) {
            System.out.print("-->" + i);
        }

    }

    public static void bubbleSort(int[] num) {
        int temp;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
    }
}
