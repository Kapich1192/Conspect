package org.example.syntax.arrays.task2;
/*
* В методе main(String[]) тебе нужно заполнить массив strings значениями.
* Если индекс массива чётный — присвоить значение "Чётный" (ноль — цифра чётная),
*  иначе присвоить "Нечётный".
Вывод текста в консоль в тестировании не участвует.
Требования:
•	В классе Solution должна быть публичная статическая переменная strings т
* ипа String[], проинициализированная массивом размером 5 элементов.
•	Метод main(String[]) должен заполнять массив согласно условию.
* */
public class Main {
    public static void main(String[] args) {
        String[] strings = new String[5];

        for (int i = 0; i < strings.length; i++) {
            if(i % 2 == 0) {
                strings[i] = "Четный";
            } else {
                strings[i] = "Нечетный";
            }
        }
        for (String s:strings) {
            System.out.println(s);
        }
    }
}
