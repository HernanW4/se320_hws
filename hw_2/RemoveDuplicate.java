import java.util.ArrayList;
import java.util.HashMap;


public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(24);
        list.add(14);
        list.add(42);
        list.add(25);

        ArrayList<Integer> newList = removeDuplicates(list);

        System.out.println(newList);

    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        // To keep track of repeated elements.
        // Item of list will be keys 
        HashMap<E, Integer> map = new HashMap<>();

        ArrayList<E> newList = new ArrayList<>();

        for(E item: list){
            if (!map.containsKey(item)){
                map.put(item, 1); // Values will start at one 
                newList.add(item);
            }
            else{
                map.put(item, map.get(item) + 1); // Add 1 if already exist
            }
        }

        return newList;

    }
     

}
