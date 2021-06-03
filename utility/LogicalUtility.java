package bridgelabz.utility;

public class LogicalUtility {

    public int randomNumber(int range) {

        return (int) (Math.random() * range);
    }

    public int distinctCoupon(int range) {
        boolean[] arr = new boolean[range];
        int count = 0;
        int distinct = 0;
        while (distinct < range) {
            int value = randomNumber(range);
            if (!arr[value]) {
                distinct++;
                arr[value] = true;
            }
            count++;
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" Code : " + i + "\n");
        }
        return count;

    }
}
