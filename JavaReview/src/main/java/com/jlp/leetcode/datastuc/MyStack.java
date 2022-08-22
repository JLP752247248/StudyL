package com.jlp.leetcode.datastuc;

public class MyStack<T> {


    class Node<T> {
        Node(T data) {
            this.data = data;
        }

        T data;
        Node<T> next;
        Node<T> pre;
    }

    //头指针
    Node<T> head;
    int size;


    public boolean isEmpty() {
        return head == null;
    }

    public int deep() {
        return size;
    }

    public T push(T data) {
        Node<T> node = new Node(data);
        if (!isEmpty()) {
            node.next = head;
        }
        head = node;
        return data;
    }

    public T pop() {

        Node<T> ret = head;
        if (null != head) {
            head = head.next;
        }else{
            return null;
        }
        return ret.data;
    }

    @Override
    public String toString() {
        Node tempHead = head;
        StringBuilder sb = new StringBuilder();
        while (tempHead != null) {
            sb.append(" -> ");
            sb.append(tempHead.data);
            tempHead = tempHead.next;
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        MyStack<String> stringMyStack =new MyStack<String>();

        stringMyStack.push("A");
        stringMyStack.push("B");
        stringMyStack.push("B1");
        System.out.println(stringMyStack);
        stringMyStack.pop();
        System.out.println(stringMyStack);
        stringMyStack.pop();
        System.out.println(stringMyStack);
        stringMyStack.pop();
        System.out.println(stringMyStack);
        stringMyStack.pop();
        System.out.println(stringMyStack);
    }

}
