import java.util.*;
import java.util.stream.*;

class Student {
  String name;
  int age;
  double score;
  String gradLevel;

  public Student(String name, int age, double score, String gradLevel) {
    this.name = name;
    this.age = age;
    this.score = score;
    this.gradLevel = gradLevel;
  }

  public String toString() {
    return "Name: " + name + " | Age: " + age + " | Score: " + score + " | gradLevel: " + gradLevel;
  }

  public String getGrade(){
    return gradLevel;
  }
}

public class StreamExample {
  public static void main(String[] args) {
    List<Student> students = Arrays.asList(
        new Student("Subrajeet", 17, 98, "Grade 12"),
        new Student("Chiranjibi", 14, 58, "Grade 9"),
        new Student("Hritik", 16, 42, "Grade 10"),
        new Student("Rahul", 17, 73, "Grade 11"),
        new Student("Sneha", 15, 65, "Grade 9"),
        new Student("Priya", 14, 85, "Grade 8"),
        new Student("Aman", 18, 91, "Grade 12"),
        new Student("Ravi", 17, 36, "Grade 11"),
        new Student("Kiran", 16, 79, "Grade 10"),
        new Student("Neha", 15, 83, "Grade 9"),
        new Student("Arjun", 14, 55, "Grade 8"),
        new Student("Ishita", 17, 88, "Grade 11"),
        new Student("Manoj", 16, 61, "Grade 10"),
        new Student("Pooja", 18, 92, "Grade 12"),
        new Student("Dev", 15, 49, "Grade 9"));

    System.out.println("Students with >=80 Marks");
    List<Student> above70 = students.stream().filter(s -> s.score >= 80).collect(Collectors.toList());
    above70.stream().forEach(System.out::println);

    System.out.println("\nStudents Under age 18");
    List<Student> below18 = students.stream().filter(s -> s.age < 18).collect(Collectors.toList());
    below18.stream().forEach(System.out::println);

    List<Student> grade12Studs = students.stream().filter(s -> s.gradLevel.equals("Grade 12"))
        .collect(Collectors.toList());
    double marks = grade12Studs.stream().mapToDouble(s -> s.score).sum();
    System.out.printf("\nAverage Marks Grade 12: %f", marks / grade12Studs.size());

    System.out.println("\nTopper List");
    Comparator<Student> comp = (x, y) -> Double.compare(y.score, x.score);
    Stream<Student> topperList = students.stream().sorted(comp);
    topperList.forEach(System.out::println);

    System.out.println("\nStudents grouped by Grade");
    Map<String, List<Student>> groupByGrades = students.stream().collect(Collectors.groupingBy(Student::getGrade));
    System.out.println(groupByGrades);
  }
}
