import java.util.*;

public class CollectionsStack {
    public static void main(String args[]) {
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        stack.pop();
        Iterator<String> itr = stack.iterator();
        System.out.println("Elements in Stack:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}