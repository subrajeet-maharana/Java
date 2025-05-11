import java.util.Scanner;

public class PrimeOrComposite {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int var = sc.nextInt();
    sc.close();

    if (isPrime(var)) {
      System.out.println(var + " is Prime");
    } else {
      System.out.println(var + " is Composite");
    }
  }

  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
