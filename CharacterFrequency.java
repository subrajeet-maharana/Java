import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Map<Character, Integer> characterCounts = countCharacterFrequencies(input);

        for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
            char character = entry.getKey();
            int frequency = entry.getValue();

            if (character != ' ') {
                System.out.println(character + " - " + frequency);
            }
        }
    }

    public static Map<Character, Integer> countCharacterFrequencies(String input) {
        Map<Character, Integer> characterCounts = new HashMap<>();

        for (char character : input.toCharArray()) {
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
            } else {
                characterCounts.put(character, 1);
            }
        }

        return characterCounts;
    }
}
