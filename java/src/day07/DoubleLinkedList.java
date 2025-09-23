package day07;

import java.util.Scanner;

public class DoubleLinkedList {
    public static void main(String[] args) {
        DLinkedList list = new DLinkedList(1);
        list.add(list,3);

    }
}

class DLinkedList{
    DLinkedList prev;
    DLinkedList next;
    Object Node;
    int size;

    DLinkedList(){
        this.prev = null;
        this.next = null;
        this.size = 0;
    }

    DLinkedList(int num){
        this.prev = null;
        this.next = null;
        this.Node = num;
    }

    void add(DLinkedList dll, int num){
        DLinkedList temp =  new DLinkedList();
        temp.next = null;
        temp.prev = dll;
        temp.Node = num;
    }
}