public class Problem2 {

    public static void main(String[] args) {

    }

    public static void removeDuplicates(List lst) {
        // requires:
        //      1. lst elements implement the Comparable interface.
        //      2. lst should not be inmutable
        if (lst == null || lst.size() == 0)
            return;
        List copy = new ArrayList(lst);
        Iterator elements = copy.iterator();
        Object pre = elements.next();
        while (elements.hasNext()) {
            Object nex = elements.next();
            if (pre.equals(nex))
                lst.remove(nex);
            else
                pre = nex;
        }
    }
}
