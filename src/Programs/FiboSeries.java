package Programs;

public class FiboSeries {

    static int calculateSum(int n, int m)
    {
        if (n <= 0 & m<=0)
            return 0;


        int fibo[]=new int[n+1];
        fibo[1] = 1; fibo[2] = 2;

        // Initialize result
        int sum = fibo[1] + fibo[2];

        if(n==2 | m==2)
            sum = fibo[2];
        for (int i=3; i<=n; i++)
        {
            fibo[i] = fibo[i-1]+fibo[i-2]; // 1, 1, 2, 3, 5
            sum += fibo[i];
        }

        System.out.println(sum);
        int fibo1[]=new int[m+1];
        fibo1[1] = 1; fibo1[2] = 1;

        // Initialize result
     //   int sum1 = fibo1[0] + fibo1[1]; int temp=0;
      //  System.out.println(sum1);
        // Add remaining terms
        int a=0;
        int sum1= fibo1[1] + fibo1[2];
        for (int i=2; i<=m; i++)
        {
            fibo1[i] = fibo1[i-1] + fibo1[i-2];



           // System.out.println(sum1);
            sum1 = sum1 + fibo1[i];


        }

        System.out.println(sum1);

        return sum + sum1;
    }

    // Driver program to test above function
    public static void main(String args[])
    {
        int n = 2, m = 5;
        System.out.println("Sum of Fibonacci" +
                " numbers is : "+ calculateSum(n,m));
    }
}

