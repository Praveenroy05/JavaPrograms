package Programs;

public class RemoveAllOccuranceOfChars {

    // Function to remove all occurrences of a given character from a string
    public static String removeCharacter(String input, char charToRemove) {
        // Using StringBuilder for efficient string manipulation
        StringBuilder result = new StringBuilder();

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            // Append the character to result if it is not the character to be removed
            if (input.charAt(i) != charToRemove) {
                result.append(input.charAt(i));
            }
        }

        // Convert StringBuilder to String and return the result
        return result.toString();
    }

    public static void main(String[] args) {
        String inputString = "abcde abcdedccee";
        char charToRemove = 'c';

        // Call the function and print the result
        String resultString = removeCharacter(inputString, charToRemove);
        System.out.println("Original String: " + inputString);
        System.out.println("Character to Remove: " + charToRemove);
        System.out.println("Resulting String: " + resultString);
    }
}
