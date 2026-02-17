package LCUP;

import java.util.Scanner;


public class halfTriangle {
    static void main() {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        for(int i = 0; i < n ; i++){
            for(int k = 0; k < n - i - 1; k++){
                System.out.print(" ");
            }
            for(int r = 0; r < (2 * i) + 1; r++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
