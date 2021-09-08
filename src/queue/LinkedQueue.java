package queue;

public class LinkedQueue<E> {
    Node<E> head;
    Node<E> tail;
    private int size;


    public void push(E elem) {
        var curNode = new Node<>(null, elem);
        if (head == null) head = curNode;
        else tail.previous = curNode;
        tail = curNode;
        size++;
    }

    public E pop() {
        var toRemove = head;
        if (head == tail) head = tail = null;
        else head = head.previous;
        size--;
        return toRemove.value;
    }

    public E peek() {
        return (head == null) ? null : head.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
