import java.util.*;

public class ArrayListExample {
  public static void main(String[] args) {
    ArrayList<String> ls = new ArrayList<String>();
    ls.add("Subrajeet");
    ls.add("Amit");
    ls.add("Madook");
    ls.remove("Amit");
    ls.add("Chavva");
    System.out.println(ls);

    // Iteration using Iterator Class
    Iterator<String> itr = ls.iterator();
    while(itr.hasNext()) {
      System.out.println(itr.next());
    }

    // Iteration using for-each loop
    for(String name:ls) {
      System.out.println(name);
    }
  }
}
