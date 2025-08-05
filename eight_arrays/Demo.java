package eight_arrays;

public class Demo {

    public static void main(String[] args) {
        // datatype[] arrayName = new datatype[size];
        int[] nums = new int[5];
        String[] names = new String[3];

        // store values inside array
        nums[0] = 10;
        nums[1] = 20;
        nums[3] = 40;

        // reassign values
        nums[0] = 100;

        // index range is out 
        // nums[10] = 100;

        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;

        System.err.println(nums[0]);
        System.err.println(nums[1]);

        // use length on arrays to get the no of elements 
        System.out.println("Length Of Nums: "+(nums.length));
        System.out.println("Length Of Names: "+(names.length));

        // access all elements inside an array using for loop
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Element: "+nums[i]);
        }

        // create array
        int[] numbers = {1,2,3,4,5};
        // access all elements inside an array using for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element: "+numbers[i]);
        }

        int[] num = {1,2,3,4,5};
        int sum = 0;
        int avg = 0;
        // Calculate sum of all individual numbers inside this array
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + num[i]; // 0+1+2+3+4+5 --> 15
            // calculate avg 
            avg = sum / num.length;
        }
        System.out.println("Sum Of All Numbers: "+sum);
        System.out.println("Average Of All Numbers: "+avg);

        


    }
}