package Programs;

public class NameShortForm {

    // Program to print the name in short form
// Input: Anand Kumar Hooda
// Output: A.K. Hooda

// Import the Scanner class

        // Define the main method
        public static void main(String[] args) {

            String input =  "Praveen Kumar Roy";
            // Split the name into words by space
            String[] words = input.split(" ");

            // Initialize an empty string for the short name
            String shortName = "";

            // Loop through the words except the last one
            for (int i = 0; i < words.length - 1; i++) {

                // Get the first letter of the word and convert it to uppercase
                char initial = Character.toUpperCase(words[i].charAt(0));

                // Add the initial and a dot to the short name
                shortName += initial + ". ";
            }

            // Get the last word and capitalize the first letter
            String lastName = words[words.length - 1];
            lastName = Character.toUpperCase(lastName.charAt(0))
                    + lastName.substring(1);

            // Add the last name to the short name
            shortName += lastName;

            // Print the short name
            System.out.println("Your name in short form is: " + shortName);
        }
    }


