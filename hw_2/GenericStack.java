//My Generic stack :)
public class GenericStack<E> {
    private Object[] array;
    private int size;

    // Default size of 16, why? Because Hexadecimals
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
        return this.array.length;
    }

    public void push(E object) {
        // Check size of array
        if (size == this.getSize()) {
            // Double size of old array
            int newLength = array.length * 2;

            Object[] newList = new Object[newLength];
            System.arraycopy(this.array, 0, newList, 0, this.size);

            this.array = newList;
        }

        this.array[this.size++] = object;
    }

    public Object pop() {
        Object item = new Object();
        try {
            item = this.array[--size];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Stack is empty");
        }
        return item;
    }

    public boolean isEmpty() {
        if (this.size > 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty());

    }

}
