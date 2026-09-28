public class BasicCalculator {

    public double calculate(double firstNumber, char operator, double secondNumber) {

        double result;

        switch (operator) {

            case '+':
                result = firstNumber + secondNumber;
                break;

            case '-':
                result = firstNumber - secondNumber;
                break;

            case '*':
                result = firstNumber * secondNumber;
                break;

            case '/':
                if (secondNumber == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return 0;
                }

                result = firstNumber / secondNumber;
                break;

            default:
                System.out.println("Error: Invalid operator.");
                return 0;
        }

        return result;
    }
}