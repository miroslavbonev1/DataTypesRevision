package DataTypeAndVariablesExerciese;

import java.util.Scanner;

public class SumDigits02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // vzimane na cifrite na edno chislo nezavisimo kolko e golqmo to//
        int number = Integer.parseInt(scanner.nextLine());
        int number2 = 0;
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        System.out.println(sum);

    }
}
