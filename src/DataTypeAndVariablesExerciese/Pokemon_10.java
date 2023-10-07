package DataTypeAndVariablesExerciese;

import java.util.Scanner;

public class Pokemon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine()); //N
        int distance = Integer.parseInt(scanner.nextLine()); // M
        int factor = Integer.parseInt(scanner.nextLine()); // Y
        int countPoked = 0; // count Pokes on target
        int startPower = power;
        while (power >= distance){
            power -= distance;
            countPoked++;
            if ( power == startPower / 2){
                if (factor != 0) { // cqlo na cqlo chislo = celochislen rezultat
                    power /= factor; // delenie na 0 ne e vuzmojno v programiraneto !!!
                }
            }
        }
        System.out.println(power);
        System.out.println(countPoked);
    }
}
