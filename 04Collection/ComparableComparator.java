import java.util.*;

class Student implements Comparable<Student> {
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

  public int compareTo(Student other) {
    if (this.cgpa < other.cgpa)
      return 1;
    return -1;
  }
}

public class ComparableComparator {
  public static void main(String[] args) {
    // Comparator<Student> comp = new Comparator<Student>() {
    // public int compare(Student i, Student j) {
    // if (i.cgpa > j.cgpa)
    // return 1;
    // return -1;
    // }
    // };

    // Comparator<Student> comp = (i, j) -> (i.cgpa < j.cgpa) ? 1 : -1;
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
    //Collections.sort(students, comp); //Needs Comprator Implementation
    Collections.sort(students); // Needs implements Comparable
    System.out.println("After Sorting: " + students);
  }
}
