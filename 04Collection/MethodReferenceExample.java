import java.util.*;

public class MethodReferenceExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Subrajeet", "Vipin", "Sandeep", "Sajan");
    //List<String> uNames = names.stream().map(name -> name.toUpperCase()).toList();
    List<String> uNames = names.stream().map(String::toUpperCase).toList();
    //System.out.println(uNames);
    uNames.forEach(System.out::println);
  }
}
