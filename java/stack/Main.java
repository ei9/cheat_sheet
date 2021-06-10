package stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(1);
        stack.push(5);

        for (int i=0 ; i<5 ; i++)
            System.out.println(stack.pop());

        Stack<String> s2 = new Stack<>();
        s2.push("Hello");
        s2.push("world");
        s2.push("!");
        s2.push("This is stack.");
        s2.push("Using relatively slow linked list.");

        for (int i=0 ; i<5 ; i++)
            System.out.println(s2.pop());
    }
}
