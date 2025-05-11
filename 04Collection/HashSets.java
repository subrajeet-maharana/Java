import java.util.*;

public class HashSets {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<String>();
        set.add("Nikhil");
        set.add("Rishav");
        set.add("Somdeep");
        set.add("Subrajeet");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
