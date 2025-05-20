import java.util.*;
import java.util.stream.*;

public class OptionalClassExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Subrajeet", "Rajat", "Vishal", "Vinay", "Aquib");
    Optional<String> name = names.stream().filter(str -> str.contains("q")).findFirst();
    // Optional avoids NullPointerException in case nothing is found

    String name = names.stream().filter(str -> str.contains("q")).findFirst().orElse("Not Found");
    System.out.println(name);
  }
}
