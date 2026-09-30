import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static int calculateAge(LocalDate birthDate) {

        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        return age.getYears();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth date (YYYY-MM-DD): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());

        int age = calculateAge(birthDate);

        System.out.println("Your age is: " + age);

        scanner.close();
    }
}