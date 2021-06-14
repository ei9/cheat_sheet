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

    public boolean isEmpty() {
        return current == null;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node<E> tmp = current;
        while (tmp.next != null) {
            sb.append(tmp);
            sb.append(", ");
            tmp = tmp.next;
        }
        sb.append(tmp);
        sb.append("]");

        return sb.toString();
    }
}