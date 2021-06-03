package bridgelabz;

import bridgelabz.utility.LogicalUtility;

import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LogicalUtility utility = new LogicalUtility();
        System.out.print("Enter number for generating coupon numbers : ");
        int range = scanner.nextInt();
        int count = utility.distinctCoupon(range);
        System.out.println(count + " times loop runs for finding distinct");


    }
}
