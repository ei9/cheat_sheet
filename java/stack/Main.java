package stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(1);
        stack.push(5);

        System.out.println(stack);

        Stack<String> s2 = new Stack<>();
        s2.push("Hello");
        s2.push("world");
        s2.push("!");
        s2.push("This is stack.");
        s2.push("Using relatively slow linked list.");

        while (!s2.isEmpty())
            System.out.println(s2.pop());
    }
}
