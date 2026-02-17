package LCUP;

public class reverseLCUP {
    public static void reverseNumbers(int[] arr){
      int a = arr.length - 1;
      int[] b = new int[a];

      for(int i = 0; i < a; i++){
         b[i] = arr[a - 1];
      }
      for(int i = 0; i < a; i++){
          arr[i] = b[i];
          System.out.println(arr[i] + " ");
      }
    }
    static void main(String[] args) {
        int[] arr = {1, 2 ,3 , 4 , 5 , 6 , 7};
        reverseNumbers(arr);

    }
}



