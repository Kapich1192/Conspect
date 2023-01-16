package org.example.Java.Algo.struct.list.linkedList.task2;

public class Node {
    private String info = null;
    private Node next = null;
    private Node last = null;

    public Node(){}
    public Node(String info) {
        this.info = info;
    }

    public void add(String info) {

        if (this.info == null) {
            this.info = info;
        } else {
            Node temp = this;
            Node el = new Node();
            el.info = info;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = el;
            el.last = temp;
        }

    }

    public String get(int index) {
        Node temp = this;
        int cur = 0;
        while (temp.next != null) {
            temp = temp.next;
            cur++;
            if(cur == index)
                return temp.info;
        }
        return info;
    }

    public int size(){
        Node temp = this;
        int len = 0;
        if (this.info == null)
            return 0;
        else len++;

        while (temp.next != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    public void set(int index, String info){
        Node temp = this;
        Node el = new Node();
        el.info = info;
        int cur = 0;
        while (temp.next != null) {
            if(cur == index) {
                el.last = temp.last;
                temp.last.next = el;
                el.next = temp.next;
                break;
            }
            temp = temp.next;
            cur++;

        }

    }

    public boolean isEmpty() {
        if(info == null)
            return true;
        else
            return false;

    }

}
