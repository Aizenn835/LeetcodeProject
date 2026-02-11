package SolvingSimpleMathProblem101;

public class Count {
    public static int countNum(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 43 || arr[i] == 44 || arr[i] == 45 ||
                    arr[i] == 46 || arr[i] == 47 || arr[i] == 48) count++;
        }
        return count;
    }

    static void main() {
        int[] arr = {38, 45, 48, 13, 35, 46, 21, 18, 19, 32, 33, 31, 33, 19, 30,
                33, 39, 46, 48, 47, 18, 24, 44, 48, 37, 32, 21, 24, 25, 28};

        int result = countNum(arr);

        System.out.println(result);

    }
}
