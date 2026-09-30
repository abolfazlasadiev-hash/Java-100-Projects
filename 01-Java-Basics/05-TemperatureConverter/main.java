import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TemperatureConverter converter = new TemperatureConverter();

        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Convert to (C/F): ");
        char unit = scanner.next().charAt(0);

        try {

            double result = converter.convert(temperature, unit);

            if (Character.toUpperCase(unit) == 'F') {
                System.out.println(
                    "Temperature in Fahrenheit: " + result + "°F"
                );
            } else {
                System.out.println(
                    "Temperature in Celsius: " + result + "°C"
                );
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}