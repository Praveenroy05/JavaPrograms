package Programs;

public class AllAnagram {

    // Java program to print all the permutations
    // of the given string
    // Function to print all the permutations of str

    static void printPermutn(String str, String ans) {

        // If string is empty
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);// A

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1); //BC

            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }

    // Driver code
    public static void main(String[] args) {
        String s = "ABC";
        printPermutn(s, "");
    }
}


