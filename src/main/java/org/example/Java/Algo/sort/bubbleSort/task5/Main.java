package org.example.Java.Algo.sort.bubbleSort.task5;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[30];
        for(int i = 0; i < 30; i++) {
            nums[i] = (int) (Math.random()*100);
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print("-->" + nums[i] + " ");
        }
        System.out.println();
        bubbleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print("--> " + nums[i] + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
