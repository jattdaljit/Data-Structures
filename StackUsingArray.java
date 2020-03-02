class StackImpl  implements  Stack{
    int length = 10;
    int curr = -1;
    Object[] array = new Object[length];

    @Override
    public void push(Object item) {
        if(curr >= array.length - 1){
            System.out.println("Stack is full");
            return;
        } else {
            array[++curr] = item;
        }
    }

    @Override
    public Object pop() {
        if(isEmpty()) {
            System.out.println("Nothing to pop");
            return null;
        } else {
            return array[curr--];
        }
    }

    @Override
    public Object peek() {
        if(isEmpty()) {
            System.out.println("Nothing to peek");
            return null;
        } else {
            return array[curr];
        }
    }

    @Override
    public boolean isEmpty() {
        return curr == -1;
    }
}

public class StackUsingArray{
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}




interface Stack<E> {
    void push(E item);
    E pop();
    E peek();
    boolean isEmpty();
}