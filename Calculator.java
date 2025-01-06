import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose an operation: 1 for Addition, 2 for Subtraction");
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
            default:
                System.out.println("Invalid choice.");
        }
    }
}
