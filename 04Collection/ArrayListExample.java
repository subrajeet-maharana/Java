import java.util.*;
import java.util.stream.Collectors;

class Student {
  String name;
  int rollNo;
  double cgpa;

  Student(String name, int rollNo, double cgpa) {
    this.name = name;
    this.rollNo = rollNo;
    this.cgpa = cgpa;
  }

  public String toString() {
    return "Name: " + name + " | Roll No: " + rollNo + " | CGPA: " + cgpa + '\n';
  }
}

public class ArrayListExample {

  public static void main(String[] args) {
    // Comparator<Student> comp = new Comparator<Student>() {
    // public int compare(Student i, Student j) {
    // if (i.cgpa > j.cgpa)
    // return 1;
    // return -1;
    // }
    // };

    Comparator<Student> comp = (i, j) -> (i.cgpa < j.cgpa) ? 1 : -1;
    ArrayList<String> names = new ArrayList<String>();
    names.add("Subrajeet");
    names.add("Amit");
    names.add("Madook");
    names.remove("Amit");
    names.add("Chavva");
    System.out.println(names);

    System.out.println("Iteration using Iterator Class");
    Iterator<String> itr = names.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    System.out.println("Iteration using for-each loop");
    for (String name : names) {
      System.out.println(name);
    }

    System.out.println("Iteration using ListIterator");
    ListIterator<String> lsItr = names.listIterator(names.size());
    while (lsItr.hasPrevious()) {
      String name = lsItr.previous();
      System.out.println(name);
    }

    System.out.println("Iteration using for loop");
    for (int i = 0; i < names.size(); ++i) {
      System.out.println(names.get(i));
    }

    System.out.println("Iteration using foreach loop");
    names.forEach(a -> {
      System.out.println(a);
    });

    // Getter and Setter
    System.out.println("The value at index 1 is: " + names.get(1));
    names.set(1, "Warner Bros");
    System.out.println("The value at index 1 after setting is: " + names.get(1));

    // Sorting
    Collections.sort(names);
    System.out.println("After Sorting: " + names);

    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(-34);
    nums.add(-90);
    nums.add(245);
    nums.add(123);

    // Sorting
    System.out.println("Before Sorting: " + nums);
    Collections.sort(nums);
    System.out.println("After Sorting: " + nums);

    // Student List
    Student s1 = new Student("Subrajeet Maharana", 34, 8.22);
    Student s2 = new Student("Hanook Sir", 93, 6.82);
    Student s3 = new Student("Ritik Patidar", 45, 8.02);
    Student s4 = new Student("Akshat Sharma", 05, 7.82);

    ArrayList<Student> students = new ArrayList<Student>();
    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);

    System.out.println("Before Sorting: " + students);
    Collections.sort(students, comp);
    System.out.println("After Sorting: " + students);
    Iterator<Student> studentItr = students.iterator();
    while (studentItr.hasNext()) {
      Student std = (Student) studentItr.next();
      System.out.println("Name: " + std.name + " -- Roll No: " + std.rollNo + " -- CGPA: " + std.cgpa);
    }

  }
}
