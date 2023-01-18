package org.example.Java.Algo.struct.list.arrayList.task1;

public class MyArrayList {
    private int n = 5;
    private String[] info = new String[n];
    private int size = 0;
    public MyArrayList() {

    }

    public void add(String val) {
        if (size < n) {
            info[size] = val;
            size++;
        } else {
            n *= 1.5;
            String[] temp = new String[n];
            for (int i = 0; i < info.length; i++) {
                temp[i] = info[i];
            }
            info = temp;
            info[size] = val;
            size++;
        }
    }

    public void remove(int index) {
        if (index >= size) {
            return;
        } else
        if (index == size - 1) {
            info[index] = null;
            size--;
        } else {
            String temp ;
            for (int i = index; i < size; i++) {
                temp = info[i + 1];
                info[i] = temp;
            }
            size--;

        }
    }

    public void set(int index, String val) {
        info[index] = val;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". --> " + info[i]);
        }
    }

}
