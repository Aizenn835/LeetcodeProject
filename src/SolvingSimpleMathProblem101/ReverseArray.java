package SolvingSimpleMathProblem101;

public class ReverseArray {
     public static void reverseFunction(int[] arr){
           int a = arr.length - 1;
           int[] b = new int[a];

           for(int i = 0; i < a; i++){
                 b[i] = arr[a - i];
           }
           for(int i = 0; i < a; i++){
                arr[i] = b[i];
               System.out.print(arr[i] + " ");
           }
     }
     public static void main() {
         int[] arr = {1 , 2 , 3 ,4 , 5 , 6 , 7 , 8 , 9 , 10};


        reverseFunction(arr);
     }
}
