package Programs;


import java.util.Arrays;

class A {


    public static void main(String[] args) {


        int nums[] = {4, 2, 5, 6, 1};


        //   print array in square of element in sorted order.


        int length = nums.length;

        for (int i = 0; i < length - 1; i++) {

            for (int j = i; j < length; j++) {

                if (nums[i] > nums[j]) {

                    int temp = nums[i];
                    nums[i]= nums[j];
                    nums[j]=temp;


                }
            }

        }

        for(int i=0; i<length; i++){
            nums[i]= nums[i]*nums[i];

        }
        System.out.println(Arrays.toString(nums));
    }
}


