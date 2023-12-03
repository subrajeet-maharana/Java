import java.util.*;

public class LinkedLists {
    public static void main(String args[]) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Abhishek");
        al.add("Vishal");
        al.add("Vikas");
        al.add("Rajat");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}