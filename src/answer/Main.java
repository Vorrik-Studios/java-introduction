package answer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Choose operation:");
            System.out.println("plus or + for Addition");
            System.out.println("minus or - for Subtraction");
            System.out.println("multiply or * for Multiplication");
            System.out.println("divide or / for Division");

            System.out.print("Enter the operation: ");
            String choice = scanner.nextLine();

            IOperation selectedOperation = null;
            switch (choice.toLowerCase()) {
                case "plus", "+":
                    selectedOperation = new Addition();
                    break;
                case "minus", "-":
                    selectedOperation = new Subtraction();
                    break;
                case "multiply", "*":
                    selectedOperation = new Multiplication();
                    break;
                case "divide", "/":
                    selectedOperation = new Division();
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            Calculator calculator;
            if (selectedOperation != null) {
                calculator = new Calculator(selectedOperation);

                System.out.print("Enter First Number: ");
                int firstNumber = scanner.nextInt();

                System.out.print("Enter Second Number: ");
                int secondNumber = scanner.nextInt();

                int result = calculator.calculate(firstNumber, secondNumber);
                System.out.println(calculator.getOperationString() + " = " + result);
            }

            System.out.println("\nWould you like to calculate more? y/n");
            if (!scanner.next().equalsIgnoreCase("y")) {
                scanner.nextLine();
                selectedOperation = null;
                break;
            }
            scanner.nextLine();
        }
    }
}
