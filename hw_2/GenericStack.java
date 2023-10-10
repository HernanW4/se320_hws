//My Generic stack :)
public class GenericStack<E> {
    private Object[] array;
    private int size;

    // Default size of 16, why? Because I like Hexadecimals
    private static final int DEFAULT_SIZE = 16;

    public GenericStack() {
        this.array = new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    // Constructor with size
    public GenericStack(Integer length) {
        this.array = new Object[length];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }


    // Add item to stack
    public void push(E item) {
        // Check size of array
        if (size == array.length) {
            // Double size of old array
            int newLength = array.length * 2;

            Object[] newList = new Object[newLength];
            System.arraycopy(array, 0, newList, 0, size);

            array = newList;
        }

        this.array[size++] = item;
    }

    // Removes and returns last item in stack(Top item)
    public Object pop() {
        Object item = new Object();
        try {
            item = array[--size];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Stack is empty");
        }
        return item;
    }

    public boolean isEmpty() {
        if (size > 0) {
            return false;
        }
        return true;
    }

    // See top item of the stack without removing
    public Object peek(){
        Object item = new Object();
        try {
            item = array[size - 1];
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Stack is empty");
        }
        return item;
    }


    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>(3);

        stack.push(1);

        System.out.println(stack.pop());


        System.out.println(stack.peek());

        stack.push(1);

        System.out.println(stack.pop());


    }

}
