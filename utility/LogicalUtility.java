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

    public int dayOfWeek(int day, int month, int year) {
        int y1, x, m, weekDay;
        y1 = year - (14 - month) / 12;
        x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
        m = month + 12 * ((14 - month) / 12) - 2;
        weekDay = (day + x + 31 * m / 12) % 7;
        return weekDay;
    }

    public void elapsedTime(long startTime, long endTime) {
        long temp = endTime - startTime;
        System.out.println("Elapsed Time is : " + temp);
    }

    public double FahrenheitToCelsius(double temperatureInFahrenheit) {
        double temperatureInCelsius;
        temperatureInCelsius = ((temperatureInFahrenheit - 32) * 5) / 9;
        return temperatureInCelsius;
    }

    public double CelsiusToFahrenheit(double temperatureInCelsius) {
        double temperatureInFahrenheit;
        temperatureInFahrenheit = ((temperatureInCelsius * 9) / 5) + 32;
        return temperatureInFahrenheit;
    }

}
