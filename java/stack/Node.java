package stack;

class Node<E> {
    E data;
    Node<E> next;

    public Node(E e) {
        data = e;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
