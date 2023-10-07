package DataTypeAndVariablesExerciese;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // koi bukvi ot azbukata da sudurja troikata//
        // trojka {} {} {} //
        for (char letter1 = 'a'; letter1 <'a' + n; letter1++) {
            for (char letter2 = 'a'; letter2 < 'a' + n; letter2++) {
                for (char letter3 = 'a'; letter3 < 'a' + n; letter3++) {
                    // {a} {a} {a}
                    System.out.printf("%c%c%c%n",letter1,letter2,letter3);
                }
            }
        }
    }
}
