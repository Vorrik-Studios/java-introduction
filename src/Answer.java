import java.util.Scanner;

public class Answer {

    // This does not have to be the exact same as your answer so long as yours works

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What operation should i use? (+, -, /, *)");
            String operation = scanner.next();
            System.out.println("1st Number");
            float num1 = scanner.nextFloat();
            System.out.println("2nd Number");
            float num2 = scanner.nextFloat();

            // Do the calculations

            String result;

            switch (operation) {
                case "plus", "+":
                    result = "Result: " + (num1 + num2);
                    break;
                case "minus", "-":
                    result = "Result: " + (num1 - num2);
                    break;
                case "divide", "/":
                    result = "Result: " + (num1 / num2);
                    break;
                case "multiply", "*":
                    result = "Result: " + (num1 * num2);
                    break;
                default:
                    result = "ERROR: Invalid operation: " + operation;
                    break;
            }
            System.out.println("Calculating " + num1 + " " + operation + " " + num2);
            System.out.println(result);

            System.out.println("\nDo you with to calculate something else? y/n");
            if(!scanner.next().equals("y")) {
                System.out.println("Exiting Calculator");
                break;
            }
        }
    }
}
