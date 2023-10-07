import java.util.Scanner;

public class ImportantStuffFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);
    // %c za char
        char dash = '\\';
        char kavichka = '\'';
        char leaf = '\u8449';
        System.out.println(leaf);

        String firstName = "Miroslav";
        String secondName = "Bonev";
        String fullName = String.format("%s %s", firstName,secondName);
    }

}
