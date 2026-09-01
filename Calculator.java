import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;
        int choice;
        
        System.out.println("===== SIMPLE CALCULATOR =====");
        
        while (true) {
            System.out.println("\n1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose (1-5): ");
            choice = input.nextInt();
            
            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }
            
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice!");
                continue;
            }
            
            System.out.print("Enter first number: ");
            num1 = input.nextDouble();
            System.out.print("Enter second number: ");
            num2 = input.nextDouble();
            
            if (choice == 1) {
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
            } else if (choice == 2) {
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
            } else if (choice == 3) {
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
            } else if (choice == 4) {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
            }
        }
        input.close();
    }
}