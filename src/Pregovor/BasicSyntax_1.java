package Pregovor;

import java.util.Scanner;

public class BasicSyntax_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
//        int percentage = 55;
//        double grade = 5.5334;
//        %03d 3 simvola  percentage
//        %.2f grade
        // \n = nov red
        // %n = nov red sprqmo operacionnata sistema
        double number = 10;
        int number2 = 2;
        System.out.printf("%d%.2f\n",number2, number);
    }
}
