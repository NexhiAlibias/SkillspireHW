public class main {
    public static void main(String[] args) {
        String[] cartoon = {"Avengers", "Black Panther", "Soul", "Coco"};
        int[] nums = {24, 25, 16, 17, 8, 9, 1};
        PrintArr(cartoon);
        System.out.println(addArr(nums));

    }
    public static void PrintArr(String[] arr) {
        for (int i = 0; i < arr.length; i++ ) {
            System.out.println(arr[i]);
        }
    }
    public static int addArr(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = temp + arr[i];
        }
        return temp;
    }
}