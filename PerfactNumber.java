package bridgelabz;

import java.util.Scanner;

public class PerfactNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Perfect number : ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if ((number % i) == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println(number+" is a Perfect Number");
        } else {
            System.out.println(number+" is not a Perfect Number");
        }
    }
}
