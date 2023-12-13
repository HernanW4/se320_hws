public class Question3 {

    // Returns indeces in programming format
    //
    // Starting from 0
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        // Lets do this
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0) { // compareTo = 0 means both elements are the same
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] list = { 3, 4, 5, 1, -3, -5, -1 };

        System.out.println(linearSearch(list, 2));

        System.out.println(linearSearch(list, 5));
    }
}
