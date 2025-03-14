import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String operation =  userInteraction(scanner, "What is the operation? (+, -, *, /)");
            float num1 = userInteraction("What is the first number?", scanner);
            float num2 = userInteraction("What is the first number?", scanner);
            evaluateOperation(operation, num1, num2);
            if (!threadContinue(scanner)) break;
        }
    }
    private static String userInteraction(Scanner scanner, String question) {
        System.out.println(question);
        return scanner.next();
    }
    private static float userInteraction(String question, Scanner scanner) {
        System.out.println(question);
        return scanner.nextFloat();
    }
    private static boolean userInteraction(Scanner scanner, String question, String expected) {
        System.out.println(question);
        return scanner.next().equalsIgnoreCase(expected);
    }

    // Continuing method
    private static boolean threadContinue(Scanner scanner) {
        return userInteraction(scanner, "\nDo you want to calculate something else? y/n", "y");
    }

    private static float sum(float x, float y) {
        return x + y;
    }
    private static float difference(float x, float y) {
        return x - y;
    }
    private static float product(float x, float y) {
        return x * y;
    }
    private static Object quotient(float x, float y) {
        if (y == 0f) {
            System.out.println("ERROR: You can't divide a number by 0");
            return "ERROR";
        }
         return x / y;
    }

    // Evaluation method
    public static void evaluateOperation(String operation, float x, float y) {
        Object result;
        switch (operation.toLowerCase()) {
            case "+", "plus", "add": result = sum(x, y); break;
            case "-", "minus", "subtract": result = difference(x, y); break;
            case "*", "multiply": result = product(x, y); break;
            case "/", "divide": result = quotient(x, y); break;
            default: System.out.println("ERROR: Operation " + operation + " is not a valid operation" ); result = "ERROR";
        }
        System.out.println("Result of operation: " + x + " " + operation + " " + y + " is " + result + ".");
    }
}
