package com.jlp.leetcode.datastuc;

import java.util.Collection;
import java.util.Iterator;

public class MyQueue<T> {

    Node<T> head;
    Node<T> tail;

    class Node<T> {
        Node(T data) {
            this.data = data;
        }
        T data;
        Node next;
        Node pre;
    }

    public boolean offer(T data) {
        Node<T> o = new Node<T>(data);
        //空队列
        if (null == tail) {
            head = o;
            tail = o;
            //非空队列
        } else {
            tail.next = o;
            o.pre = tail;
            tail = o;
        }
        return false;
    }

    public Node<T> pull() {
        if (tail == head) {
            tail = null;
        }
        Node<T> h = head;
        head.pre = null;
        head = head.next;
        return h;
    }


    public int size() {
        if (isEmpty()) {
            return 0;
        }
        int size = 1;
        Node tempHead = head;
        while (tempHead != tail) {
            tempHead = tempHead.next;
            size++;
        }
        return size;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public boolean contains(T o) {
        Node tempTail = tail;
        while (tempTail != null) {
           if(tempTail.data.equals(o)){
               return true;
           }
            tempTail = tempTail.pre;
        }
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public boolean add(Object o) {
        return false;
    }


    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public void clear() {

    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }


    public Object remove() {
        return null;
    }

    public Object poll() {
        return null;
    }

    public Object element() {
        return null;
    }

    public Object peek() {
        return null;
    }

    @Override
    public String toString() {
        Node tempTail = tail;
        StringBuilder sb = new StringBuilder();
        while (tempTail != null) {
            sb.append(" <- ");
            sb.append(tempTail.data);
            tempTail = tempTail.pre;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MyQueue<Integer> integerMyQueue = new MyQueue<Integer>();
        integerMyQueue.offer(10);
        integerMyQueue.offer(20);
        integerMyQueue.offer(2);
        integerMyQueue.offer(21);
        integerMyQueue.offer(22);
        integerMyQueue.offer(32);
        integerMyQueue.pull();
        integerMyQueue.pull();
        System.out.println(integerMyQueue);
        System.out.println(integerMyQueue.contains(10));
        System.out.println(integerMyQueue.contains(22));
        System.out.println(integerMyQueue.contains(32));
        System.out.println(integerMyQueue.contains(2));

    }

}
