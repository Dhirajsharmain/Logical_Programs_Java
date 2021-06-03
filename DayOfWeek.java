package bridgelabz;

import bridgelabz.utility.LogicalUtility;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        LogicalUtility utility = new LogicalUtility();
        Scanner scanner = new Scanner(System.in);
        int day, month, year, dayValue;

        System.out.print("Enter Day: ");
        day = scanner.nextInt();
        System.out.print("Enter Month: ");
        month = scanner.nextInt();
        System.out.print("Enter Year: ");
        year = scanner.nextInt();

        dayValue = utility.dayOfWeek(day, month, year);

        switch (dayValue) {
            case 0:
                System.out.println(day+"/"+month+"/"+year+" is Sunday");
                break;
            case 1:
                System.out.println(day+"/"+month+"/"+year+" is Monday");
                break;
            case 2:
                System.out.println(day+"/"+month+"/"+year+" is Tuesday");
                break;
            case 3:
                System.out.println(day+"/"+month+"/"+year+" is Wednesday");
                break;
            case 4:
                System.out.println(day+"/"+month+"/"+year+" is Thursday");
                break;
            case 5:
                System.out.println(day+"/"+month+"/"+year+" is Friday");
                break;
            case 6:
                System.out.println(day+"/"+month+"/"+year+" is Saturday");
                break;
        }

    }
}
