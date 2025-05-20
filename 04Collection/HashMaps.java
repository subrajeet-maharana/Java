import java.util.HashMap;
import java.util.Map;

public class HashMaps {
  public static void main(String[] args) {
    Map<String, Integer> mpp = new HashMap<>();
    mpp.put("Subrajeet", 14);
    mpp.put("Abhishek", 76);
    mpp.put("Vishal", 50);
    System.out.println(mpp);
    mpp.put("Vinay", 8);
    mpp.put("Subrajeet", 34);
    System.out.println(mpp);

    // Traversing For Each Loop
    for (Map.Entry<String, Integer> m : mpp.entrySet()) {
      System.out.println(m.getKey() + ": " + m.getValue());
    }
  }
}
