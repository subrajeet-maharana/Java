
import java.util.Scanner;

class InvalidEmailException extends RuntimeException {

    public InvalidEmailException(String message) {
        super(message);
    }
}

public class CustomException {

    public static boolean validateEmail(String email) throws InvalidEmailException {
        if (email == null || email.isEmpty() || !email.contains("@")) {
            throw new InvalidEmailException("Bhai Sahab email shi nhi hai!!");
        }
        System.out.println("Valid Email: " + email);
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email address.");
        String inputEmail = sc.nextLine();

        try {
            validateEmail(inputEmail);
        } catch (InvalidEmailException e) {
            System.out.println("Error Bhaisahab: " + e);
        }
    }
}
