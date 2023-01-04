package org.example.Java.Algo.struct.list.linkedList.task1;

public class Node {
    String info = null;
    Node last = null;
    Node next = null;

    public Node() {

    }

    public void add (String info) {
        if (this.info == null)
            this.info = info;
        else {
            if (next == null){
                Node temp = new Node();
                next = temp;
                temp.info = info;
                temp.last = this;
            } else {
                Node temp = next;
                while (temp.next != null) {
                    temp = temp.next;
                }
                Node tt = new Node();
                tt.last = temp;
                temp.next = tt;
                tt.info = info;
            }
        }
    }

    public Node get(int index) {
        Node temp = this;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int size() {
        int len = 1;
        Node tmp = this;
        while(tmp.next != null) {
            tmp = tmp.next;
            len++;
        }
        return len;
    }

}
