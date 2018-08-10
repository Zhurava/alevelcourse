package com.company.classwork.linkedlist;

public class SinglyLinkedList<E> {

    private Node<E> head;

    public SinglyLinkedList() {
        head = null;
    }


    public void add(E element) {
        Node<E> last = new Node<>(element);
        if (this.head == null) {
            this.head = last;
        } else {
            Node<E> current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = last;
        }

    }

    private final class Node<T> {

        private E value;

        private Node<T> next;
        private int index;

        public Node(E value) {
            this(value, null);
        }

        public Node(E value, Node<T> next) {
            this.value = value;
            this.next = next;
        }


        }
    }




