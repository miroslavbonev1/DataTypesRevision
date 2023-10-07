package DataTypeAndVariablesExerciese;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberSnowballs = Integer.parseInt(scanner.nextLine());
        int highestSnow = Integer.MIN_VALUE;
        int highestTime = Integer.MIN_VALUE;
        int highestQuality = Integer.MIN_VALUE;
        int highestValue = Integer.MIN_VALUE;

         for (int i = 1; i <= numberSnowballs; i++) {
             int snowballSnow = Integer.parseInt(scanner.nextLine());
             int snowballTime = Integer.parseInt(scanner.nextLine());
             int snowballQuality = Integer.parseInt(scanner.nextLine());
             int division = snowballSnow / snowballTime;
             double snowballValue = Math.pow(division,snowballQuality);
             if (snowballValue > highestValue){
                 highestValue = (int)snowballValue;
                 highestQuality = snowballQuality;
                 highestSnow = snowballSnow;
                 highestTime = snowballTime;
             }
         }
        System.out.printf("%d : %d = %d (%d)",highestSnow,highestTime,highestValue,highestQuality);
    }
}
