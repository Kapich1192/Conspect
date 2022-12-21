package org.example.syntax.arrays.task3;
/*
* Реализуй метод main(String[]), который меняет знак элемента
* массива array на противоположный, если значение этого элемента чётное.
Требования:
•	Реализуй метод main(String[]) согласно условию.
*
* */
public class Main {
    public static void main(String[] args) {
        int array[] = {-1,2,6,-5,7};

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0)
                array[i] *=-1;
        }

        for (int i : array) {
            System.out.println("--> " + i);
        }
    }
}
