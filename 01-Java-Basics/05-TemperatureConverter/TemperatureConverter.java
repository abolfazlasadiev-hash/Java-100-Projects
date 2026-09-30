public class TemperatureConverter {

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double convert(double temperature, char unit) {

        switch (Character.toUpperCase(unit)) {
            case 'C':
                return celsiusToFahrenheit(temperature);

            case 'F':
                return fahrenheitToCelsius(temperature);

            default:
                throw new IllegalArgumentException(
                    "Invalid conversion unit. Use C or F."
                );
        }
    }
}