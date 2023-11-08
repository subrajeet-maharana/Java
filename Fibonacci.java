public class Fibonacci {
    static int calculateFibonacci(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        int prev = 0;
        int current = 1;
        int next;
        for (int i = 2; i <= n; i++) {
            next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single integer argument.");
            return;
        }

        try {
            int var = Integer.parseInt(args[0]);
            if (var < 0) {
                System.out.println("Please provide a non-negative integer.");
                return;
            }
            System.out.print("The Fibonacci series is: ");
            for (int i = 0; i < var; i++)
                System.out.print(calculateFibonacci(i) + " ");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer.");
        }
    }
}
