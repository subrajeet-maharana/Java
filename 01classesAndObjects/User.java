public class User {
  String name = "Default User Name";
  String email = "Default User Email";
  int age = 0;

  public static void main(String[] args) {
    User userOne = new User();
    System.out.println("User Name: " + userOne.name + "\nUser Email: " + userOne.email + "\nUser Age: " + userOne.age);
  }
}
