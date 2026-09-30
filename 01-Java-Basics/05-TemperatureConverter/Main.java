import java.util.Scanner;

public class Main {

    public static double convertTemperature(double temperature, char unit) {

        if (unit == 'F' || unit == 'f') {
            return (temperature * 9 / 5) + 32;
        }

        if (unit == 'C' || unit == 'c') {
            return (temperature - 32) * 5 / 9;
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Convert to (C/F): ");
        char unit = scanner.next().charAt(0);

        double result = convertTemperature(temperature, unit);

        if (unit == 'F' || unit == 'f') {
            System.out.println("Temperature in Fahrenheit: " + result + "°F");
        } else if (unit == 'C' || unit == 'c') {
            System.out.println("Temperature in Celsius: " + result + "°C");
        } else {
            System.out.println("Invalid conversion unit.");
        }

        scanner.close();
    }
}