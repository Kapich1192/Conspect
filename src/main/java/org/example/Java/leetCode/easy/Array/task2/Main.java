package org.example.Java.leetCode.easy.Array.task2;

/*
* You are given a large integer represented as an integer array digits,
*  where each digits[i] is the ith digit of the integer.
* The digits are ordered from most significant to least significant in
*  left-to-right order. The large integer does not contain any leading 0's.
* Increment the large integer by one and return the resulting array of digits.
* */
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int[] d = {1,2,3,4,5,6};
        plusOne(d);
    }

    public static int[] plusOne(int[] digits) {
        String temp ="";
        for (int i = 0; i < digits.length ; i++) {
            temp += digits[i];
        }
        BigInteger t = new BigInteger(temp);
        BigInteger one = new BigInteger("1");
        temp = t.add(one).toString();
        char[] ar = temp.toCharArray();
        int[] res = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            res[i] = Integer.parseInt("" + ar[i]);
        }
        return res;
    }
}
