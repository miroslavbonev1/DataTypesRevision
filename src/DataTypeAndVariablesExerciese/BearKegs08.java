package DataTypeAndVariablesExerciese;

import java.util.Scanner;

public class BearKegs08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberKegs = Integer.parseInt(scanner.nextLine()); // broi kegove
        double highestV = Double.MIN_VALUE;
        String highestKeg = "";
        for (int j = 1; j <= numberKegs; j++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double totalV = Math.PI * Math.pow(radius, 2) * height; // Math.pow --> povdigane na stepen!!!!
            if (totalV > highestV) {
                highestV = totalV;
                highestKeg = model;
            }
        }
        System.out.println(highestKeg);
    }
}
