import java.util.Stack;

public class ReverseAStackUsingRecursion {
    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        reverse(stack);
    }

    public static Stack reverse(Stack<Integer> stack){
        if(stack.size() > 0) {
            int top = stack.pop();
            Stack<Integer> tempStack = reverse(stack);
            return insert(tempStack, top);
        }
        return stack;
    }

    public static Stack insert(Stack<Integer> stack, int val) {
        if(stack.isEmpty()) {
            stack.push(val);
            return stack;
        } else {
            int top = stack.pop();
            insert(stack, val);
            stack.push(top);
            return stack;
        }
    }
}