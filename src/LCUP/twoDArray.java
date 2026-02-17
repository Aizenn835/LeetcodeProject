package LCUP;

import java.util.Scanner;

public class twoDArray {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[2][3];
        int sum = 0;

        for(int rows = 0; rows < arr.length; rows++){
            for(int col = 0; col < arr[rows].length; col++){
                System.out.printf("Enter number[%d][%d]: ", rows , col );
                arr[rows][col] = scanner.nextInt();
                if((rows + col) % 2 == 0){
                    sum+= arr[rows][col];
                }

            }
        }
        System.out.println("Output: ");
        for(int rows = 0; rows < arr.length; rows++){
            for(int col = 0; col < arr[rows].length; col++){
                System.out.printf("Numbers[%d][%d]: %d%n" ,rows ,col , arr[rows][col]);
            }
        }
        System.out.println("Total sum of even numbers in index: " + sum);
    }
}
