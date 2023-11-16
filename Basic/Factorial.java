import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int var = sc.nextInt();
        sc.close();

        int factorial = calculateFactorial(var);
        System.out.println("The factorial of " + var + " is " + factorial);
    }

    public static int calculateFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
