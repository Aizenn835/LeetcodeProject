package SolvingSimpleMathProblem101;

public class FindTheMinimum {
    public static int getMinimum(int[] arr){
         int min = arr[0];
         for(int i = 0; i < arr.length; i++){
              if(arr[i] < min){
                   min = arr[i];
              }
         }
         return min;
    }

    static void main() {

        int[] arr =  {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        int result = getMinimum(arr);

        System.out.println("The Minumum number in array: " + result);
    }
}
