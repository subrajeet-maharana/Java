
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
        } finally {
            br.close();
        }

        // try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) --> Try with Resources
        // Closes the resources automatically
    }
}
