public class Calculator {
  static int add(int a, int b) {
    return a+b;
  }
  static int subtract(int a, int b) {
    return a-b;
  }
  static int multiply(int a, int b) {
    return a*b;
  }
  static int divide(int a, int b) {
    return a/b;
  }

  public static void main(String[] args) {
    System.out.println("5+8: " + add(5,8));  
    System.out.println("5-8: " + subtract(5,8));  
    System.out.println("5*8: " + multiply(5,8));  
    System.out.println("5/8: " + divide(5,8));  
  }
}

