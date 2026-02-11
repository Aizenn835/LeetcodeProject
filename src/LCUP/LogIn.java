package LCUP;

import java.util.Scanner;


public class LogIn{
        static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many account: ");
        int count = scanner.nextInt();

        String[] name = new String[count];
        String[] password = new String[count];

        scanner.nextLine();
        for(int i = 0; i < count; i++){
            System.out.print("Enter account username: ");
            name[i] = scanner.nextLine();

            System.out.print("Enter account password: ");
            password[i] = scanner.nextLine();

            System.out.println("====================");
        }
        System.out.println("Log In");
        System.out.println("====================");

        int attempts = 3;

        while(attempts > 0){
            System.out.print("Enter your name: ");
            String username = scanner.nextLine();

            System.out.print("Enter your password: ");
            String userPassword = scanner.nextLine();

            if(isValid(username , userPassword , name , password)){
                System.out.println("Successfully Log In.");
                break;
            }else {
                attempts--;
                System.out.println("=================================");
                System.out.println("Wrong Password Attempts remaining: " + attempts);
                System.out.println("=================================");
            }
        }
        if(attempts == 0){
            System.out.println("Too many attempts account locked!");
        }
        scanner.close();
    }
    static boolean isValid(String username , String userPassword ,
                           String[] name , String[] password){

        for(int i = 0; i < password.length; i++){
            if(username.equals(name[i]) && userPassword.equals(password[i])){
                return true;
            }
        }
        return false;
    }
}