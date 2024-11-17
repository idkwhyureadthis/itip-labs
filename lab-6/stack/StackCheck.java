package stack;
public class StackCheck{
    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack.pop());
    }
}



