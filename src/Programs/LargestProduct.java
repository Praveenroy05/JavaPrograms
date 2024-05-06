package Programs;

public class LargestProduct {

    public static void largestProduct(int arr[]) {

        int maxProduct = 0;
        int n = arr.length;
        String pairs = "";

        if (n < 2) {
            System.out.println("No product");
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[i]*arr[j] > maxProduct){
                        maxProduct = arr[i] * arr[j];
                        pairs = Integer.toString(arr[i]) +","+ Integer.toString(arr[j]);
                    }
                }
            }
            System.out.println(pairs);

        }
    }

    public static int test(int n){
        {
            int sum=10;
            while(sum>9)
            {
                sum=0;
                while(n>0)
                {

                    sum=sum+ n%10;
                    n=n/10;
                }
                n=sum;

            }

        return sum;

        }
    }

    static int digitSum(int a) {
        if (a < 10) return a;
        a = (a % 10) + digitSum(a / 10);
        return a;
    }

    public static void main(String[] args) {
        largestProduct(new int[]{123,2,3,4,5,6,7,8,9,28});
        System.out.println(maxProduct(new int[]{123,2,3,4,5,6,7,8,9,28}));
        int ans=test(97);
        System.out.println(ans);

        int ans1=digitSum(97);
        System.out.println(ans1);
    }


    // Max Product
    public static String maxProduct(int[] intArray) {
        int maxProduct = 0;
        String pairs = "";
        for (int i = 0; i<intArray.length; i++) {
            for (int j = i+1; j<intArray.length; j++) {
                if (intArray[i]*intArray[j]>maxProduct) {
                    maxProduct = intArray[i]*intArray[j];
                    pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
                }
            }
        }
        return pairs;
    }
}
