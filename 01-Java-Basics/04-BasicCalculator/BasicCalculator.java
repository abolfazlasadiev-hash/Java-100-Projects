import java.util.Scanner;

public class BasicCalculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    double firsNumber = scanner.nextDouble();

    System.out.print("Enter an opretor (+, -, *. / ): ");
    char operator = scanner.next().charAt(0);

    System.out.print("Enter secondNumber number: ");
    double secondNumber = scanner.nextDouble();

    double result;

    switch (operator) {
      case '+':
        result = firsNumber + secondNumber;
        break;

      case '-':
        result = firsNumber + secondNumber;
        break;

      case '*':
        result = firsNumber * secondNumber;
        break;

      case '/':
        if (secondNumber == 0) {
          System.out.println("Error: Cannot divide by zero.");
          scanner.close();
          return;

        }
        result = firsNumber / secondNumber;
        break;
        default:
          System.out.println("Error: Invalid operator.");
          scanner.close();
          return;
    }
    System.out.println("Result: " + result);

    scanner.close();
  }
}