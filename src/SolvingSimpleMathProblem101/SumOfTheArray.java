package SolvingSimpleMathProblem101;

public class SumOfTheArray {
     public static int TheSum(int[] arr) {
         int sum = 0;

         for (int i = 0; i < arr.length; i++){
             sum += arr[i];
         }
         return sum;
     }

    static void main() {
        int[] arr =  {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        int result = TheSum(arr);
        System.out.println("The Sum of the array: " + result);
    }
}
