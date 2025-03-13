import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* INPUT & OUTPUT */

        /* OUTPUT */
        // Outputting a string
        System.out.println("Hello, this is outputting a string to the terminal in Java.");

        // Outputting an integer
        int outputThis = 42;
        System.out.println(outputThis); // Outputs the value of outputThis which in this case is an integer of 42

        // Output with string and integer
        int grade = 80;
        System.out.println("Your grade is " + grade); // Outputs Your grade is 80

        /* INPUT */
        // Create a new Scanner
        Scanner scanner = new Scanner(System.in);
        // Use the scanner to get the next thing the user types
        int number = scanner.nextInt(); // Try typing a string what do you notice?
        // Output what the user types
        System.out.println("You just typed " + number);

        // If you want to be able to take in any data from the scanner and NOT error then
        scanner.nextLine(); // So that both the number scanner and this one can run
        String input = scanner.nextLine();
        // Output the input
        System.out.println("You now just typed " + input);
    }
}