import java.util.LinkedHashSet;
import java.util.Arrays;



public class Problem1{
    //Testing subjects
    public static final LinkedHashSet<String> COLLECTION1 = new LinkedHashSet<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
    public static final LinkedHashSet<String> COLLECTION2 = new LinkedHashSet<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

    public static void main(String[] args){

        // Can't change a constant so we make clones
        LinkedHashSet<String> clone1 = new LinkedHashSet<>(COLLECTION1);
        LinkedHashSet<String> clone2 = new LinkedHashSet<>(COLLECTION2);

        System.out.println("Set 1: "+COLLECTION1);
        System.out.println("Set 2: "+COLLECTION2);

        //Union
        LinkedHashSet<String> union = new LinkedHashSet<>(clone1);
        union.addAll(clone2);
        System.out.println("Union of Both: "+union);

        //Difference 
        LinkedHashSet<String> difference = new LinkedHashSet<>(clone1);
        difference.removeAll(clone2);
        System.out.println("Difference between Set 1 and Set 2: "+difference);


        //Intersection AKA the AND  
        LinkedHashSet<String> intersection = new LinkedHashSet<>(clone1);
        intersection.retainAll(clone2);
        System.out.println("Intersection(Same elements between Set 1 and 2): "+intersection);




    }

}
