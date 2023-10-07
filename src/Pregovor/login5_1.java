package Pregovor;

import java.util.Scanner;

public class login5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String reversedString = "";
         for (int i = username.length()- 1; i >= 0; i--) {
             reversedString += username.charAt(i);
         }
        System.out.println(reversedString);
    }
}
