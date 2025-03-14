package answer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose operation:");
            System.out.println("plus or + for Addition");
            System.out.println("minus or - for Subtraction");
            System.out.println("multiply or * for Multiplication");
            System.out.println("divide or / for Division");

            System.out.println("Enter the operation: ");
            String choice = scanner.nextLine();

            Operation selectedOperation = null;
            switch (choice.toLowerCase()) {
                case "plus", "+":
                    selectedOperation = new Addition();
                    break;
                case "minus", "-":
                    selectedOperation = new Subtraction();
                    break;
                case "multply", "*":
                    selectedOperation = new Multiplication();
                    break;
                case "divide", "/":
                    selectedOperation = new Division();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            Calculator calculator;
            if (selectedOperation != null) {
                calculator = new Calculator(selectedOperation);

                System.out.println("Enter First number: ");
                float firstNumber = scanner.nextFloat();

                System.out.println("Enter First number: ");
                float secondNumber = scanner.nextFloat();

                float result = calculator.calculate(firstNumber, secondNumber);
                System.out.println(calculator.getOperationString() + " = " + result);
            }

            System.out.println("Would you like to calculate more? y/n");
            if (!scanner.nextLine().equalsIgnoreCase("y")) { break; }
        }
    }
}
