import java.util.*;

public class Stacks {
    public static void main(String args[]) {
        Stack<String> stack = new Stack<String>();
        stack.push("Awnish");
        stack.push("Shravan");
        stack.push("Ritik");
        stack.push("Naman");
        stack.push("Akshat");
        stack.pop();
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}