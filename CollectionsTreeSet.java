import java.util.*;

public class CollectionsTreeSet {
    public static void main(String args[]) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("B");
        ts.add("C");
        ts.add("A");
        ts.add("E");
        ts.add("D");
        System.out.println("The elements in the TreeSet are: " + ts);
    }
}