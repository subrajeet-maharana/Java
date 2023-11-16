import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binaryString = sc.nextLine();

        int decimalValue = convertBinaryToDecimal(binaryString);

        if (decimalValue != -1) {
            System.out.println("The decimal equivalent is: " + decimalValue);
        } else {
            System.out.println("Incorrect input format. Please enter a valid binary string.");
        }
    }

    public static int convertBinaryToDecimal(String binaryString) {
        int n = binaryString.length();
        int decimalValue = 0;
        int flag = 1;

        for (int i = n - 1, j = 1; i >= 0; i--, j *= 2) {
            char c = binaryString.charAt(i);
            if (c != '0' && c != '1') {
                flag = 0;
                break;
            }
            decimalValue += (c - '0') * j;
        }

        if (flag == 1) {
            return decimalValue;
        } else {
            return -1;
        }
    }
}
