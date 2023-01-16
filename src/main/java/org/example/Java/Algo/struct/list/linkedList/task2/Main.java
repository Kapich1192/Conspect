package org.example.Java.Algo.struct.list.linkedList.task2;

public class Main {
    public static void main(String[] args) {
        Node head = new Node();
        head.add("Hello");
        head.add("My");
        head.add("World");
        head.add("!!!");

        System.out.println("len = " + head.size());
        System.out.println("1.--> " + head.get(0));
        System.out.println("2.--> " + head.get(1));
        System.out.println("3.--> " + head.get(2));
        System.out.println("4.--> " + head.get(3));

        head.set(1,"Your");

        System.out.println("len = " + head.size());
        System.out.println("1.--> " + head.get(0));
        System.out.println("2.--> " + head.get(1));
        System.out.println("3.--> " + head.get(2));
        System.out.println("4.--> " + head.get(3));
        System.out.println("REMOVE");
    }

}
