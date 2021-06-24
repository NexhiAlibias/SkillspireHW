public class Main {
    public static void main(String[] args) {
        int[][] four = {{1, 4, 7},
                        {2, 5, 8},
                        {3, 6, 9}};
        moveArrays(four);



    }

    public static void moveArrays(int[][] arr) {


       // Row focuses on the columns of the sub arrays
        for (int row = 0; row < arr.length; ++row)   {
            // col focuses on the rows of each sub arrays
            for  (int col = 0; col < arr[row].length; ++col) {

                System.out.println(arr[col][row]);
            }
        }

    }
}
