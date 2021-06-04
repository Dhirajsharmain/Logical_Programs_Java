package bridgelabz;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal value : ");
        int userInput = scanner.nextInt();
        toBinary(userInput);
    }

    public static void toBinary(int decimal) {
        int[] binary = new int[40];
        int index = 0;
        System.out.print(decimal+" In Binary : ");
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal /= 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}
