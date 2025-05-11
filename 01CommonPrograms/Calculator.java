import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    double operand1, operand2, result;
    String operator;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    operand1 = sc.nextDouble();

    System.out.print("Enter the second number: ");
    operand2 = sc.nextDouble();

    System.out.print("Enter the operator (+, -, *, /, %): ");
    operator = sc.next();

    switch (operator) {
      case "+":
        result = operand1 + operand2;
        System.out.println("Result: " + result);
        break;
      case "-":
        result = operand1 - operand2;
        System.out.println("Result: " + result);
        break;
      case "*":
        result = operand1 * operand2;
        System.out.println("Result: " + result);
        break;
      case "/":
        if (operand2 != 0) {
          result = operand1 / operand2;
          System.out.println("Result: " + result);
        } else {
          System.out.println("Undefined (Division by zero)");
        }
        break;
      case "%":
        if (operand2 != 0) {
          result = operand1 % operand2;
          System.out.println("Result: " + result);
        } else {
          System.out.println("Undefined (Modulo by zero)");
        }
        break;
      default:
        System.out.println("Invalid Operator");
    }

    sc.close();
  }
}
