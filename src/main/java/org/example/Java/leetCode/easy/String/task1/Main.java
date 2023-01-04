package org.example.Java.leetCode.easy.String.task1;

import java.util.ArrayList;

/*
* Задан действительный (IPv4) IP-адрес, верните измененную версию этого IP-адреса.
* Измененный IP-адрес заменяет каждую точку "." на "[.]".
*
* Пример 1:
* Ввод: адрес = "1.1.1.1"
* Вывод: "1[.]1[.]1[.]1"
*
* Пример 2:
* Ввод: адрес = "255.100.50.0"
* Вывод: "255[.]100[.]50[.]0"
*
* Ограничения:
*
* Указанный адрес является действительным IPv4-адресом.
*
* */
public class Main {
    public static void main(String[] args) {
        String address_1 = "1.1.1.1";
        String address_2 = "255.100.50.0";

        String res_1 = "1[.]1[.]1[.]1";
        String res_2 = "255[.]100[.]50[.]0";

        String ac_1 = defangIPaddr(address_1);
        String ac_2 = defangIPaddr(address_2);


        System.out.println("test1 - " + res_1.equals(ac_1) + " - " + ac_1);
        System.out.println("test2 - " + res_2.equals(ac_2) + " - " + ac_2);
    }

    public static String defangIPaddr(String address) {
        String result = "";
        char[] buf = address.toCharArray();
        for(char c : buf) {
            if(c != '.') {
                result += c;
            } else {
                result +="[.]";
            }
        }
        return result;
    }
}
