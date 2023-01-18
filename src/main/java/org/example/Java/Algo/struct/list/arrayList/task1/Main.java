package org.example.Java.Algo.struct.list.arrayList.task1;

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("Hello");
        list.add("My");
        list.add("World");
        list.add("I");
        list.add("learn");
        list.add("creating");
        list.add("dynamic");
        list.add("arrays");

        list.printList();
        System.out.println(list.size());
        list.remove(4);
        list.printList();
        list.remove(0);
        list.printList();
        System.out.println(list.size());

        list.set(2,"You");
        list.printList();
    }
}
