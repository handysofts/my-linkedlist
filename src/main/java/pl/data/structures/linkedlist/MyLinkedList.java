package pl.data.structures.linkedlist;

import java.util.Objects;

/**
 * Created by Vasif Mustafayev on 2018-09-01 00:00
 * vmustafayev@gmail.com
 */

public class MyLinkedList<T> {

    private Node<T> head;

    MyLinkedList() {
        head = new Node<>();
    }

    void add(T data) {
        Node<T> item = new Node<>(data);

        Node<T> lastItem = head;
        while (lastItem.getNext() != null)
            lastItem = lastItem.getNext();

        lastItem.setNext(item);
    }

    void add(T data, int index) {
        Node<T> item = new Node<>(data);

        Node<T> prevItem = head;
        for (int i = 0; i < index; i++) {
            prevItem = prevItem.getNext();
        }
        item.setNext(prevItem.getNext());
        prevItem.setNext(item);
    }

    void remove(int index) {
        Node<T> prevItem = head;
        for (int i = 0; i < index; i++) {
            prevItem = prevItem.getNext();
        }
        prevItem.setNext(prevItem.getNext().getNext());
    }

    void reverse() {
        if (isEmpty())
            return;

        Node<T> current = head.getNext();
        Node<T> prev = null;
        while (current.getNext() != null){
            Node<T> next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        current.setNext(prev);
        head.setNext(current);
    }

    void reverseByRecursive() {
        if (isEmpty())
            return;
        reverseByRecursive(head.getNext());
    }
    private void reverseByRecursive(Node<T> n) {
        if (n.getNext() == null){
            head.setNext(n);
            return;
        }

        reverseByRecursive(n.getNext());

        Node<T> next = n.getNext();
        n.setNext(null);
        next.setNext(n);
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "[]";

        StringBuilder sb = new StringBuilder();
        Node<T> item = head.getNext();
        while (item.getNext() != null) {
            sb.append(item.getData());
            sb.append(", ");

            item = item.getNext();
        }
        sb.append(item.getData());

        return "[" + sb.toString() + "]";
    }

    private boolean isEmpty() {
        return Objects.isNull(head.getData()) && Objects.isNull(head.getNext());
    }
}
