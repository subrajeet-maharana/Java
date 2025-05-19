
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DuckingException {

    public static String readCsvHeader(String filePath) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filePath));
        String content = in.readLine();
        return content;
    }

    public static void main(String[] args) {
        try {
            readCsvHeader("sample.csv");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
