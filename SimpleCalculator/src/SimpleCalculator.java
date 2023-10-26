import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        do {
            // Prompt user for two numbers
            System.out.print("Enter first number: ");
            double num1 = getValidNumber(scanner);

            System.out.print("Enter second number: ");
            double num2 = getValidNumber(scanner);

            // Perform operations
            double sum = add(num1, num2);
            double difference = subtract(num1, num2);
            double product = multiply(num1, num2);
            double quotient = divide(num1, num2);

            // Display results
            System.out.println("\nResults:");
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);

            System.out.print("\nDo you want to perform another calculation? (Y/N): ");
            String input = scanner.next();

            continueCalculating = input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes");
        } while (continueCalculating);
    }

    // Method to ensure user enters a valid number
    public static double getValidNumber(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextDouble();
    }

    // Method to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero.");
            return Double.NaN; // Not a Number
        }
    }
}
