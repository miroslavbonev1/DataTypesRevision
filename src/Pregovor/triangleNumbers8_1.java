package Pregovor;

import java.util.Scanner;

public class triangleNumbers8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int numberTimes = number;
         for (int i = 1; i <= number; i++) {
              for (int j = 1; j <= i; j++) {
              numberTimes = j;
              }
             System.out.print(numberTimes + "");
             System.out.println();
         }
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
