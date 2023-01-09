package org.example.Java.Algo.nod.evclid.task1;

public class Main {
    public static void main(String[] args) {

    }

    public static int nodEvclid(int a, int b) {
        if (a == b)return a;
        int c = a % b;
        return nodEvclid(b,c);
    }
}
