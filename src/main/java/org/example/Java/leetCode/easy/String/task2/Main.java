package org.example.Java.leetCode.easy.String.task2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/*
* Вам дается строка s и целочисленный массив индексов одинаковой длины. Строки будут перетасованы таким образом, что символ в i-й позиции переместится в индексы[i] в перетасованной строке.
* Верните перетасованную строку.
*
* Пример 1:
* Входные данные: s = "codeleet", индексы = [4,5,6,7,0,2,1,3]
* Вывод: "leetcode"
* Пояснение: Как показано, "codeleet" становится "leetcode" после перетасовки.
*
* Пример 2:
* Входные данные: s = "abc", индексы = [0,1,2]
* Результат: "abc"
* Пояснение: После перетасовки каждый символ остается на своем месте.
*
* */
public class Main {
    public static void main(String[] args) {
        String str_1 = "codeleet";
        String str_2 = "abc";

        int[] ind_1 = {4,5,6,7,0,2,1,3};
        int[] int_2 = {0,1,2};

        String res_1 = "leetcode";
        String res_2 = "abc";

        String ac_1 = restoreString(str_1,ind_1);
        System.out.println("");
        String ac_2 = restoreString(str_2, int_2);
        System.out.println();
        System.out.println("test_1 - " + res_1.equals(ac_1) + " - " + ac_1);
        System.out.println("test_2 - " + res_2.equals(ac_2) + " - " + ac_2);
    }

    public static String restoreString(String s, int[] indices) {
        String result = "";
        char[] cs = s.toCharArray();

        for(int i : indices) {

            System.out.print(cs[i] + " - "+ i + " |");
            result += cs[i];
        }

        return result;
    }



}
