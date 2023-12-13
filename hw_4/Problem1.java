import java.util.LinkedHashSet;
import java.util.Arrays;
 
public class Problem1 
    // Testing subjects
    public static final LinkedHashSet<String> COLLECTION1 = new LinkedHashSet<>(
            Arrays.asList"George", "Jim", "John", "Blake", "Kevin", "Michael"));tatic final LinkedHashSet<String> COLLECTION2 = new LinkedHashSet<>(

    
    ic static void mai
    

    LinkedHashSet<String> clone1  = new Lin kedHashSet

    

    

    LinkedHashSet<String> union = new Linked

    System.out.println("Union of Bo

         LinkedHashSet<String> intersection = new LinkedHashSet<>(clone1);
        intersection.retainAll(clone2);
        System.out.println("Intersection(Same elements between Set 1 and 2): " + intersection);

    }

}
