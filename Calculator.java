import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose an operation: 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division");
        int choice = scanner.nextInt();
        
        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        switch (choice) {
            case 1:
                int sum = num1 + num2;
                System.out.println("The sum is: " + sum);
                break;
            case 2:
                int difference = num1 - num2;
                System.out.println("The difference is: " + difference);
                break;
            case 3:
                int product = num1 * num2;
                System.out.println("The product is: " + product);
                break;
            case 4:
                if (num2 != 0) {
                    int quotient = num1 / num2;
                    System.out.println("The quotient is: " + quotient);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
