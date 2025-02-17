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

    //Getter and Setter
    System.out.println("The value at index 1 is: " + ls.get(1));
    ls.set(1, "Warner Bros");
    System.out.println("The value at index 1 after setting is: " + ls.get(1));
  }
}
