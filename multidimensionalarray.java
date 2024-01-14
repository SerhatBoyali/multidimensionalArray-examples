import java.util.Arrays;

public class multidimensionalarray {

    public static void main(String[] args) {
        int [][] matrix = new int [3][4];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;

        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 7;
        matrix[1][3] = 8;

        matrix[2][0] = 9;
        matrix[2][1] = 10;
        matrix[2][2] = 11;
        matrix[2][3] = 12;

        System.out.println("Output of example 1:");
        System.out.println(Arrays.deepToString(matrix));

        // In this example, the deepToString() method is used to convert the 2D array named twoDArray into a string.
        // This method provides a readable representation of nested arrays, making it useful for debugging or reporting the array in a human-readable format.
        
        int arr[][] = {{2,4,6},{31,55}};  // [][] : multidimensional array definition
        System.out.println("Output of example 2:");
        System.out.println(Arrays.deepToString(arr));
        int sum = 0;
        for(int [] w : arr){
            for(int k : w){
                sum = sum + k;
            }
        }
        System.out.println("Output of example 3:");
        System.out.println(sum);
        // This algorithm gives us the sum of the values ​​in the arr array.

        int brr[][] = {{2,3,5},{35,75}};
        int toplam = 0;
        for(int[] w : brr){
            toplam = toplam + w.length; // : Adds the length of each row (w.length) to the sum. Here, w.length retrieves the number of elements in each row, and the total is accumulated in the toplam variable.
        }
        System.out.println("Output of example 4:");
        System.out.println(toplam);
        int idx = 0;
        int crr[] = new int[toplam];
        for(int[] w : brr){
            for (int k : w){
                crr[idx] = k;
                idx++;
        // I converted a multidimensional array into a one-dimensional array.
            }
        }
        System.out.println("Output of example 5:");
        System.out.println(Arrays.toString(crr));

        int[][] drr = {{3,7,9},{93,109}};
        int maxElement = drr[0][0];
        int minElemend = drr[0][0];

        for(int[] w : drr){
            for(int k : w){
 // These two lines are used to update the maxElement and minElemend variables during iteration through a loop or traversal of an array.
 // At each step, they compare the encountered value with the current maximum and minimum values stored in the variables.               
            maxElement = Math.max(maxElement,k); 
            minElemend = Math.min(minElemend,k);
// Math.max and Math.min are two utility functions in Java's Math class. These functions are used to select the larger (max) and smaller (min) of two numbers, respectively.
            }
        }
        System.out.println("Output of example 6:");
        System.out.println(maxElement);
        System.out.println(minElemend);
        System.out.println(maxElement+minElemend);

        //@SerhatBoyali
    }
}