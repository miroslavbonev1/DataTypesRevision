package DataTypeAndVariablesExerciese;

import java.util.Scanner;

public class SpiceMustFlow09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine()); // purvi den koeto subirame
        int days = 0;
        int total = 0; // obshta stoinost na subranite podravki
        while (startingYield>=100){
            days ++;
            int spicePerDay = startingYield - 26;
            total += spicePerDay;

            startingYield-=10;
        }
        total -= 26;
        if (total < 0 ){
            total = 0;
        }
        System.out.println(days);
        System.out.println(total);
    }
}
