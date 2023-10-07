package DataTypeAndVariablesExerciese;

import java.util.Scanner;

public class ElevatorP03Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int courses = 0;
        int peopleLeft = 0;
        while (numberPeople > 0 ){
            if (numberPeople / capacity != 0) {
                courses += numberPeople / capacity;
                numberPeople -= capacity * courses;
            }else {
                courses += 1;
                break;
            }
        }
        System.out.println(courses);
    }
}
