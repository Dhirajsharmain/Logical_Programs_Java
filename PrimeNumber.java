package bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check weather it is prime or not : ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.print(num + " is a prime number");
        } else {
            System.out.print(num + " is not a prime number");
        }
    }

    private static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
