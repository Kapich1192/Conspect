package org.example.Java.Algo.struct.list.linkedList.task1;

public class Main {
    public static void main(String[] agrs) {
        Node head  = new Node();
        head.add("Hi");
        head.add(" Hello ");
        head.add("World");
        System.out.println(" --> " + head.size());
        String temp = "";

        for (int i = 0; i < head.size(); i++) {
            temp += head.get(i).info;
        }
        System.out.println(temp);

    }
}
