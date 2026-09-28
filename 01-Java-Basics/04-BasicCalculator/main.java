import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        BasicCalculator calculator = new BasicCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        double result = calculator.calculate(firstNumber, operator, secondNumber);

        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);

        scanner.close();
    }
}