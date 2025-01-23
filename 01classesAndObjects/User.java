import java.util.Scanner;

class User {
  String name = "Default User Name";
  String email = "Default User Email";
  int age = 0;

  public void updateEmail(String updatedEmail) {
    email = updatedEmail;
  }

  public static void main(String[] args) {
    User userOne = new User();
    System.out.println("User Name: " + userOne.name + "\nUser Email: " + userOne.email + "\nUser Age: " + userOne.age);
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter your updated email: ");
  String updatedEmail = sc.nextLine();
  userOne.updateEmail(updatedEmail);
  System.out.println("User Name: " + userOne.name + "\nUser Email: " + userOne.email + "\nUser Age: " + userOne.age);
  }
}
