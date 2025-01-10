package Demo.com;

import java.util.HashMap;

public class RepeatedCharacterCounter {
    public static void main(String[] args) {
        String input = "programming";  // Replace with your string

        // Create a HashMap to store character frequency
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Update the frequency of the character
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
        }

        // Print the characters that have a frequency greater than 1 (repeated characters)
        System.out.println("Repeated characters:");
        for (char key : charCountMap.keySet()) {
            if (charCountMap.get(key) > 1) {
                System.out.println(key + ": " + charCountMap.get(key));
            }
        }
    }
}
