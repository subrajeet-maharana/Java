import java.util.*;

public class Vectors {
    public static void main(String args[]) {
        Vector<String> v = new Vector<String>();
        v.add("Subrajeet");
        v.add("Vinay");
        v.add("Aquib");
        v.add("Somdeep");
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}