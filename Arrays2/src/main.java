import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] nums = {6, 8, 24, 28};
        int[] nums2 = {5,4,6,7};
        AverageArr(nums);
        AverageArr(nums2);
        System.out.println(AverageArr(nums) + " " + AverageArr(nums2));


    }
    public static double AverageArr(int[] arr) {
        double sum = 0;
        for ( int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = sum / arr.length;
        return average;
    }
}