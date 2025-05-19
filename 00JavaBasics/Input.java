
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Enter the value: ");
        try {
            int value = Integer.parseInt(br.readLine());
            System.out.println("Value: " + value);
        } catch (IOException e) {
            System.out.println("Not able to parse Int, Error: " + e);
        }

        System.out.println("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        System.out.println("Value: " + val);
    }
}
