import java.util.*;

public class ArrayListExample {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("Subrajeet");
    names.add("Amit");
    names.add("Madook");
    names.remove("Amit");
    names.add("Chavva");
    System.out.println(names);

    System.out.println("Iteration using Iterator Class"); 
    Iterator<String> itr = names.iterator();
    while(itr.hasNext()) {
      System.out.println(itr.next());
    }

    System.out.println("Iteration using for-each loop"); 
    for(String name:names) {
      System.out.println(name);
    }

    System.out.println("Iteration using ListIterator");
    ListIterator<String> lsItr = names.listIterator(names.size());
    while(lsItr.hasPrevious()) {
      String name = lsItr.previous();
      System.out.println(name); 
    }

    System.out.println("Iteration using for loop");
    for(int i=0;i<names.size();++i) {
      System.out.println(names.get(i));
    } 

    System.out.println("Iteration using foreach loop");
    names.forEach(a->{
      System.out.println(a);
    });

    //Getter and Setter
    System.out.println("The value at index 1 is: " + names.get(1));
    names.set(1, "Warner Bros");
    System.out.println("The value at index 1 after setting is: " + names.get(1));

    //Sorting
    Collections.sort(names);
    System.out.println("After Sorting: " + names);
    
    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(-34);
    nums.add(-90);
    nums.add(245);
    nums.add(123);

    //Sorting
    System.out.println("Before Sorting: " + nums);
    Collections.sort(nums);
    System.out.println("After Sorting: " + nums);
  }
}
