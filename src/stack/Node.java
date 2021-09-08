package stack;

public class Node<E> {
    Node<E> previous;
    E value;

    public Node(Node<E> previous, E value) {
        this.previous = previous;
        this.value = value;
    }
}

