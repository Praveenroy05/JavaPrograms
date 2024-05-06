package Programs;

public class ThirdHighestNumberInArray {
    // 1st Way
    public static int listOfArray(int[] array) {
        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array[2];

    }

    public static void main(String[] args) {
        int ThirdHighestNumber = listOfArray(new int[]{23, 765, 2, 87, 56});
        System.out.println(ThirdHighestNumber);

        System.out.println("************************");

        int ThirdValue = secondApproach(new int[]{23, 765, 2, 87, 56});
        System.out.println(ThirdValue);

        System.out.println("************************");

        ThirdValue = thirdApproach(new int[]{23, 765, 2, 87, 56});
        System.out.println(ThirdValue);
    }


    // 2nd Approach

    public static int secondApproach(int[] array) {

        if (array.length < 3) {
            return -1;
        }

        int firstValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (firstValue < array[i]) {
                firstValue = array[i];
            }
        }

        int SecondValue = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (SecondValue < array[i] && firstValue > array[i]) {
                SecondValue = array[i];
            }
        }

        int ThirdValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > ThirdValue && array[i] < SecondValue) {
                ThirdValue = array[i];
            }
        }
        return ThirdValue;


    }

    // 3rd Approach

    public static int thirdApproach(int array[]) {

        if (array.length < 3) {
            System.out.println("Invalid Length Of an Array");
            return -1;
        }
            // {12, 15, 10}
        int FirstValue = array[0];

        int SecondValue = Integer.MIN_VALUE, ThirdValue = Integer.MIN_VALUE;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > FirstValue) {
                ThirdValue = SecondValue;
                SecondValue = FirstValue;
                FirstValue = array[i];
            } else if (array[i] > SecondValue) {
                ThirdValue = SecondValue;
                SecondValue = array[i];
            } else if (array[i] > ThirdValue) {
                ThirdValue = array[i];
            }
        }
        return ThirdValue;

    }


}
