package stack;

/*
 * Implement stack using linked list.
 */
class Stack<E> {

    Node<E> current = null;

    public void push(E e) {
        Node<E> n = new Node<>(e);
        n.next = current;
        current = n;
    }

    public Node<E> pop() {
        Node<E> n = current;
        current = current.next;
        return n;
    }
}