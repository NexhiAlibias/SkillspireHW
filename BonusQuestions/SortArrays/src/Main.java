public class Main {
    public static void main(String[] args) {
        int[][] four = {{1, 4, 7},
                        {2, 5, 8},
                        {3, 6, 9}};
        moveArrays(four);



    }

    public static void moveArrays(int[][] arr) {


       // I focuses on the columns of the sub arrays
        for (int i = 0; i < arr.length; ++i)   {
            // J focuses on the rows of each sub arrays
            for  (int j = 0; j < arr[i].length; ++j) {

                System.out.println(arr[j][i]);
            }
        }

    }
}
