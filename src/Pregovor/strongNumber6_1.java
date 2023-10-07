package Pregovor;

import java.util.Scanner;

public class strongNumber6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (number>0) {
            int digit = number % 10;
            for (int i = digit; i <= number; i--) {
                sum+= i;

            }
        }
    }
}
