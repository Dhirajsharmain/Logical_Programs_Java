package bridgelabz;

import bridgelabz.utility.LogicalUtility;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        LogicalUtility utility = new LogicalUtility();
        double temperatureInFerenheit, temperatureInCelcius;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 For Fahrenheit to Celcius and 2 for Celsius to Fahrenheit : ");
        int check = scanner.nextInt();

        if (check == 1) {
            System.out.print("Enter Temperature in Ferenheit : ");
            temperatureInFerenheit = scanner.nextDouble();
            temperatureInCelcius = utility.FahrenheitToCelsius(temperatureInFerenheit);
            System.out.println("Fahrenheit to Celcius of " + temperatureInFerenheit + " is " + temperatureInCelcius);
        } else if (check == 2) {
            System.out.print("Enter Temperature in Celsius : ");
            temperatureInCelcius = scanner.nextDouble();
            temperatureInFerenheit = utility.CelsiusToFahrenheit(temperatureInCelcius);
            System.out.println("Celsius to Fahrenheit of " + temperatureInCelcius + " is " + temperatureInFerenheit);
            scanner.close();
        } else {
            System.out.println("please select correct option");
        }
    }
}
