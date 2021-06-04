package bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 0, number2 = 1, number3 ;
        System.out.print("Enter the range : ");
        int range = scanner.nextInt();
        System.out.print("Fibonacci series is : ");
        System.out.print("0, 1, ");
        for (int i = 2;i<range; i++) {
            number3 = number1 + number2 ;
            number1 = number2;
            number2 = number3;
            System.out.print(number3);
            if (i<range-1)
                System.out.print(", ");
        }
    }
}
