package Programs;

    public class BubbleSort {
        public static void main(String[] args) {
            int[] array = {64, 34, 25, 12, 22, 11, 90};

            System.out.println("Original array:");
            printArray(array);

            // Perform bubble sort
            bubbleSort(array);

            System.out.println("\nSorted array:");
            printArray(array);

            revisedBubbleSort(array);
            printArray(array);
        }

        static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        static void revisedBubbleSort(int[] arr){
            for(int i = 0;i < arr.length; i++){
                boolean isSwapped = false;
                for(int j=0;j < arr.length - 1; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        isSwapped = true;
                    }
                    if(!isSwapped){
                        break;
                    }
                }
            }
        }

        static void printArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }


