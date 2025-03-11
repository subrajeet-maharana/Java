import java.util.Scanner;

class User {
  String name;
  String email;
  int age;
  public static int totalUsers = 0; //only one for the entire class

  User() {
    name = "Default Name";
    email = "Default Email";
    age = 25;
    totalUsers++;
  }

  User(String customName, String customEmail, int customAge) {
    name = customName;
    email = customEmail;
    age = customAge;
    totalUsers++;
  }

  public void updateEmail(String updatedEmail) {
    email = updatedEmail;
  }

  public static void main(String[] args) {
    User userOne = new User();
    System.out.println("User Name: " + userOne.name + "\nUser Email: " + userOne.email + "\nUser Age: " + userOne.age);
    System.out.println("Total Users: " + totalUsers);
    User userTwo = new User("Subrajeet Maharana", "subrajeet.maharana@gmail.com", 24);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your updated email: ");
    String updatedEmail = sc.nextLine();
    userTwo.updateEmail(updatedEmail);
    System.out.println("User Name: " + userTwo.name + "\nUser Email: " + userTwo.email + "\nUser Age: " + userTwo.age);
    System.out.println("Total Users: " + totalUsers);
  }
}
