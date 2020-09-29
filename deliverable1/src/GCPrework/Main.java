package GCPrework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner JavaInput = new Scanner(System.in);
        System.out.println("Please enter a password: ");
        String password = JavaInput.nextLine();
        boolean uppercase = false;
        boolean lowercase = false;
        int length = password.length();
        if ((length < 7) || (length > 12)) {
            System.out.println("Error");
            System.exit(0);
        }
        if (!password.contains("!")) {
            System.out.println("Error");
            System.exit(0);
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))){
                uppercase = true;
            }
            if (Character.isLowerCase(password.charAt(i))){
                lowercase = true;
            }
        }
        if (uppercase && lowercase){
            System.out.println("Password valid and accepted");
        }
        else{
            System.out.println("Error");
        }
    }
}