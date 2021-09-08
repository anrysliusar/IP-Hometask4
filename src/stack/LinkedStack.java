package stack;

public class LinkedStack<E> {
    Node<E> top;
    private int size;


    public void push(E elem) {
        top = new Node<>(top, elem);
        size++;
    }

    public E pop() {
        var toRemove = top.value;
        top = top.previous;
        size--;
        return toRemove;
    }

    public E peek() {
        return (top == null) ? null : top.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
