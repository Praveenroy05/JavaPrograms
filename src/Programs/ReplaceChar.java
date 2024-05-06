package Programs;

public class ReplaceChar {


    public static void replaceChar() {
        String str = "calchen";
        System.out.println("String: " + str);
        // replacing character at position 1
        int pos = 0;
        char rep = 'h';
        int pos1 = 1;
        char rep1 = 'y';
        int pos2 = 2;
        char rep2 = 'd';
        String res = str.substring(0, pos) + rep + str.substring(1, pos1) + rep1 + str.substring(2, pos2) + rep2 + str.substring(pos2 + 1);
        System.out.println("String after replacing a character: " + res);

    }

    // Driver code
    public static void main(String args[]) {
        String st = "calchen";
        char str[] = st.toCharArray();
        System.out.println("The modified string is :");
        System.out.println(str);
        replaceChar();
    }
}

