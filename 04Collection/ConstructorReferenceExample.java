import java.util.*;

class Student {
  String name;
  int age;

  public Student(String name) {
    this.name = name;
  }

  public String toString() {
    return "(Name: " + name + " & Age: " + age + ")";
  }
}

public class ConstructorReferenceExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Subodh", "Maddie", "Roxy");
    List<Student> students = new ArrayList<>();

    //students = names.stream().map(name -> new Student(name)).toList();
    students = names.stream().map(Student::new).toList();
    System.out.println(students);
  }
}
