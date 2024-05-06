package Programs;


public class ExExceptionToCountStringAndNumericValues {
    public static void main(String arg[]) {
        // enter string u want here.
        String x[] = {"Raj", "77", "101", "99", "Jio"};
        int cn = 0, cs = 0;

        //print array elements
        System.out.println("Array elements are: ");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println(Integer.MIN_VALUE);

        // scan the string.
        for (int i = 0; i < x.length; i++) {
            try {
                int j = Integer.parseInt(x[i]);
                cn++;
            } catch (NumberFormatException e) {
                cs++;
            }
        }


        // show the numeric and string value after counting.
        System.out.println("Numeric:" + cn + "\nStrings:" + cs);

        numStr();
    }

        public static void numStr() {
            String[] x = {"Raj", "77", "101", "99", "Jio"};

            int stringCount = 0;
            int numberCount = 0;

            // Iterate through the array
            for (String element : x) {
                // Use regular expression to check if the element is a number
                if (element.matches("-?\\d+(\\.\\d+)?")) {
                    // If the element is a number, increment the number count
                    numberCount++;
                } else {
                    // If the element is not a number, increment the string count
                    stringCount++;
                }
            }

            // Print the counts
            System.out.println("Number of Strings: " + stringCount);
            System.out.println("Number of Numbers: " + numberCount);
        }


}

